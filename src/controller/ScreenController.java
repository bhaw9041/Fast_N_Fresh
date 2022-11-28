package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreenController {
	
	private static void showStage(ActionEvent event, String filename, String sceneName) {
        try {
            Parent parent = FXMLLoader.load(ScreenController.class.getResource(filename));
            Scene scene = new Scene(parent, 900, 700);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setTitle(sceneName);
            appStage.setScene(scene);
            appStage.setResizable(false);
            appStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
	
	static void goToFruitsPage(ActionEvent event) {
        showStage(event, "../view/Fruits.fxml", "Fruits");
    }
	
	static void goToCartPage(ActionEvent event) {
        showStage(event, "../view/Cart.fxml", "Cart Page");
    }
	
	static void goToCatalogPage(ActionEvent event) {
        showStage(event, "../view/Catalog.fxml", "Catalog");
    }

}
