package player;

import game.Game;
import game.GameHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Human extends Player {
public String name;


	public Human(String name) {
		setName(name);
}
	private static final Logger LOGGER_INFO = Logger.getLogger(Game.class);
    private static final Logger LOGGER_ERR = Logger.getLogger(Game.class);
    
	@Override
	public void makeMove() {

			System.out.println(this.name+" :");
			BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

			String word=null;
			try {
				word = bf.readLine().toUpperCase();
			} catch (IOException e) {
				LOGGER_ERR.info(" Пустой массив! "+e.getMessage());
				System.out.println("Пустой массив!");
			}
			if (word.compareToIgnoreCase("Exit") == 0) {
				lastChar=0;
				Game.looserOfGame=name;
			}
			else if (gameHandler.checkInArray(word)) {
				LOGGER_INFO.info("Игрок "+ this.name+" ввел слово "+word);
				lastChar = gameHandler.getLastChar(word);
				Game.citiesOfGame.remove(word);
			}
			else{
				lastChar=0;
				System.out.println("Пробуй еще раз!");
				this.makeMove();
			}
	
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	}
	
	


