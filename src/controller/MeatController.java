package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import model.CartItem;
import model.Product;

public class MeatController extends ProductBaseController {

    @FXML
    private Spinner<Integer> beefSpinner;
    @FXML
    private Spinner<Integer> chickenSpinner;
    @FXML
    private Spinner<Integer> clamSpinner;
    @FXML
    private Spinner<Integer> crabSpinner;
    @FXML
    private Spinner<Integer> fishSpinner;
    @FXML
    private Spinner<Integer> lambSpinner;
    @FXML
    private Spinner<Integer> porkSpinner;
    @FXML
    private Spinner<Integer> prawnsSpinner;
    @FXML
    private Spinner<Integer> turkeySpinner;

	
	@FXML
    private Button beefButton;
    @FXML
    private Label beefPrice;
    @FXML
    private Button chickenButton;
    @FXML
    private Label chickenPrice;
    @FXML
    private Button clamButton;
    @FXML
    private Label clamPrice;
    @FXML
    private Button crabButton;
    @FXML
    private Label crabPrice;
    @FXML
    private Button fishButton;
    @FXML
    private Label fishPrice;
    @FXML
    private Button lambButton;
    @FXML
    private Label lambPrice;
    @FXML
    private Button porkButton;
    @FXML
    private Label porkPrice;
   @FXML
    private Button prawnsButton;
    @FXML
    private Label prawnsPrice;
    @FXML
    private Button turkeyButton;
    @FXML
    private Label turkeyPrice;





	public void initialize() {

		chickenPrice.setText("$" + Product.productList.get(0).getPrice());
		fishPrice.setText("$" + Product.productList.get(1).getPrice());
		beefPrice.setText("$" + Product.productList.get(2).getPrice());
		crabPrice.setText("$" + Product.productList.get(3).getPrice());
		clamPrice.setText("$" + Product.productList.get(4).getPrice());
		lambPrice.setText("$" + Product.productList.get(5).getPrice());
		porkPrice.setText("$" + Product.productList.get(6).getPrice());
		turkeyPrice.setText("$" + Product.productList.get(7).getPrice());
		prawnsPrice.setText("$" + Product.productList.get(8).getPrice());

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

		chickenSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(0).getQuantity(), 0));

		fishSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(1).getQuantity(), 0));

		beefSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(2).getQuantity(), 0));

		crabSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(3).getQuantity(), 0));

		clamSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(4).getQuantity(), 0));

		lambSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(5).getQuantity(), 0));

		porkSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(6).getQuantity(), 0));

		turkeySpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(7).getQuantity(), 0));

		prawnsSpinner.setValueFactory(
				new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Product.productList.get(8).getQuantity(), 0));

	}

	@FXML
	private void addToCart(javafx.event.ActionEvent event) {

		if (((Button) event.getTarget()).getId().toString().equals("chickenButton")) {
			CartItem ci = new CartItem("MEA001", "Chicken", (Integer) chickenSpinner.getValue(),
					Product.productList.get(0).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("fishButton")) {
			CartItem ci = new CartItem("MEA002", "Fish", (Integer) fishSpinner.getValue(),
					Product.productList.get(1).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("beefButton")) {
			CartItem ci = new CartItem("MEA003","Beef", (Integer) beefSpinner.getValue(),
					Product.productList.get(2).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("crabButton")) {
			CartItem ci = new CartItem("MEA004", "Crab", (Integer) crabSpinner.getValue(),
					Product.productList.get(3).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("clamButton")) {
			CartItem ci = new CartItem("MEA005", "Clam", (Integer)clamSpinner.getValue(),
					Product.productList.get(4).getPrice());

			cart.addProduct(ci);
		}

		if (((Button) event.getTarget()).getId().toString().equals("lambButton")) {
			CartItem ci = new CartItem("MEA006", "Lamb", (Integer) lambSpinner.getValue(),
					Product.productList.get(5).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("porkButton")) {
			CartItem ci = new CartItem("MEA007", "Pork", (Integer) porkSpinner.getValue(),
					Product.productList.get(6).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("turkeyButton")) {
			CartItem ci = new CartItem("MEA008", "Turkey", (Integer) turkeySpinner.getValue(),
					Product.productList.get(7).getPrice());

			cart.addProduct(ci);

		}

		if (((Button) event.getTarget()).getId().toString().equals("prawnsButton")) {
			CartItem ci = new CartItem("MEA009", "Prawns", (Integer) prawnsSpinner.getValue(),
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
	
	
//	@FXML
//	public void addDairyProduct(Product p) {
//		//cart.addProduct(p);
//	}
}
