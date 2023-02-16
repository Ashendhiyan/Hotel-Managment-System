package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class IncomeReportForm1Controller {
    public AnchorPane contextReport;
    public JFXButton btnMonthly;
    public JFXButton btnAnnually;

    void loadUi(String fileName) throws IOException {
        URL resource = getClass().getResource(""+fileName+".fxml");
        Parent load = FXMLLoader.load(resource);
        contextReport.getChildren().clear();
        contextReport.getChildren().add(load);
    }

    public void btnMonthly(ActionEvent actionEvent) throws IOException {
        loadUi("MonthlyForm1");
    }

    public void btnAnnually(ActionEvent actionEvent) throws IOException {
        loadUi("AnnuallyForm1");
    }
}
