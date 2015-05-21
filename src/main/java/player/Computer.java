package player;

import game.Game;
import game.GameHandler;

import java.util.ArrayList;

public class Computer extends Player {

	@Override
	public void makeMove() {

		String city = gameHandler.findInArray(lastChar);
		if (city != null) {
			lastChar = gameHandler.getLastChar(city);
		    System.out.println("Computer :\n"+city);
			Game.citiesOfGame.remove(city);
		} else {
			  lastChar=0;
			 Game.looserOfGame="computer"; 
		}	
	}

}
