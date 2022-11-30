package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoginController {

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
