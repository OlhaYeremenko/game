package cities.parsers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ResourceBundle;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CityParserXML extends AbstractParser {

	@Override
	public void cityParse() {
		
		ResourceBundle resource= ResourceBundle.getBundle("database");
		String filePath= resource.getString("path");
		File file = new File(filePath);
		Document document = null;
		DocumentBuilder documentBuilder = null;
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
				.newInstance();

		try {
			documentBuilder = documentBuilderFactory
					.newDocumentBuilder();
			document = documentBuilder.parse(file);
		} catch (SAXException | IOException e) {
			 System.out.println("Не удалось считать файл");
		}
		 catch (ParserConfigurationException e) {
			 System.out.println("Не удалось считать файл");
			 		}
		document.getDocumentElement().normalize();
		NodeList nodeOfCities = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());	
		  int length = nodeOfCities.getLength();     
	      for (int n = 0; n < length; ++n){
	         cities.add(nodeOfCities.item(n).getChildNodes().item(0).getNodeValue().toUpperCase());
	      }

		}

	}

