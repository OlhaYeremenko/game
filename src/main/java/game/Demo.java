package game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

import player.Human;

public class Demo {
	private static final Logger LOGGER_INFO = Logger.getLogger(Game.class);
    private static final Logger LOGGER_ERR = Logger.getLogger(Game.class);
    
	public static void main(String[] args) {

			// if (numberOfPlayers > 0) {
			Game game = new Game();
			game.start();
			game.play();
	
	}
}
