package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminHomeForm1Controller {
    public ToggleButton btnDashBoard;
    public ToggleButton btnCreateUsers;
    public ToggleButton btnChangePackages;
    public ToggleButton btnIncomeReport;
    public ToggleButton btnLogOut;
    public AnchorPane admincontext;

    void loadUi(String fileName) throws IOException {
        URL resource = getClass().getResource(""+fileName+".fxml");
        Parent load = FXMLLoader.load(resource);
        admincontext.getChildren().clear();
        admincontext.getChildren().add(load);
    }

    void logOutUi(String logOutFileName) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource(""+logOutFileName+".fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage =(Stage) this.admincontext.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

    public void toggleButton(ActionEvent actionEvent) throws IOException {
        if(actionEvent.getSource()==btnDashBoard){
            loadUi("DashBoardForm1");
        }
        if(actionEvent.getSource()==btnIncomeReport){
            loadUi("IncomeReportForm1");
        }
        if(actionEvent.getSource()==btnCreateUsers){
            loadUi("CreateUsersForm1");
        }
        if(actionEvent.getSource()==btnChangePackages){
            loadUi("ChangePackageForm1");
        }
        if(actionEvent.getSource()==btnLogOut){
            logOutUi("LogingForm");
        }
    }
}
