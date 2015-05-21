package cities.parsers;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

import cities.parsers.connect.ConnectorDB;

public class CityParserDB extends AbstractParser {

	@Override
	public void cityParse()  {
		final String SQL_SELECT_ALL_CITIES = "SELECT name FROM City";
		Connection cn = null;
		Statement st =null;
		try {
			cn = ConnectorDB.getConnection();
			st = cn.createStatement();
			ResultSet rs =  st.executeQuery(SQL_SELECT_ALL_CITIES);
			while (rs.next()) {
		
				cities.add(rs.getString(1).toUpperCase());
			}
		} catch (SQLException e) {
			
			System.err.println("SQL Exeption. Ќе удалось подсоеденитьс€ к базе данных" + e);
		}

		
	}





	
	
}
