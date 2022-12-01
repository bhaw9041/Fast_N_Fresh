package controller;

import javafx.event.ActionEvent;
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

public class VegetablesController extends ProductBaseController {

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
    	
//    	 Database Connection code	
	 		try {
	 			Connection conn = DatabaseConnector.getInstance();
	 			Statement st = conn.createStatement();
	 			String query = "select productId, productName, productPrice, productQuantity, catalog from product_list where catalog = 'Vegetables'";
				
	 			ResultSet rs = st.executeQuery(query);
	 			while (rs.next()) {
	 				inventoryItems.put(rs.getString(1),
							new Product(rs.getString(1), rs.getString(2), rs.getInt(4), rs.getDouble(3), rs.getString(5)));
	 			}
	 			st.close();
	 			conn.close();
			} catch (Exception e) {
	 			e.printStackTrace();
	 		}
	 		
	    	
	    	bellPepperPrice.setText("$" + inventoryItems.get("VEG001").getPrice());
	    	carrotPrice.setText("$" + inventoryItems.get("VEG002").getPrice());
	    	cauliflowerPrice.setText("$" + inventoryItems.get("VEG003").getPrice());
	    	mushroomsPrice.setText("$" + inventoryItems.get("VEG004").getPrice());
	    	onionsPrice.setText("$" + inventoryItems.get("VEG005").getPrice());
	    	potatoesPrice.setText("$" + inventoryItems.get("VEG006").getPrice());
	    	scallionsPrice.setText("$" + inventoryItems.get("VEG007").getPrice());
	    	spinachPrice.setText("$" + inventoryItems.get("VEG008").getPrice());
	    	tomatoesPrice.setText("$" + inventoryItems.get("VEG009").getPrice());	
    	
    	bellPepperSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG001").getQuantity(), 0));
    	
    	carrotSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG002").getQuantity(), 0));
    	
    	cauliflowerSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG003").getQuantity(), 0));
    	
    	mushroomsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG004").getQuantity(), 0));
    	
    	onionsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG005").getQuantity(), 0));
    	
    	potatoesSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG006").getQuantity(), 0));
    	
    	scallionsSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG007").getQuantity(), 0));
    	
    	spinachSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG008").getQuantity(), 0));
    	
    	tomatoesSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, inventoryItems.get("VEG009").getQuantity(), 0));
   
    }
    
    
    @FXML
    private void addToCart(javafx.event.ActionEvent event) {
    	
    	if(((Button)event.getTarget()).getId().toString().equals("bellPepperButton")) {
    		CartItem ci = new CartItem("VEG001", inventoryItems.get("VEG001").getProductName(), 
    				(Integer) bellPepperSpinner.getValue(), inventoryItems.get("VEG001").getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("carrotButton")) {
    		CartItem ci = new CartItem("VEG002", inventoryItems.get("VEG002").getProductName(), 
    				(Integer) carrotSpinner.getValue(), inventoryItems.get("VEG002").getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("cauliflowerButton")) {
    		CartItem ci = new CartItem("VEG003", inventoryItems.get("VEG003").getProductName(), 
    				(Integer) cauliflowerSpinner.getValue(), inventoryItems.get("VEG003").getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("mushroomsButton")) {
    		CartItem ci = new CartItem("VEG004", inventoryItems.get("VEG004").getProductName(),
    				(Integer) mushroomsSpinner.getValue(), inventoryItems.get("VEG004").getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("onionsButton")) {
    		CartItem ci = new CartItem("VEG005", inventoryItems.get("VEG005").getProductName(), 
    				(Integer) onionsSpinner.getValue(), inventoryItems.get("VEG005").getPrice());
    		
    		cart.addProduct(ci);
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("potatoesButton")) {
    		CartItem ci = new CartItem("VEG006", inventoryItems.get("VEG006").getProductName(), 
    				(Integer) potatoesSpinner.getValue(), inventoryItems.get("VEG006").getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("scallionsButton")) {
    		CartItem ci = new CartItem("VEG007", inventoryItems.get("VEG007").getProductName(), 
    				(Integer) scallionsSpinner.getValue(), inventoryItems.get("VEG007").getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("spinachButton")) {
    		CartItem ci = new CartItem("VEG008", inventoryItems.get("VEG008").getProductName(), 
    				(Integer) spinachSpinner.getValue(), inventoryItems.get("VEG008").getPrice());
    		
    		cart.addProduct(ci);
    		
    	}
    	
    	if(((Button)event.getTarget()).getId().toString().equals("tomatoesButton")) {
    		CartItem ci = new CartItem("VEG009", inventoryItems.get("VEG009").getProductName(), 
    				(Integer) tomatoesSpinner.getValue(), inventoryItems.get("VEG009").getPrice());
    		
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
    
    @FXML
    void goToLogin(ActionEvent event) {
    	logOff();
    	ScreenController.goToLoginPage(event);
    }

}
