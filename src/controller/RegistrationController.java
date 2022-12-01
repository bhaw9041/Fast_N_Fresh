package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RegistrationController {
	
	@FXML private TextField tfName;
	
	@FXML private TextField tfContact;
	
	@FXML private TextField tfEmail;
	
	@FXML private TextField tfUsername;
	
	@FXML private TextField tfPass;
	
	
	

	public void acceptName() {
		String name = tfName.getText();
	}
	
	public void acceptContact() {
		String contact = tfContact.getText();
	}
	
	public void acceptEmail() {
		String email = tfEmail.getText();
	}
	
	public void acceptUsername() {
		String email = tfEmail.getText();
	}
	public void acceptPassword() {
		String email = tfEmail.getText();
	}
	
	@FXML
    public void goToCatalog(ActionEvent event) {
    	
    	  	ScreenController.goToCatalogPage(event);
    }

}
