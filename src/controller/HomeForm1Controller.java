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

public class HomeForm1Controller {
    public ToggleButton btnDashBoard;
    public ToggleButton btnPackages;
    public ToggleButton btnLogOut;
    public AnchorPane dashBoardPane;
    public AnchorPane context;
    public ToggleButton btnBookingRoom;
    public ToggleButton btnCustomerDetails;

    void loadUi(String fileName) throws IOException {
        URL resource = getClass().getResource(""+fileName+".fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }

    void logOutUi(String logOutFileName) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource(""+logOutFileName+".fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage =(Stage) this.context.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

    public void toggleButton(ActionEvent actionEvent) throws IOException {
        if(actionEvent.getSource()==btnDashBoard){
            loadUi("DashBoardForm1");
        }
        if(actionEvent.getSource()==btnPackages){
            loadUi("HotelPackageForm1");
        }
        if(actionEvent.getSource()==btnBookingRoom){
            loadUi("BookingRoomForm1");
        }
        if(actionEvent.getSource()==btnCustomerDetails){
            loadUi("CustomerDetailsForm1");
        }
        if(actionEvent.getSource()==btnLogOut){
            //new Alert(Alert.AlertType.WARNING,"Are You Sure?", ButtonType.CLOSE).show();
            logOutUi("LogingForm");
        }
    }
}
