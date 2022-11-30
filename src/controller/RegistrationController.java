package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class RegistrationController {
	
	@FXML
    public void goToCatalog(ActionEvent event) {
    	
    	  	ScreenController.goToCatalogPage(event);
    }

}
