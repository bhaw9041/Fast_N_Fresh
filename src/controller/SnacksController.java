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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import model.DatabaseConnector;

public class SnacksController extends ProductBaseController {

	@FXML
	Label blueberryBarPrice;
	@FXML
	Label cheetosPrice;
	@FXML
	Label chipsPrice;
	@FXML
	Label chocolatePrice;
	@FXML
	Label onionDipPrice;
	@FXML
	Label popcornPrice;
	@FXML
	Label pringlesPrice;
	@FXML
	Label tostitosPrice;
	@FXML
	Label trailPrice;

	@FXML
	Spinner<Integer> blueberryBarSpinner;
	@FXML
	Spinner<Integer> cheetosSpinner;
	@FXML
	Spinner<Integer> chipsSpinner;
	@FXML
	Spinner<Integer> chocolateSpinner;
	@FXML
	Spinner<Integer> onionDipSpinner;
	@FXML
	Spinner<Integer> popcornSpinner;
	@FXML
	Spinner<Integer> pringlesSpinner;
	@FXML
	Spinner<Integer> tostitosSpinner;
	@FXML
	Spinner<Integer> trailSpinner;

	@FXML
	Button blueberryBarButton;
	@FXML
	Button cheetosButton;
	@FXML
	Button chipsButton;
	@FXML
	Button chocolateButton;
	@FXML
	Button onionDipButton;
	@FXML
	Button popcornButton;
	@FXML
	Button pringlesButton;
	@FXML
	Button tostitosButton;
	@FXML
	Button trailButton;

	private Map<String, Product> fruitItems = new HashMap();

	public void initialize() {

		blueberryBarPrice.setText("$" + Product.productList.get(0).getPrice());
		cheetosPrice.setText("$" + Product.productList.get(1).getPrice());
		chipsPrice.setText("$" + Product.productList.get(2).getPrice());
		chocolatePrice.setText("$" + Product.productList.get(3).getPrice());
		onionDipPrice.setText("$" + Product.productList.get(4).getPrice());
		popcornPrice.setText("$" + Product.productList.get(5).getPrice());
		pringlesPrice.setText("$" + Product.productList.get(6).getPrice());
		tostitosPrice.setText("$" + Product.productList.get(7).getPrice());
		trailPrice.setText("$" + Product.productList.get(8).getPrice());

//    	 Database Connection code	
//		try {
//			Connection conn = DatabaseConnector.getInstance();
//			Statement st = conn.createStatement();
//			String query = "select productId, productName, productPrice, productQuantity from product_list where catalog = 'Fruits'";
//			ResultSet rs = st.executeQuery(query);
//			while (rs.next()) {
//				fruitItems.put(rs.getString(1), new Product(rs.getString(1), rs.getString(2), rs.getInt(4), rs.getDouble(3)));
//			}
//			st.close();
//			conn.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		blueberryBarSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(0).getQuantity(), 0));

		cheetosSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(1).getQuantity(), 0));

		chipsSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(2).getQuantity(), 0));

		chocolateSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(3).getQuantity(), 0));

		onionDipSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(4).getQuantity(), 0));

		popcornSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(5).getQuantity(), 0));

		pringlesSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(6).getQuantity(), 0));

		tostitosSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(7).getQuantity(), 0));

		trailSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(8).getQuantity(), 0));

	}

	@FXML
	private void addToCart(ActionEvent event) {

		if (((Button) event.getTarget()).getId().toString().equals("blueberryBarButton")) {
			CartItem ci = new CartItem("FRU01", "Blueberry Bar", (Integer) blueberryBarSpinner.getValue(),
					Product.productList.get(0).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("cheetosButton")) {
			CartItem ci = new CartItem("FRU02", "Avocado", (Integer) cheetosSpinner.getValue(),
					Product.productList.get(1).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("chipsButton")) {
			CartItem ci = new CartItem("FRU03", "Banana", (Integer) chipsSpinner.getValue(),
					Product.productList.get(2).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("chocolateButton")) {
			CartItem ci = new CartItem("FRU04", "Blueberries", (Integer) chocolateSpinner.getValue(),
					Product.productList.get(3).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("chocolateButton")) {
			CartItem ci = new CartItem("FRU05", "Guava", (Integer) onionDipSpinner.getValue(),
					Product.productList.get(4).getPrice());

			cart.addProduct(ci);
		}

		if (((Button) event.getTarget()).getId().toString().equals("orangeButton")) {
			CartItem ci = new CartItem("FRU06", "Orange", (Integer) popcornSpinner.getValue(),
					Product.productList.get(5).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("pringlesButton")) {
			CartItem ci = new CartItem("FRU07", "Plum", (Integer) pringlesSpinner.getValue(),
					Product.productList.get(6).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("tostitosButton")) {
			CartItem ci = new CartItem("FRU08", "Strawberries", (Integer) tostitosSpinner.getValue(),
					Product.productList.get(7).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("trailButton")) {
			CartItem ci = new CartItem("FRU09", "Watermelon", (Integer) trailSpinner.getValue(),
					Product.productList.get(8).getPrice());

			cart.addProduct(ci);

		}

	}

	@FXML
	private void backToCatalog(ActionEvent event) {

		ScreenController.goToCatalogPage(event);
	}

	@FXML
	private void goToCart(ActionEvent event) {

		ScreenController.goToCartPage(event);
	}
	
	@FXML
    void goToLogin(ActionEvent event) {
    	logOff();
    	ScreenController.goToLoginPage(event);
    }

}
