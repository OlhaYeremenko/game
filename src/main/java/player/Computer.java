package player;

import game.Game;
import game.GameHandler;

import java.util.ArrayList;

public class Computer extends Player {


	public char makeMove(char charInCity) {

		String city = GameHandler.findInArray(charInCity);
		if (city != null) {
			charInCity = GameHandler.getLast(city);
			System.out.println(city);
			Game.cities.remove(city);
		} else {
			  Game.winner="You"; 
			return 0;
		}
		return charInCity;
	}

}
