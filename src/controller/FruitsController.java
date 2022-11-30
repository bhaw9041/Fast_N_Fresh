package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import model.Cart;
import model.CartItem;
import model.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.DatabaseConnector;

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
    
    @FXML Spinner<Integer> appleSpinner;
    @FXML Spinner<Integer> avocadoSpinner;
    @FXML Spinner<Integer> bananaSpinner;
    @FXML Spinner<Integer> blueberriesSpinner;
    @FXML Spinner<Integer> guavaSpinner;
    @FXML Spinner<Integer> orangeSpinner;
    @FXML Spinner<Integer> plumSpinner;
    @FXML Spinner<Integer> strawberriesSpinner;
    @FXML Spinner<Integer> watermelonSpinner;
    
    @FXML Button appleButton;
    @FXML Button avocadoButton;
    @FXML Button bananaButton;
    @FXML Button blueberriesButton;
    @FXML Button guavaButton;
    @FXML Button orangeButton;
    @FXML Button plumButton;
    @FXML Button strawberriesButton;
    @FXML Button watermelonButton;
    
    
    public void initialize() {
    	
    	applePrice.setText("$" + Product.productList.get(0).getPrice());
    	avocadoPrice.setText("$" + Product.productList.get(1).getPrice());
    	bananaPrice.setText("$" + Product.productList.get(2).getPrice());
    	blueberriesPrice.setText("$" + Product.productList.get(3).getPrice());
    	guavaPrice.setText("$" + Product.productList.get(4).getPrice());
    	orangePrice.setText("$" + Product.productList.get(5).getPrice());
    	plumPrice.setText("$" + Product.productList.get(6).getPrice());
    	strawberriesPrice.setText("$" + Product.productList.get(7).getPrice());
    	watermelonPrice.setText("$" + Product.productList.get(8).getPrice());	
    	
//    	 Database Connection code	
// 		try {
// 			Connection conn = DatabaseConnector.getInstance();
// 			Statement st = conn.createStatement();
// 			ResultSet rs = st.executeQuery(query);
// 			while (rs.next()) {
// 					String productData = "ProductId: " + rs.getString(1) + " ProductName: " + rs.getString(2) + " Price: "
//// 						+ rs.getDouble(3) + " Quantity: " + rs.getInt(4);
//// 				System.out.println(productData);
// 			}
// 			st.close();
// 			conn.close();
// 		} catch (Exception e) {
// 			e.printStackTrace();
// 		}
    	
    	appleSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(0).getQuantity(), 0));
    	
    	avocadoSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(1).getQuantity(), 0));
    	
    	bananaSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(2).getQuantity(), 0));
    	
    	blueberriesSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(3).getQuantity(), 0));
    	
    	guavaSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(4).getQuantity(), 0));
    	
    	orangeSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(5).getQuantity(), 0));
    	
    	plumSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(6).getQuantity(), 0));
    	
    	strawberriesSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(7).getQuantity(), 0));
    	
    	watermelonSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(8).getQuantity(), 0));
   
    }
    
    
    @FXML
    private void addToCart(javafx.event.ActionEvent event) {
    	
    	if(((Button)event.getTarget()).getId().toString().equals("appleButton")) {
    		CartItem ci = new CartItem("FRU01", "Apple", (Integer) appleSpinner.getValue(), Product.productList.get(0).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("avocadoButton")) {
    		CartItem ci = new CartItem("FRU01", "Avocado", (Integer) avocadoSpinner.getValue(), Product.productList.get(1).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("bananaButton")) {
    		CartItem ci = new CartItem("FRU01", "Banana", (Integer) bananaSpinner.getValue(), Product.productList.get(2).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("blueberriesButton")) {
    		CartItem ci = new CartItem("FRU01", "Blueberries", (Integer) blueberriesSpinner.getValue(), Product.productList.get(3).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("guavaButton")) {
    		CartItem ci = new CartItem("FRU01", "Guava", (Integer) guavaSpinner.getValue(), Product.productList.get(4).getPrice());
    		
    		cart.addProduct(ci);
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("orangeButton")) {
    		CartItem ci = new CartItem("FRU01", "Orange", (Integer) orangeSpinner.getValue(), Product.productList.get(5).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("plumButton")) {
    		CartItem ci = new CartItem("FRU01", "Plum", (Integer) plumSpinner.getValue(), Product.productList.get(6).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("strawberriesButton")) {
    		CartItem ci = new CartItem("FRU01", "Strawberries", (Integer) strawberriesSpinner.getValue(), Product.productList.get(7).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("watermelonButton")) {
    		CartItem ci = new CartItem("FRU01", "Watermelon", (Integer) watermelonSpinner.getValue(), Product.productList.get(8).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
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
