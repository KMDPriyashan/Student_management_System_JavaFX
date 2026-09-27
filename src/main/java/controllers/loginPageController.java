package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginPageController {

    public Button btnlogin;
    public Label lblusername;
    public Label lblpassword;
    public PasswordField txtPassword;
    public TextField txtusername;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String name = txtusername.getText();
        String password = txtPassword.getText();
        boolean b = checkloginCredintials(name,password);
        System.out.println(b);

        if(b){
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/home_page.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }
    }

    private boolean checkloginCredintials(String name, String password) {
        if (name.equals("nimal") && password.equals("1234")){
            return  true;
        }else {
            return false;
        }
    }
}
