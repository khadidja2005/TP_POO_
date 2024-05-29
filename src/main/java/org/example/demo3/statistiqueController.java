package org.example.demo3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import java.io.IOException;

public class statistiqueController {

    @FXML
    private PieChart pieChart;

    @FXML
    private void initialize() {
        // Initial chart display (you can choose any default or leave it empty)
        showTroublesSeveresChart();
    }

    @FXML
    private void showTroublesSeveresChart() {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Severe Case 1", 10),
                new PieChart.Data("Severe Case 2", 15)
        );
        pieChart.setData(pieChartData);
        pieChart.setTitle("Troubles sévères");
    }

    @FXML
    private void showTroublesModeresChart() {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Moderate Case 1", 20),
                new PieChart.Data("Moderate Case 2", 15)
        );
        pieChart.setData(pieChartData);
        pieChart.setTitle("Troubles modérés");
    }

    @FXML
    private void showTroublesLegersChart() {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Light Case 1", 10),
                new PieChart.Data("Light Case 2", 10)
        );
        pieChart.setData(pieChartData);
        pieChart.setTitle("Troubles légers");
    }

    @FXML
    private void showAucunTroubleChart() {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("No Trouble Case 1", 10),
                new PieChart.Data("No Trouble Case 2", 10)
        );
        pieChart.setData(pieChartData);
        pieChart.setTitle("Aucun trouble");
    }

    @FXML
    private void handleRetourButtonAction(ActionEvent event) {
        try {
            Parent pageAcceuilParent = FXMLLoader.load(getClass().getResource("page_acceuil.fxml"));
            Scene pageAcceuilScene = new Scene(pageAcceuilParent);

            // Get the current stage
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(pageAcceuilScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
