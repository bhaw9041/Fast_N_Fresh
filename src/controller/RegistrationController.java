package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.paint.Color;
import model.DatabaseConnector;
import java.util.regex.*;

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
	private Label errorContact;

	@FXML
	private Label errorEmail;

	@FXML
	private Label errorNameField;

	@FXML
	private Label errorPassword;

	@FXML
	private Label errorUserName;

	@FXML
	private Label lblName;

	@FXML
	private Label lblContact;

	@FXML
	private Label lblEmail;

	@FXML
	private Label lblUserName;

	@FXML
	private Label lblPassword;

	@FXML
	void registerUser(ActionEvent event) {
		// if (tfUserId.getText() != null && tfName.getText() != null &&
		// tfContact.getText() !=
		// null && tfEmail.getText() != null && tfUserPassword.getText() != null) {
		clearFieldsStyle();
		maskErrorLabels();
		if (!isNameValid()) {
//			lblName.setTextFill(Color.RED);
			tfName.setStyle("-fx-border-color: red; -fx-border-width: 2px ;");
			new animatefx.animation.Shake(tfName).play();
			errorNameField.setVisible(true);
			this.showErrorDialog("Name should not be empty");
			return;
		}
		if (!isContactValid()) {
//			lblContact.setTextFill(Color.RED);
			tfContact.setStyle("-fx-border-color: red; -fx-border-width: 2px ;");
			new animatefx.animation.Shake(tfContact).play();
			errorContact.setVisible(true);
			this.showErrorDialog("Phone number should be valid");
			return;
		}
		if (!isValidEmail()) {
//			lblEmail.setTextFill(Color.RED);
			tfEmail.setStyle("-fx-border-color: red; -fx-border-width: 2px ;");
			new animatefx.animation.Shake(tfEmail).play();
			errorEmail.setVisible(true);
			this.showErrorDialog("Please Enter valid Email");
			return;
		}
		if (!isValidUsername()) {
//			lblUserName.setTextFill(Color.RED);
			tfUserId.setStyle("-fx-border-color: red; -fx-border-width: 2px ;");
			new animatefx.animation.Shake(tfUserId).play();
			errorUserName.setVisible(true);
			this.showErrorDialog("Username cannot be empty");
			return;
		}
		if (!isValidPassword()) {
//			lblPassword.setTextFill(Color.RED);
			tfUserPassword.setStyle("-fx-border-color: red; -fx-border-width: 2px ;");
			new animatefx.animation.Shake(tfUserPassword).play();
			errorPassword.setVisible(true);
			this.showErrorDialog("Password cannot be empty");
			return;
		}
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
			showErrorDialog("User Registration successful!");
			clearFieldValues();
			ScreenController.goToLoginPage(event);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error Message: " + e.getMessage());
			e.printStackTrace();
		}
		// } else {
		// // Throw error for Registration validation
		// System.out.println("User Details are not filled!");
		// }

	}

	public void showErrorDialog(String errorMessage) {
		Dialog<String> dialog = new Dialog<String>();
		dialog.setTitle("Registration");
		ButtonType type = new ButtonType("OK", ButtonData.OK_DONE);
		dialog.setContentText(errorMessage);
		dialog.getDialogPane().getButtonTypes().add(type);
		dialog.showAndWait();
	}

	public boolean isNameValid() {
		String name = tfName.getText().trim();
		if (name.length() > 0) {
//			lblName.setTextFill(Color.GREEN);
			return true;
		}
		return false;
	}

	public boolean isContactValid() {
		String contact = tfContact.getText();
		// regex for checking if number is 10digits or not
		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher matcher = pattern.matcher(contact);
//		lblContact.setTextFill(Color.GREEN);
		return matcher.matches();
	}

	public boolean isValidEmail() {
		String email = tfEmail.getText();
		String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);

//		lblEmail.setTextFill(Color.GREEN);
		return matcher.matches();
	}

	public boolean isValidUsername() {
		String username = tfUserId.getText();
		if (username.length() > 0) {
//			lblUserName.setTextFill(Color.GREEN);
			return true;
		}
		return false;
	}

	public boolean isValidPassword() {
		String pass = tfUserPassword.getText();
		if (pass.length() > 0) {
//			lblPassword.setTextFill(Color.GREEN);
			return true;
		}
		return false;
	}

	private void clearFieldsStyle() {
		tfName.setStyle(null);
		tfContact.setStyle(null);
		tfEmail.setStyle(null);
		tfUserId.setStyle(null);
		tfUserPassword.setStyle(null);
	}

	private void maskErrorLabels() {
		errorContact.setVisible(false);
		errorEmail.setVisible(false);
		errorNameField.setVisible(false);
		errorPassword.setVisible(false);
		errorUserName.setVisible(false);

	}
	
	private void clearFieldValues() {
		tfName.setText(null);
		tfContact.setText(null);
		tfEmail.setText(null);
		tfUserId.setText(null);
		tfUserPassword.setText(null);

	}

	@FXML
	void goToLogin(ActionEvent event) {
		ScreenController.goToLoginPage(event);
	}

}