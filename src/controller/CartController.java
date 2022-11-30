package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.CartItem;

public class CartController extends ProductBaseContoller implements Initializable{
	
	double totalCartValue = 0.0;
	
	@FXML
    private TableView<CartItem> cartTable;

    @FXML
    private TableColumn<CartItem, String> itemTotalValue;

    @FXML
    private TableColumn<CartItem, Double> price;

    @FXML
    private TableColumn<CartItem, String> productId;

    @FXML
    private TableColumn<CartItem, String> productName;

    @FXML
    private TableColumn<CartItem, Integer> quantity;

    @FXML
    private Label totalValue;

    @FXML
    void goToPayment(ActionEvent event) {
    	ScreenController.goToPaymentPage(event);
    }
    
//    @FXML
//    private void goToPayment(javafx.event.ActionEvent event) {
//    	
//    	
//    }
    
    ObservableList<CartItem> list = FXCollections.observableArrayList(cart.getCartItems());

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		productId.setCellValueFactory(new PropertyValueFactory<CartItem, String>("productId"));
		productName.setCellValueFactory(new PropertyValueFactory<CartItem, String>("productName"));
		price.setCellValueFactory(new PropertyValueFactory<CartItem, Double>("price"));
		quantity.setCellValueFactory(new PropertyValueFactory<CartItem, Integer>("quantity"));
		itemTotalValue.setCellValueFactory(new PropertyValueFactory<CartItem, String>("itemTotalValue"));
		cartTable.setItems(list);
		for(CartItem p: list) {
			totalCartValue += (double) p.getQuantity() * p.getPrice();
		}
		totalValue.setText("Total Cart Value: $" + String.format("%.2f", totalCartValue));
	}

}