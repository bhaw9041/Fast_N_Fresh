package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreenController {
	
	public static void showStage(ActionEvent event, String filename, String sceneName) {
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
	
	public static void goToFruitsPage(ActionEvent event) {
        showStage(event, "../view/Fruits.fxml", "Fruits");
    }
	
	public static void goToVegetablesPage(ActionEvent event) {
        showStage(event, "../view/Vegetables.fxml", "Vegetables");
    }
	
	static void goToCartPage(ActionEvent event) {
        showStage(event, "../view/OrderCart.fxml", "Cart");
    }
	
	static void goToCatalogPage(ActionEvent event) {
        showStage(event, "../view/Catalog.fxml", "Catalog");
    }

	static void goToPaymentPage(ActionEvent event) {
        showStage(event, "../view/PaymentScene.fxml", "Payment");
    }
	
	
	static void goToRegistrationPage(ActionEvent event) {
        showStage(event, "../view/Registration.fxml", "Registration");
    }
	
	public static void goToSnacksPage(ActionEvent event) {
        showStage(event, "../view/Snacks.fxml", "Snacks");
    }
}
