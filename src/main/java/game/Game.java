package game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

import player.Computer;
import player.Human;
import player.Player;
import cities.CityParserFactory;
import cities.parsers.AbstractParser;
import cities.parsers.CityParserEXCEL;

public class Game {
	public static String winner;
	public static ArrayList<String> cities;
	public void start() throws JDOMException, IOException,
			ParserConfigurationException, SAXException {

		System.out.println("game started");
		 cities = GameHandler.getCityList();
		Player h = new Human();
		Player c = new Computer();
		char charInCity = GameHandler.firstStep();
		while (charInCity != 0) {
			charInCity = h.makeMove(charInCity);			
			//if(charInCity ==0){
			while (charInCity == 0){
				System.out.println("try again");
			}
			charInCity = c.makeMove(charInCity);
			if(charInCity ==0){
				winner="You!";
				break;
			}
		}
		end();
	}

	public static void end() {
		System.out.println("game is end");
		System.out.println("winner : "+ winner);

	}

}
