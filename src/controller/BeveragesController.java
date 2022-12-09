package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import model.CartItem;
import model.Product;

public class BeveragesController extends ProductBaseController {
	@FXML Label waterPrice;
	@FXML Label celsiusPrice;
	@FXML Label koolAidPrice;
	@FXML Label fruitPunchPrice;
	@FXML Label gatoradePrice;
	@FXML Label orangeJuicePrice;
	@FXML Label pepsiPrice;
	@FXML Label redBullPrice;
	@FXML Label seltzerPrice;

	@FXML Spinner<Integer> waterSpinner;
	@FXML Spinner<Integer> celsiusSpinner;
	@FXML Spinner<Integer> koolAidSpinner;
	@FXML Spinner<Integer> fruitPunchSpinner;
	@FXML Spinner<Integer> gatoradeSpinner;
	@FXML Spinner<Integer> orangeJuiceSpinner;
	@FXML Spinner<Integer> pepsiSpinner;
	@FXML Spinner<Integer> redBullSpinner;
	@FXML Spinner<Integer> seltzerSpinner;

	@FXML Button waterButton;
	@FXML Button celsiusButton;
	@FXML Button koolAidButton;
	@FXML Button fruitPunchButton;
	@FXML Button gatoradeButton;
	@FXML Button orangeJuiceButton;
	@FXML Button pepsiButton;
	@FXML Button redBullButton;
	@FXML Button seltzerButton;

	public void initialize() {

		waterPrice.setText("$" + Product.productList.get(0).getPrice());
		celsiusPrice.setText("$" + Product.productList.get(1).getPrice());
		koolAidPrice.setText("$" + Product.productList.get(2).getPrice());
		fruitPunchPrice.setText("$" + Product.productList.get(3).getPrice());
		gatoradePrice.setText("$" + Product.productList.get(4).getPrice());
		orangeJuicePrice.setText("$" + Product.productList.get(5).getPrice());
		pepsiPrice.setText("$" + Product.productList.get(6).getPrice());
		redBullPrice.setText("$" + Product.productList.get(7).getPrice());
		seltzerPrice.setText("$" + Product.productList.get(8).getPrice());

		waterSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(0).getQuantity(), 0));

		celsiusSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(1).getQuantity(), 0));

		koolAidSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(2).getQuantity(), 0));

		fruitPunchSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(3).getQuantity(), 0));

		gatoradeSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(4).getQuantity(), 0));

		orangeJuiceSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(5).getQuantity(), 0));

		pepsiSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(6).getQuantity(), 0));

		redBullSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(7).getQuantity(), 0));

		seltzerSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(8).getQuantity(), 0));

	}

	@FXML
	private void addToCart(javafx.event.ActionEvent event) {

		if (((Button) event.getTarget()).getId().toString().equals("waterButton")) {
			CartItem ci = new CartItem("BEV001", "Water", (Integer) waterSpinner.getValue(),
					Product.productList.get(0).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("celsiusButton")) {
			CartItem ci = new CartItem("BEV002", "Celsius", (Integer) celsiusSpinner.getValue(),
					Product.productList.get(1).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("koolAidButton")) {
			CartItem ci = new CartItem("BEV003", "KoolAid", (Integer) koolAidSpinner.getValue(),
					Product.productList.get(2).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("fruitPunchButton")) {
			CartItem ci = new CartItem("BEV004", "Fruit Punch", (Integer) fruitPunchSpinner.getValue(),
					Product.productList.get(3).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("gatoradeButton")) {
			CartItem ci = new CartItem("BEV005", "Gatorade", (Integer)gatoradeSpinner.getValue(),
					Product.productList.get(4).getPrice());

			cart.addProduct(ci);
		}

		if (((Button) event.getTarget()).getId().toString().equals("orangeJuiceButton")) {
			CartItem ci = new CartItem("BEV006", "Orange Juice", (Integer) orangeJuiceSpinner.getValue(),
					Product.productList.get(5).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("pepsiButton")) {
			CartItem ci = new CartItem("BEV007", "Pepsi", (Integer) pepsiSpinner.getValue(),
					Product.productList.get(6).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("redBullButton")) {
			CartItem ci = new CartItem("BEV008", "Red Bull", (Integer) redBullSpinner.getValue(),
					Product.productList.get(7).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("seltzerButton")) {
			CartItem ci = new CartItem("BEV009", "Seltzer", (Integer) seltzerSpinner.getValue(),
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

	@FXML
	void goToLogin(ActionEvent event) {
		logOff();
		ScreenController.goToLoginPage(event);
	}

}
