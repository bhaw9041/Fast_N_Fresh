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
		
		Parent rootCat = FXMLLoader.load(getClass().getResource("/view/Catalog.fxml"));
		Scene sceneCat = new Scene(rootCat);
	
		primaryStage.setTitle("Catalog Page");
		primaryStage.setScene(sceneCat);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void createProduct() {
		
		Product.productList.add(new Product(1, "Apple", 10, .99));
		Product.productList.add(new Product(1, "Avocado", 10, 1));
		Product.productList.add(new Product(1, "Banana", 10, .50));
		Product.productList.add(new Product(1, "Blueberries", 10, 1.49));
		Product.productList.add(new Product(1, "Guava", 10, .99));
		Product.productList.add(new Product(1, "Orange", 10, 1));
		Product.productList.add(new Product(1, "Plum", 10, 1.75));
		Product.productList.add(new Product(1, "Strawberries", 10, 2.50));
		Product.productList.add(new Product(1, "Watermelon", 10, 3));
		
		
		
		
	}
}
