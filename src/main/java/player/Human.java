package player;

import game.Game;
import game.GameHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Human extends Player {

	// private static ArrayList<String> cities=;
	// private static char lastChar;

	/*
	 * public static void main(String[] args) {
	 * 
	 * citiesq = new ArrayList<String>(); citiesq.add("Сумы");
	 * citiesq.add("Харьков"); System.out.println(checkWord("Сумы"));
	 * System.out.println(getLast(" сумы"));
	 * System.out.println(getFirst("сумы"));
	 * System.out.println(getLast("Харьков")); makeMove1("Харьков");
	 * System.out.println(lastChar);
	 * 
	 * 
	 * }
	 */

	/*
	 * public char makeMove(char charInCity) {
	 * 
	 * String city = GameHandler.findInArray(charInCity); if (city != null) {
	 * charInCity = GameHandler.getLast(city); System.out.println(city);
	 * citiesq.remove(city); } else { System.out.println("There is no words ");
	 * } return charInCity; }
	 */

	public char makeMove(char charInCity) {
		System.out.println("Твой ход:");
		Scanner sr = new Scanner(System.in);
		String word = sr.nextLine();
		if (word.compareToIgnoreCase("exit") == 1) {
        Game.winner="Computer";   
			return 0;
		}

		else if (GameHandler.checkInArray(word)) {
			charInCity = GameHandler.getLast(word);
		//	System.out.println(word);
			Game.cities.remove(word);
		}
		return charInCity;
	}
}
