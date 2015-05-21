package cities.parsers;


import game.Game;
import game.GameHandler;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ParserTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void parserTest() {
	/*	 CityParserDB mockDB = EasyMock.createMock(CityParserDB.class);
		 ArrayList<String> testData = new ArrayList<String>();
		 testData.add("харьков");
		 EasyMock.expect(mockDB.getCities()).andReturn(testData);
		 EasyMock.expectLastCall();
		 EasyMock.replay(mockDB);
	  	Assert.assertNotNull(Game.cities);*/

	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
