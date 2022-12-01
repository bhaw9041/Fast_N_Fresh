package controller;


import javafx.fxml.FXML;
//import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class CatalogController extends ProductBaseController {
 
    
    @FXML
    public void goToFruits(ActionEvent event) {
    	
    	ScreenController.goToFruitsPage(event);
    }
    
    @FXML
    public void goToVegetables(ActionEvent event) {
    	
    	ScreenController.goToVegetablesPage(event);
    }
    
    @FXML
    public void goToSnacks(ActionEvent event) {
    	
    	ScreenController.goToSnacksPage(event);
    }

    @FXML
    public void goToDairy(ActionEvent event) {
    	
    	ScreenController.goToDairyPage(event);
    }
    
    
    @FXML
    void goToLogin(ActionEvent event) {
    	logOff();
    	ScreenController.goToLoginPage(event);
    }
    
}
