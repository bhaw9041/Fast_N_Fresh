package controller;

import java.util.Iterator;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import model.Cart;
import model.Product;

public class CartController {
 
	@FXML
	GridPane cartValue;
	
	Cart cart = new Cart();

	public CartController() {
		addData();
	}

	public void addData() {
		Product product = new Product(1, "Oranges", 2, 7.84);
		Product product2 = new Product(2, "Apples", 4, 1.2);
		Product product3 = new Product(3, "Tomatoes", 6, 0.5);
		Product product4 = new Product(4, "Potatoes", 3, 2.18);
		cart.addProduct(product);
		cart.addProduct(product2);
		cart.addProduct(product3);
		cart.addProduct(product4);
	}
	
	@FXML
	public void totalCartValue() {		
		Iterator<Product> productList = cart.getOrderList().iterator();
		double total = 0.0;
		int i;
		Text itemName = new Text("Item Name");
		itemName.setFont(Font.font("Arial", FontWeight.BOLD, 11));
		Text price = new Text("Price");
		price.setFont(Font.font("Arial", FontWeight.BOLD, 11));
		Text quantity = new Text("Quantity");
		quantity.setFont(Font.font("Arial", FontWeight.BOLD, 11));
		Text itemTotal = new Text("Item Total Price");
		itemTotal.setFont(Font.font("Arial", FontWeight.BOLD, 11));
		cartValue.add(itemName, 0, 0);
		cartValue.add(price, 1, 0);
		cartValue.add(quantity, 2, 0);
		cartValue.add(itemTotal, 3, 0);
		for(i=1; productList.hasNext(); i++) {
	         Product item = productList.next();
	         Text productName = new Text(item.getProductName());	 		
	 		 Text productPrice = new Text(String.valueOf(item.getPrice()));
	 		 Text quantityOrdered = new Text(String.valueOf(item.getQuantity()));
	 		 double itemPurchaseValue = (double) (item.getPrice()*item.getQuantity());
	 		 Text itemTotalValue = new Text(String.valueOf(itemPurchaseValue));
	 		 cartValue.add(productName, 0, i);
			 cartValue.add(productPrice, 1, i);
			 cartValue.add(quantityOrdered, 2, i);
			 cartValue.add(itemTotalValue, 3, i);
	         //s += "\n" + item.getProductName() + " \t\t " + item.getPrice() + " \t\t " + item.getQuantity();
	         total += itemPurchaseValue;
	    }
		i++;
		//s += "\nTotal Price: \t\t\t\t" + total;
		Text totalValue = new Text("Total Order Value:");
		cartValue.add(totalValue, 0, i);
		Text totalAmount = new Text(String.valueOf(total));
		cartValue.add(totalAmount, 3, i);
	}
}
