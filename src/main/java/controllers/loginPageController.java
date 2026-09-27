package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class loginPageController {


    @FXML
    private Button btnSubmit;

    @FXML
    public Button btnsave;

    @FXML
    void btnSubmitOnAction(ActionEvent event) {
        System.out.println("Butten clicked..!");
    }

    public void btnsaveOnAction(ActionEvent actionEvent) {
        System.out.println("Save Butten Cliked..!");
    }

    public void btnHomeNavigationOnAction(ActionEvent actionEvent) {
        System.out.println("Navigation to the Home page...");

    }
}
