package cities.parsers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

public class CityParserTXT extends AbstractParser {

	@Override
	public void cityParse() {

		try {
			ResourceBundle resource = ResourceBundle.getBundle("database");
			String fileName = resource.getString("path");
			Scanner read = new Scanner(new File("cities.txt"));
			while (read.hasNextLine()) {
				cities.add(read.nextLine().toUpperCase());
			}
			read.close();
		} catch (FileNotFoundException e) {
			System.out.println("Не удалось найти  файл.");

		} catch (IOException e) {
			System.out.println("Не удалось открыть файл.");
		}
	}

}
