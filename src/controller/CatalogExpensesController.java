package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class CatalogExpensesController {
	
	@FXML PieChart catalogData;
	
	public void initialize() {
		
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
