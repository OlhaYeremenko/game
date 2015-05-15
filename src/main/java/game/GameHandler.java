package game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

import cities.CityParserFactory;
import cities.parsers.AbstractParser;

public class GameHandler {

//	private static ArrayList<String> cities=getCityList();

	public static char getFirst(String word) {
		return word.charAt(0);
	}

	public static char getLast(String word) {
		if (word.charAt(word.length() - 1) == "û".charAt(0)
				|| word.charAt(word.length() - 1) == "ü".charAt(0)) {
			return word.charAt(word.length() - 2);
		}

		return word.charAt(word.length() - 1);
	}

	public static boolean checkInArray(String word) {
		if (Game.cities.contains(word)) {
			return true;
		}
		return false;
	}

	public static String findInArray(char firstChar) {
		for (String city : Game.cities) {
			if (Character.toUpperCase(getFirst(city)) == Character
					.toUpperCase(firstChar)) {
				return city;
			}
		}
		return null;

	}
	static  ArrayList<String> getCityList(){
		CityParserFactory cFactory = new CityParserFactory();
		AbstractParser parser = cFactory.createCitiesBuilder("EXCEL");
		try {
			parser.cityParse("city");
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parser.getCities();
		
	}

	public static char firstStep() throws JDOMException, IOException,
		ParserConfigurationException, SAXException {	
		Random random = new Random();
		int index = random.nextInt(Game.cities.size());
		System.out.println(Game.cities.get(index).toString());
		Game.cities.remove(Game.cities.get(index));
		return getLast(Game.cities.get(index));
	}

	/*
	 * public void makeMove() { String city =findInArray(lastChar); if (city !=
	 * null) { lastChar = getLast(city); System.out.println(city);
	 * citiesq.remove(city); } else { System.out.println("There is no words ");
	 * }
	 * 
	 * }
	 * 
	 * 
	 * public void makeMove(String word) { if (checkInArray(word)) { lastChar =
	 * getLast(word); System.out.println(word); citiesq.remove(word); }
	 */

	// }

}
