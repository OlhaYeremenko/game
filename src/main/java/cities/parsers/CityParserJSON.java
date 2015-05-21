package cities.parsers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.ResourceBundle;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.xml.sax.SAXException;

import bsh.ParseException;

public class CityParserJSON extends AbstractParser {

	@Override

	public void cityParse() {
		
		ResourceBundle resource= ResourceBundle.getBundle("database");
		String fileName= resource.getString("path");
		
		try {
			FileReader reader = new FileReader(fileName);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject;
			try {
				jsonObject = (JSONObject) jsonParser.parse(reader);
		
			JSONArray citiesArr = (JSONArray) jsonObject.get("City");
			System.out.println("");
				for (int i = 0; i < citiesArr.size(); i++) {
					String city = (String) citiesArr.get(i);
					cities.add(city.toUpperCase());

				}
			} catch (org.json.simple.parser.ParseException e) {
				System.out.println("Не удалось считать файл.");
			}
			} catch (IOException ex) {
				System.out.println("Не удалось открыть файл.");
			}

	}
}
