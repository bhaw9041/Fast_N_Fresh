package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.DatabaseConnector;

public class RegistrationController {

	@FXML
	private Button backToLogin;

	@FXML
	private Button btnSubmit;

	@FXML
	private TextField tfContact;

	@FXML
	private TextField tfEmail;

	@FXML
	private TextField tfName;

	@FXML
	private TextField tfUserId;

	@FXML
	private PasswordField tfUserPassword;

	@FXML
	void registerUser(ActionEvent event) {
		// if (tfUserId.getText() != null && tfName.getText() != null && tfContact.getText() !=
		// null && tfEmail.getText() != null && tfUserPassword.getText() != null) {
		String query = "insert into user_info values (?,?,?,?,?)";
		PreparedStatement preparedStmt;
		try {
			Connection conn = DatabaseConnector.getInstance();
			preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, tfUserId.getText());
			preparedStmt.setString(2, tfName.getText());
			preparedStmt.setString(3, tfContact.getText());
			preparedStmt.setString(4, tfEmail.getText());
			preparedStmt.setString(5, tfUserPassword.getText());
			preparedStmt.executeUpdate();
			preparedStmt.close();
			System.out.println("User Registration successful!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error Message: " + e.getMessage());
			e.printStackTrace();
		}
//    	} else {
//    		// Throw error for Registration validation
//    		System.out.println("User Details are not filled!");
//    	}

	}

	@FXML
	void goToLogin(ActionEvent event) {
		ScreenController.goToLoginPage(event);
	}

}
