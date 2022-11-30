package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Product;

public class FruitsController extends ProductBaseContoller {

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
    	cart.addProduct(new Product(1, "Oranges", 2, 7.84));
    	cart.addProduct(new Product(2, "Apples", 4, 1.2));
		cart.addProduct(new Product(3, "Tomatoes", 6, 0.5));
		cart.addProduct(new Product(4, "Potatoes", 3, 2.18));
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
