package game;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;


public class Runner {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		   TestNG testng = new TestNG();
	        for (XmlSuite suite : new Parser("TestNg.xml").parseToList()) {
	            testng.setCommandLineSuite(suite);
	        }
	        testng.run();

	}

}
