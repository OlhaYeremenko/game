package game;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import cities.CityParserFactory;
import cities.parsers.AbstractParser;

public interface IGameHandler {
	
	public  char getFirstChar(String word) ;

	public  char getLastChar(String word);

	public boolean checkInArray(String word) ;

	public  String findInArray(char charInWord) ;

	public ArrayList<String> getCityList() ;

	public  char firstStep() ; 
}
