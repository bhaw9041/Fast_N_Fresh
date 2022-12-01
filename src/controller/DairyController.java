package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import model.CartItem;
import model.Product;

public class DairyController extends ProductBaseContoller {

	@FXML Label milkPrice;
	@FXML Label butterPrice;
	@FXML Label heavyCreamPrice;
	@FXML Label iceCreamPrice;
	@FXML Label chocolateMilkPrice;
	@FXML Label sourCreamPrice;
	@FXML Label stringCheesePrice;
	@FXML Label mozzarellaCheesePrice;
	@FXML Label yogurtPrice;

	@FXML Spinner<Integer> milkSpinner;
	@FXML Spinner<Integer> butterSpinner;
	@FXML Spinner<Integer> heavyCreamSpinner;
	@FXML Spinner<Integer> iceCreamSpinner;
	@FXML Spinner<Integer>chocolateMilkSpinner;
	@FXML Spinner<Integer> sourCreamSpinner;
	@FXML Spinner<Integer> stringCheeseSpinner;
	@FXML Spinner<Integer> mozzarellaCheeseSpinner;
	@FXML Spinner<Integer> yogurtSpinner;

	@FXML Button milkButton;
	@FXML Button butterButton;
	@FXML Button heavyCreamButton;
	@FXML Button iceCreamButton;
	@FXML Button chocolateMilkButton;
	@FXML Button sourCreamButton;
	@FXML Button stringCheeseButton;
	@FXML Button mozzarellaCheeseButton;
	@FXML Button yogurtButton;

	public void initialize() {

		milkPrice.setText("$" + Product.productList.get(0).getPrice());
		butterPrice.setText("$" + Product.productList.get(1).getPrice());
		heavyCreamPrice.setText("$" + Product.productList.get(2).getPrice());
		iceCreamPrice.setText("$" + Product.productList.get(3).getPrice());
		chocolateMilkPrice.setText("$" + Product.productList.get(4).getPrice());
		sourCreamPrice.setText("$" + Product.productList.get(5).getPrice());
		stringCheesePrice.setText("$" + Product.productList.get(6).getPrice());
		mozzarellaCheesePrice.setText("$" + Product.productList.get(7).getPrice());
		yogurtPrice.setText("$" + Product.productList.get(8).getPrice());

//    	 Database Connection code	
//		try {
//			Connection conn = DatabaseConnector.getInstance();
//			Statement st = conn.createStatement();
//			String query = "select productId, productName, productPrice, productQuantity from product_list where catalog = 'Fruits'";
//			ResultSet rs = st.executeQuery(query);
//			while (rs.next()) {
//				inventoryItems.put(rs.getString(1),
//						new Product(rs.getString(1), rs.getString(2), rs.getInt(4), rs.getDouble(3)));
//			}
//			st.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		milkSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(0).getQuantity(), 0));

		butterSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(1).getQuantity(), 0));

		heavyCreamSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(2).getQuantity(), 0));

		iceCreamSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(3).getQuantity(), 0));

		chocolateMilkSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(4).getQuantity(), 0));

		sourCreamSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(5).getQuantity(), 0));

		stringCheeseSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(6).getQuantity(), 0));

		mozzarellaCheeseSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(7).getQuantity(), 0));

		yogurtSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(8).getQuantity(), 0));

	}

	@FXML
	private void addToCart(javafx.event.ActionEvent event) {

		if (((Button) event.getTarget()).getId().toString().equals("milkButton")) {
			CartItem ci = new CartItem("DA001", "Milk", (Integer) milkSpinner.getValue(),
					Product.productList.get(0).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("butterButton")) {
			CartItem ci = new CartItem("DA002", "Butter", (Integer) butterSpinner.getValue(),
					Product.productList.get(1).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("heavyCreamButton")) {
			CartItem ci = new CartItem("DA003", "Heavy Cream", (Integer) heavyCreamSpinner.getValue(),
					Product.productList.get(2).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("iceCreamButton")) {
			CartItem ci = new CartItem("DA004", "Ice Cream", (Integer) iceCreamSpinner.getValue(),
					Product.productList.get(3).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("chocolateMilkButton")) {
			CartItem ci = new CartItem("DA005", "Chocolate Milk", (Integer)chocolateMilkSpinner.getValue(),
					Product.productList.get(4).getPrice());

			cart.addProduct(ci);
		}

		if (((Button) event.getTarget()).getId().toString().equals("sourCreamButton")) {
			CartItem ci = new CartItem("DA006", "Sour Cream", (Integer) sourCreamSpinner.getValue(),
					Product.productList.get(5).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("stringCheeseButton")) {
			CartItem ci = new CartItem("DA007", "String Cheese", (Integer) stringCheeseSpinner.getValue(),
					Product.productList.get(6).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("mozzarellaCheeseButton")) {
			CartItem ci = new CartItem("DA008", "Mozzarella Cheese", (Integer) mozzarellaCheeseSpinner.getValue(),
					Product.productList.get(7).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("yogurtButton")) {
			CartItem ci = new CartItem("DA009", "Yogurt", (Integer) yogurtSpinner.getValue(),
					Product.productList.get(8).getPrice());

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
	
	
//	@FXML
//	public void addDairyProduct(Product p) {
//		//cart.addProduct(p);
//	}
}
