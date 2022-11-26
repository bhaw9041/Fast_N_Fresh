package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent rootCat = FXMLLoader.load(getClass().getResource("/view/Catalog.fxml"));
		Scene sceneCat = new Scene(rootCat);
	
		primaryStage.setTitle("Catalog Page");
		primaryStage.setScene(sceneCat);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
