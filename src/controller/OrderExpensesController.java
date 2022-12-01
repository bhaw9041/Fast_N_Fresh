package controller;

import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;


public class OrderExpensesController {

	@FXML BarChart barChart;
	@FXML
	private CategoryAxis xAxis;
	@FXML
	private NumberAxis yAxis;

	
	//private  XYChart.Series<String, Integer> series1;
	
	public void initialize() {
			

		XYChart.Series series1 = new XYChart.Series();      
        series1.getData().add(new XYChart.Data("austria", 5));
        series1.getData().add(new XYChart.Data("brazil", 10));
      
        // number is order amount and 
        // asutralia means date
        
        barChart.getData().addAll(series1);

	}
}
