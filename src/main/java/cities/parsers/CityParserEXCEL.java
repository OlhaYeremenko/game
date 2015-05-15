package cities.parsers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

public class CityParserEXCEL  extends AbstractParser  {

	@Override
	public void cityParse(String fileName) throws JDOMException, IOException,
		ParserConfigurationException, SAXException {
		List<String> c = new ArrayList<String>();
		c=Arrays.asList("Киев","Винница","Ахтырка","Астрахань","Николав","Кировоград","Дн");
		cities.addAll(c);		
	}

}
