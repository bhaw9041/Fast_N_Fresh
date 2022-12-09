package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Product;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		createProduct();

		Parent rootLogin = FXMLLoader.load(getClass().getResource("/view/LOGIN.fxml"));
		Scene sceneLogin = new Scene(rootLogin);
		primaryStage.setTitle("Login Page");
		primaryStage.setScene(sceneLogin);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

	public static void createProduct() {

		Product.productList.add(new Product("FRU01", "Apple", 10, .99, "Fruits"));
		Product.productList.add(new Product("FRU02", "Avocado", 10, 1, "Fruits"));
		Product.productList.add(new Product("FRU03", "Banana", 10, .50, "Fruits"));
		Product.productList.add(new Product("FRU04", "Blueberries", 10, 1.49, "Fruits"));
		Product.productList.add(new Product("FRU05", "Guava", 10, .99, "Fruits"));
		Product.productList.add(new Product("FRU06", "Orange", 10, 1, "Fruits"));
		Product.productList.add(new Product("FRU07", "Plum", 10, 1.75, "Fruits"));
		Product.productList.add(new Product("FRU08", "Strawberries", 10, 2.50, "Fruits"));
		Product.productList.add(new Product("FRU09", "Watermelon", 10, 3, "Fruits"));

	}
}
