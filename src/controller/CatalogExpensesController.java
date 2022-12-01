package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import model.DatabaseConnector;
import model.Product;

public class CatalogExpensesController extends ProductBaseController {
	
	@FXML PieChart catalogData;
	
	public void initialize() {
		
		int fruitShare;
		int vegShare;
		int snackShare;
		int beverageShare;
		int dairyShare;
		int meatShare;
		
		try {
			Connection conn = DatabaseConnector.getInstance();
			Statement st = conn.createStatement();
			String query = "select purchasedPrice, catalog from user_order_history where user_name = '" + userId +"'";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
			//	switch(rs.getString(2)):
			//		case "Fruits" :
						// use rs.getString(1); to get the price
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ObservableList<PieChart.Data> pieChartData =
	            FXCollections.observableArrayList(
	            new PieChart.Data("Fruits", 40),
	            new PieChart.Data("Vegetables", 30),
	            new PieChart.Data("Snacks", 15),
	            new PieChart.Data("Beverages", 10),
	            new PieChart.Data("Dairy", 5),
				new PieChart.Data("Meat", 0));

		catalogData.setData(pieChartData);
	}

}
