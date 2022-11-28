package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FruitsController {

    @FXML Label applePrice;
    @FXML Label avocadoPrice;
    @FXML Label bananaPrice;
    @FXML Label blueberriesPrice;
    @FXML Label guavaPrice;
    @FXML Label orangePrice;
    @FXML Label plumPrice;
    @FXML Label strawberriesPrice;
    @FXML Label watermelonPrice;
    
    public void initialize() {
    	
    	applePrice.setText("$10");
    	avocadoPrice.setText("$10");
    	bananaPrice.setText("$10");
    	blueberriesPrice.setText("$10");
    	guavaPrice.setText("$10");
    	orangePrice.setText("$10");
    	plumPrice.setText("$10");
    	strawberriesPrice.setText("$10");
    	watermelonPrice.setText("$10");	
    }
    
    
    @FXML
    private void addToCart(javafx.event.ActionEvent event) {
    	
    	//ScreenController.goToCatalogPage(event);
    }
    
    @FXML
    private void backToCatalog(javafx.event.ActionEvent event) {
    	
    	ScreenController.goToCatalogPage(event);
    }
    
    @FXML
    private void goToCart(javafx.event.ActionEvent event) {
    	
    	ScreenController.goToCartPage(event);
    }

}
