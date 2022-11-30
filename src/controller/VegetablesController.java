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

public class VegetablesController extends ProductBaseContoller {

    @FXML Label bellPepperPrice;
    @FXML Label carrotPrice;
    @FXML Label cauliflowerPrice;
    @FXML Label mushroomsPrice;
    @FXML Label onionsPrice;
    @FXML Label potatoesPrice;
    @FXML Label scallionsPrice;
    @FXML Label spinachPrice;
    @FXML Label tomatoesPrice;
    
    @FXML Spinner<Integer> bellPepperSpinner;
    @FXML Spinner<Integer> carrotSpinner;
    @FXML Spinner<Integer> cauliflowerSpinner;
    @FXML Spinner<Integer> mushroomsSpinner;
    @FXML Spinner<Integer> onionsSpinner;
    @FXML Spinner<Integer> potatoesSpinner;
    @FXML Spinner<Integer> scallionsSpinner;
    @FXML Spinner<Integer> spinachSpinner;
    @FXML Spinner<Integer> tomatoesSpinner;
    
    @FXML Button bellPepperButton;
    @FXML Button carrotButton;
    @FXML Button cauliflowerButton;
    @FXML Button mushroomsButton;
    @FXML Button onionsButton;
    @FXML Button potatoesButton;
    @FXML Button scallionsButton;
    @FXML Button spinachButton;
    @FXML Button tomatoesButton;
    
    
    public void initialize() {
    	
    	bellPepperPrice.setText("$" + Product.productList.get(0).getPrice());
    	carrotPrice.setText("$" + Product.productList.get(1).getPrice());
    	cauliflowerPrice.setText("$" + Product.productList.get(2).getPrice());
    	mushroomsPrice.setText("$" + Product.productList.get(3).getPrice());
    	onionsPrice.setText("$" + Product.productList.get(4).getPrice());
    	potatoesPrice.setText("$" + Product.productList.get(5).getPrice());
    	scallionsPrice.setText("$" + Product.productList.get(6).getPrice());
    	spinachPrice.setText("$" + Product.productList.get(7).getPrice());
    	tomatoesPrice.setText("$" + Product.productList.get(8).getPrice());	
    	
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
    	
    	bellPepperSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(0).getQuantity(), 0));
    	
    	carrotSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(1).getQuantity(), 0));
    	
    	cauliflowerSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(2).getQuantity(), 0));
    	
    	mushroomsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(3).getQuantity(), 0));
    	
    	onionsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(4).getQuantity(), 0));
    	
    	potatoesSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(5).getQuantity(), 0));
    	
    	scallionsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(6).getQuantity(), 0));
    	
    	spinachSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(7).getQuantity(), 0));
    	
    	tomatoesSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(8).getQuantity(), 0));
   
    }
    
    
    @FXML
    private void addToCart(javafx.event.ActionEvent event) {
    	
    	if(((Button)event.getTarget()).getId().toString().equals("bellPepperButton")) {
    		CartItem ci = new CartItem("VEG01", "Bell Pepper", (Integer) bellPepperSpinner.getValue(), Product.productList.get(0).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("carrotButton")) {
    		CartItem ci = new CartItem("VEG02", "Carrot", (Integer) carrotSpinner.getValue(), Product.productList.get(1).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("cauliflowerButton")) {
    		CartItem ci = new CartItem("VEG03", "Cauliflower", (Integer) cauliflowerSpinner.getValue(), Product.productList.get(2).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("mushroomsButton")) {
    		CartItem ci = new CartItem("VEG04", "Mushrooms", (Integer) mushroomsSpinner.getValue(), Product.productList.get(3).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("onionsButton")) {
    		CartItem ci = new CartItem("VEG05", "Onions", (Integer) onionsSpinner.getValue(), Product.productList.get(4).getPrice());
    		
    		cart.addProduct(ci);
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("potatoesButton")) {
    		CartItem ci = new CartItem("VEG06", "Potatoes", (Integer) potatoesSpinner.getValue(), Product.productList.get(5).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("scallionsButton")) {
    		CartItem ci = new CartItem("VEG07", "Scallions", (Integer) scallionsSpinner.getValue(), Product.productList.get(6).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("spinachButton")) {
    		CartItem ci = new CartItem("VEG08", "Spinach", (Integer) spinachSpinner.getValue(), Product.productList.get(7).getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("tomatoesButton")) {
    		CartItem ci = new CartItem("VEG09", "Tomatoes", (Integer) tomatoesSpinner.getValue(), Product.productList.get(8).getPrice());
    		
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
