package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Product;

public class CartController extends ProductBaseContoller implements Initializable{
	
	double totalCartValue = 0.0;
	
	@FXML
	private TableView<Product> cartTable;

    @FXML
    private TableColumn<Product, String> itemTotalValue;

    @FXML
    private TableColumn<Product, Double> price;

    @FXML
    private TableColumn<Product, String> productName;

    @FXML
    private TableColumn<Product, Integer> productId;

    @FXML
    private TableColumn<Product, Integer> quantity;

    @FXML
    private Label totalValue;
    
    @FXML
    private void goToPayment(javafx.event.ActionEvent event) {
    	
    	ScreenController.goToPaymentPage(event);
    }
    
    ObservableList<Product> list = FXCollections.observableArrayList(cart.getOrderList());

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		productId.setCellValueFactory(new PropertyValueFactory<Product, Integer>("productId"));
		productName.setCellValueFactory(new PropertyValueFactory<Product, String>("productName"));
		price.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
		quantity.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));
		itemTotalValue.setCellValueFactory(new PropertyValueFactory<Product, String>("itemTotalValue"));
		cartTable.setItems(list);
		for(Product p: list) {
			totalCartValue += (double) p.getQuantity() * p.getPrice();
		}
		totalValue.setText("Total Cart Value: $" + String.format("%.2f", totalCartValue));
	}

}