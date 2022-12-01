package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField tfUsername;
	
	@FXML
	private TextField tfPassword;
	
	
	public void acceptUsername() {
		String userName = tfUsername.getText();
	}
	
	public void acceptPassword() {
		String password = tfPassword.getText();
	}

	@FXML
	public void goToCatalog(ActionEvent event) {

		ScreenController.goToCatalogPage(event);
	}

	
//	static void goToRegistrationPage(ActionEvent event) {
//        showStage(event, "../view/Catalog.fxml", "Catalog");
//    }
	
	public void goToRegistration(ActionEvent event) {

		ScreenController.goToRegistrationPage(event);
	}


}
