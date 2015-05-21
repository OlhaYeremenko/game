package game;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import static org.easymock.EasyMock.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import player.Human;
import player.Player;
import cities.parsers.CityParserDB;

public class GameHandlerTest {
	private static final Logger LOGGER_INFO = Logger.getLogger(GameHandlerTest.class);
    private static final Logger LOGGER_ERR = Logger.getLogger(GameHandlerTest.class);
    
	Player player;
	GameHandler mock;
	GameHandler gameHandler;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider(name = "testCityListProvider")
	public Object[][] testCityListProvider() {
		return new Object[][] { new Object[] { "харьков", 'в', 'х' },
				new Object[] { "сумы", 'м', 'с' },
				new Object[] { "ахтырка", 'а', 'а' } };
	}

	@BeforeClass
	public void beforeClass() {
		player = new Human("playerTest");

	}

	@AfterClass
	public void afterClass() {
		player = null;
		mock = null;
		gameHandler = null;
	}

	@Test(dataProvider = "testCityListProvider")
	public void getLastTest(String word, char lchar, char fchar) {
		char expectedResult = lchar;
		char actualResult = gameHandler.getLastChar(word);
		Assert.assertEquals(expectedResult, actualResult);
		LOGGER_INFO.info("assertion for geting last char in word is sucsess!" );

	}

	@Test(dataProvider = "testCityListProvider")
	public void getFirstTest(String word, char lchar, char fchar) {
		char expectedResult = fchar;
		char actualResult = gameHandler.getFirstChar(word);
		Assert.assertTrue(expectedResult == actualResult);
		LOGGER_INFO.info("assertion for geting first char in word is sucsess!" );
	
	}



	@AfterTest
	public void afterTest() {

	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {

	}

}
