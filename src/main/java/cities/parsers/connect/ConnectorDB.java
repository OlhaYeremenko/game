package cities.parsers.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorDB {
	public static Connection getConnection() {
		ResourceBundle resource= ResourceBundle.getBundle("database");
		
		String url= resource.getString("db.url");
		String user=resource.getString("db.user");
		String pass=resource.getString("db.password");
		try {
			return DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			
			System.out.println("Connection  to DB failed");
		}
		return null;
	}
	

}

