package cities.parsers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

public abstract class AbstractParser {
	
	protected ArrayList<String> cities;
	
	public AbstractParser(ArrayList<String> cities){
		this.cities= cities;
	}
	
	public AbstractParser() {
		cities = new ArrayList<String>();
	}

public ArrayList<String> getCities(){
	
	return cities;
}

abstract public void cityParse(String fileName) throws JDOMException,
IOException, ParserConfigurationException, SAXException;
}
//JAXBException
