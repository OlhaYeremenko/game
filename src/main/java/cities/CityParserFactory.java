package cities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ResourceBundle;

import cities.parsers.AbstractParser;
import cities.parsers.CityParserDB;
import cities.parsers.CityParserEXCEL;
import cities.parsers.CityParserJSON;
import cities.parsers.CityParserTXT;
import cities.parsers.CityParserXML;

public class CityParserFactory {


	public AbstractParser createCitiesBuilder() throws FileNotFoundException {
	ResourceBundle resource= ResourceBundle.getBundle("database");
	String file= resource.getString("path");
		switch (getFileExtention(file)) {
		case "sql":
			return new CityParserDB();
		case "xls":
			return new CityParserEXCEL();
		case "json":
			return new CityParserJSON();
		case "xml":
			return new CityParserXML();
		case "txt":
			return new CityParserTXT();
		default:
			throw new FileNotFoundException();
		}
	}

	public static String getFileExtention(String fullPath) {
		int sepPos = fullPath.lastIndexOf(File.separator);
		String nameAndExt = fullPath.substring(sepPos + 1, fullPath.length());
		int dotPos = nameAndExt.lastIndexOf(".");
		return dotPos != -1 ? nameAndExt.substring(dotPos + 1) : "";
	}
}
