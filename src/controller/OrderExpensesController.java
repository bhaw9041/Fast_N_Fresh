package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import model.DatabaseConnector;

public class OrderExpensesController extends ProductBaseController {

	@FXML
	BarChart barChart;
	@FXML
	private CategoryAxis xAxis;
	@FXML
	private NumberAxis yAxis;

	@FXML
	void goToCatalog(ActionEvent event) {
		ScreenController.goToCatalogPage(event);
	}

	// private XYChart.Series<String, Integer> series1;

	public void initialize() {

		Map<String, Double> orderHistory = new HashMap<String, Double>();
		try {
			Connection conn = DatabaseConnector.getInstance();
			Statement st = conn.createStatement();
			String query = "select purchasedPrice, order_timestamp from user_order_history where user_name = '" + userId
					+ "'";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				// Use the HashMap
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		XYChart.Series series1 = new XYChart.Series();
		for (String s : orderHistory.keySet()) {
			series1.getData().add(new XYChart.Data(s, orderHistory.get(s)));
		}
//		series1.getData().add(new XYChart.Data("brazil", 10));

		// number is order amount and
		// asutralia means date

		barChart.getData().addAll(series1);

	}
}
