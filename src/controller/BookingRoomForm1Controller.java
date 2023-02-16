package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.ArrayList;

public class BookingRoomForm1Controller {
    public JFXComboBox cmbRoomType;
    public JFXComboBox cmbRoomNumber;
    public JFXComboBox cmbMealType;
    public JFXDatePicker dtCheckOut;
    public JFXDatePicker dtCheackIn;

    public JFXTextField txtFldName;
    public JFXTextField txtFldNic;
    public JFXTextField txtFldNumber;
    public JFXTextField txtFldEmail;
    public JFXTextField txtFldAddress;

    public String roomType;
    public String roomNumber;
    public String mealType;

    public void clearField(){
        txtFldName.clear();
        txtFldNic.clear();
        txtFldNumber.clear();
        txtFldEmail.clear();
        txtFldAddress.clear();
        cmbRoomType.getSelectionModel().clearSelection();
        cmbRoomNumber.getSelectionModel().clearSelection();
        cmbMealType.getSelectionModel().clearSelection();
        dtCheackIn.getEditor().clear();
        dtCheckOut.getEditor().clear();
    }

    private static ArrayList<String> roomTypeList = new ArrayList<>();
    static {
        roomTypeList.add("Single");
        roomTypeList.add("Double");
        roomTypeList.add("Triple");
        roomTypeList.add("Quad");
    }
    private static ArrayList<String> roomNumberList = new ArrayList<>();
    static{
        for (int i=1; i<=6; i++){
            roomNumberList.add("S"+i);
        }
        for (int j=1; j<=6; j++){
            roomNumberList.add("D"+j);
        }
        for (int b=1; b<=6; b++){
            roomNumberList.add("T"+b);
        }
        for (int q=1; q<=6; q++){
            roomNumberList.add("Q"+q);
        }
    }
    private static ArrayList<String> mealTypeList = new ArrayList<>();
    static {
        mealTypeList.add("Local");
        mealTypeList.add("Chinese");
        mealTypeList.add("French");
    }

    public void initialize(){

        ObservableList<String> obRoomType = FXCollections.observableArrayList();
        for (String temp:roomTypeList) {
            obRoomType.add(temp);
        }
        cmbRoomType.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            roomType = (String) newValue;
        });

        ObservableList<String> obRoomNumber = FXCollections.observableArrayList();
        for (String temp:roomNumberList) {
            obRoomNumber.add(temp);
        }
        cmbRoomType.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            roomNumber = (String) newValue;
        });

        ObservableList<String> obMealType = FXCollections.observableArrayList();
        for (String temp:mealTypeList) {
            obMealType.add(temp);
        }
        cmbRoomType.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            mealType = (String) newValue;
        });

        cmbRoomType.setItems(obRoomType);
        cmbRoomNumber.setItems(obRoomNumber);
        cmbMealType.setItems(obMealType);
    }

    public void btnBookNow(ActionEvent actionEvent) throws IOException {

        String name = txtFldName.getText();

        String nic = txtFldNic.getText();
        String number = txtFldNumber.getText();
        String room = roomType;
        String in = dtCheackIn.getValue().toString();
        String out = dtCheckOut.getValue().toString();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDetailsForm1.fxml"));
        Parent parent = loader.load();
        CustomerDetailsForm1Controller controller = loader.getController();
        controller.getData(name, nic, number, room, in, out);
        controller.trigger();
        clearField();
    }
}
