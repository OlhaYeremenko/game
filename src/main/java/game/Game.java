package game;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import player.Computer;
import player.Human;
import player.Player;

public class Game implements IGame {

	public static String looserOfGame;
	public static List<String> citiesOfGame;
	private int nPlayers = 0;
	private List<Human> players;
	private Player computer;
	private GameHandler gh;

	private static final Logger LOGGER_INFO = Logger.getLogger(Game.class);
	private static final Logger LOGGER_ERR = Logger.getLogger(Game.class);

	@Override
	public void start() {
		System.out.println("Введите колличество игроков");
		Scanner sr = new Scanner(System.in);
		try {
			nPlayers = sr.nextInt();
			if (nPlayers >= 0) {
				LOGGER_INFO.info("Игра стартовала!");
				computer = new Computer();
				players = new ArrayList<Human>();
				if (citiesOfGame.size() != 0) {
					for (int i = 0; i < nPlayers; i++) {
						players.add(new Human("palyer " + i));
						LOGGER_INFO.info("Добавление игрока" + players.get(i));
					}
				}
				Player.lastChar = gh.firstStep();
			}
		} catch (InputMismatchException ex) {
			LOGGER_ERR.info("Hеправильно введенное число игроков!");
			System.out.println("Hеправильно введенное число игроков!\n");
			this.start();
		}
	}

	@Override
	public void play() {
		while (Player.lastChar != 0) {
			for (Human p : players) {
				p.makeMove();
				if (Player.lastChar == 0) {
					looserOfGame = p.name;
					break;
				}
			}
			if (Player.lastChar != 0) {
				computer.makeMove();
			} else
				break;
		}
		end();
	}

	@Override
	public void end() {
		System.out.println("GAME OVER!");
		LOGGER_INFO.info("Игра закончилась, проиграл" + looserOfGame);
		System.out.println("looser : " + looserOfGame);
	}

	public Game() {
		gh = new GameHandler();
		citiesOfGame = gh.getCityList();
	}

}
