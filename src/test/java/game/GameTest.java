package game;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.apache.log4j.Logger;
import static org.easymock.EasyMock.*;

public class GameTest {
	
	
	GameHandler mock;
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


  @Test
  public void test() {
	  
//	  int testPlayersNumber=1;
//	  Game  g = new Game(testPlayersNumber);
//	  g.start();
//	 mock = createMock(GameHandler.class);
//	 expect(mock.firstStep()).andReturn('a');
//	 replay(mock);
//	 
//	 assertThat(player.makeMove(c), instanceOf(Word.class));
	  /*
		 * mock = createMock(GameHandler.class);
		 * 
		 * char c=
		 * expect(mock.getLast("Харьков")).andReturn('p').toString().charAt(0);
		 * // EasyMock.expectLastCall(); replay(mock);
		 * 
		 * assertThat(player.makeMove(c), instanceOf(Word.class));
		 * assertThat(user.makeAMove(mock).getWord(), is("String"));
		 * 
		 * verify(mock);
		 */
		// Assert.assertTrue("not empty list",Game.citiesOfGame.size()!=0);
	  
	  
  }


@BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
  
  @AfterClass
  public void afterClass() {
  }
}
