package controller;

import javafx.fxml.FXML;
import model.Product;

public class DairyController extends ProductBaseContoller {

	@FXML
	public void addDiaryProduct(Product p) {
		cart.addProduct(p);
	}
}
