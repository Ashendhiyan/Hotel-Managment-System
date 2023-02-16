package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;
import view.tm.CustomerTM;

import java.util.ArrayList;

public class CustomerDetailsForm1Controller {

    static ArrayList<Customer> customerList = new ArrayList();
    public TableView<CustomerTM> tblCustomer;

    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colTpNo;
    public TableColumn colRoomType;
    public TableColumn colCheckIn;
    public TableColumn colCheckOut;
    public TableColumn colCancel;

    public String customerName;
    public String customerNic;
    public String customerTelNo;
    public String customerRoomType;
    public String customerCheckIn;
    public String customerCheckOut;

    public void getData(String name, String nic, String number, String room, String in, String out) {
        this.customerName = name;
        this.customerNic = nic;
        this.customerTelNo = number;
        this.customerRoomType = room;
        this.customerCheckIn = in;
        this.customerCheckOut = out;
        System.out.println("get data: "+name);
    }

    public void initialize() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colTpNo.setCellValueFactory(new PropertyValueFactory<>("telNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colCheckIn.setCellValueFactory(new PropertyValueFactory<>("checkIn"));
        colCheckOut.setCellValueFactory(new PropertyValueFactory<>("checkOut"));
        colCancel.setCellValueFactory(new PropertyValueFactory<>("btn"));

        loadAllCustomers();
    }

    public void trigger() {
        Customer customer = new Customer(customerName, customerNic, customerTelNo, customerRoomType, customerCheckIn, customerCheckOut);
        System.out.println("trigger data: "+customer.toString());
        if (customerList.add(customer)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Save..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        System.out.println(customerList.isEmpty());
    }

    private void loadAllCustomers() {
        System.out.println(customerName);
        if (!customerList.isEmpty()) {
//            System.out.println("in");
            ObservableList<CustomerTM> tmObservableList = FXCollections.observableArrayList();
            for (Customer temp : customerList) {
                Button btn = new Button("Remove");
                tmObservableList.add(new CustomerTM(temp.getName(), temp.getNic(), temp.getTelNo(), temp.getRoomType(), temp.getCheckIn(), temp.getCheckOut(), btn));
            }
            tblCustomer.setItems(tmObservableList);
        }else {
            System.out.println("No data Found");
        }
    }
}
