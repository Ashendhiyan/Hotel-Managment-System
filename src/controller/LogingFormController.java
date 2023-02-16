package controller;

import com.jfoenix.controls.JFXSnackbar;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LogingFormController {
    public AnchorPane loginPane;
    public TextField loginName;
    public PasswordField loginPassword;

    public void userLogin(ActionEvent actionEvent) throws IOException {
        if (loginPassword.getText().equals("User") & loginName.getText().equals("User")){
            Stage window = (Stage) loginPane.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("HomeForm1.fxml"))));
            window.centerOnScreen();
        }
        if (loginPassword.getText().equals("Admin") & loginName.getText().equals("Admin")){
            Stage window = (Stage) loginPane.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminHomeForm1.fxml"))));
            window.centerOnScreen();
        }

    }
}
