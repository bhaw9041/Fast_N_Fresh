package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import model.DatabaseConnector;

public class LoginController extends ProductBaseController {
	
	@FXML
	private TextField tfUsername;
	
	@FXML
	private PasswordField tfPassword;
	
	@FXML
	private Label lblPassword;
	
	@FXML
	private Label lblUsername;
	
	
	public void acceptUsername() {
		String userName = tfUsername.getText();
	}
	
	public void acceptPassword() {
		String password = tfPassword.getText();
	}

	@FXML
	private Button btnRegister;

	@FXML
	private Button btnSignIn;

	@FXML
	public void goToCatalog(ActionEvent event) {
		try {
			Connection conn = DatabaseConnector.getInstance();
			Statement st = conn.createStatement();
			String query = "select password, full_name from user_info where user_name = '" + tfUsername.getText() + "'";
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				String storedPassword = rs.getString(1);
				if (storedPassword.equals(tfPassword.getText())) {
					// Pop up login successful
					userId = tfUsername.getText();
					userName = rs.getString(2);
					tfPassword.setBorder(null);
//					lblPassword.setTextFill(Color.GREEN);
					Dialog<String> dialog = new Dialog<String>();
					dialog.setTitle("Login");
					ButtonType type = new ButtonType("ok", ButtonData.OK_DONE);
					dialog.setContentText("Login successful!");
					dialog.getDialogPane().getButtonTypes().add(type);
					dialog.showAndWait();
					
					System.out.println("Login successful!");
					ScreenController.goToCatalogPage(event);
				} else {
					// Throw error saying Invalid Password.
					
					Dialog<String> dialog = new Dialog<String>();
					dialog.setTitle("Login");
					ButtonType type = new ButtonType("ok", ButtonData.OK_DONE);
//					lblPassword.setTextFill(Color.RED);
					dialog.setContentText("Incorrect Password");
					dialog.getDialogPane().getButtonTypes().add(type);
					dialog.showAndWait();
				
					System.out.println("Incorrect Password");
				}
			} else {
				// Throw error saying Invalid UserName.
				System.out.println("Incorrect Username");
				
				Dialog<String> dialog = new Dialog<String>();
				dialog.setTitle("Login");
//				lblUsername.setTextFill(Color.RED);
				ButtonType type = new ButtonType("ok", ButtonData.OK_DONE);
				dialog.setContentText("Incorrect Username");
				dialog.getDialogPane().getButtonTypes().add(type);
				dialog.showAndWait();
				
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void goToRegistration(ActionEvent event) {

		ScreenController.goToRegistrationPage(event);
	}

}
