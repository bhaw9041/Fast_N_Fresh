package model;

import java.sql.*;

import constants.DatabaseUserConstants;

public class DatabaseConnector {

	private static Connection databaseConnection = null;
	
	private static Statement st; 

	private DatabaseConnector() {
	}

	public static Connection getInstance() throws Exception {
		if (databaseConnection == null) {
			synchronized (DatabaseConnector.class) {
				if (databaseConnection == null) {
					Class.forName("com.mysql.jdbc.Driver");
					databaseConnection = DriverManager.getConnection(DatabaseUserConstants.url,
							DatabaseUserConstants.username, DatabaseUserConstants.password);
				}
			}
		}
		return databaseConnection;
	}

	public static ResultSet getItemsFromCatalog(String catalogId) {
		try {
			Connection conn = DatabaseConnector.getInstance();
			st = conn.createStatement();
			String query = "select productId, productName, productPrice, productQuantity, catalog from product_list where catalog = '"
					+ catalogId + "'";
			ResultSet rs = st.executeQuery(query);
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void closeStatement() {
		try {
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
