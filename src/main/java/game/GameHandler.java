package game;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

import cities.CityParserFactory;
import cities.parsers.AbstractParser;

public class GameHandler implements IGameHandler {

	@Override
	public char getFirstChar(String word) {
		return word.charAt(0);
	}

	@Override
	public char getLastChar(String word) {
		if (word.charAt(word.length() - 1) == 'Û'
				|| word.charAt(word.length() - 1) == 'Ü') {
			return word.charAt(word.length() - 2);
		}
		return word.charAt(word.length() - 1);
	}

	@Override
	public boolean checkInArray(String word) {
		if (Game.citiesOfGame.contains(word)) {
			return true;
		}
		return false;
	}
	

	@Override
	public String findInArray(char charInWord) {
		for (String city : Game.citiesOfGame) {
			if (this.getFirstChar(city)== charInWord) {
				return city;
			}
		}
		return null;
	}	

	@Override
	public ArrayList<String> getCityList() {
		CityParserFactory cFactory = new CityParserFactory();
		AbstractParser parser = null;
		try {
			parser = cFactory.createCitiesBuilder();
			parser.cityParse();
			Collections.shuffle(parser.getCities());
			return parser.getCities();
		} catch (FileNotFoundException e) {		
			System.out.println("Data file not found");
		}
		return null;
	}

	@Override
	public char firstStep() {
			Random random = new Random();
			int index = random.nextInt(Game.citiesOfGame.size());
			System.out.println(Game.citiesOfGame.get(index).toString());
			char lstChar = this.getLastChar(Game.citiesOfGame.get(index));
			Game.citiesOfGame.remove(Game.citiesOfGame.get(index));
			return lstChar;
		}
	}




