package model;

import java.sql.*;

public class DatabaseConnector {
	
	private static Connection databaseConnection = null;
	
	private DatabaseConnector(){
	}
	
	public static Connection getInstance() throws Exception {
		if (databaseConnection == null) {
			String url = "jdbc:mysql://localhost:3306/FastNFresh";
			String username = "root";
			String password = "mymy14.mymy";
			Class.forName("com.mysql.jdbc.Driver");
			databaseConnection = DriverManager.getConnection(url, username, password);
			return databaseConnection;
		} else {
			return databaseConnection;
		}
		
	}
	
	
}
