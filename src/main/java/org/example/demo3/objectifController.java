package org.example.demo3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.prefs.Preferences;

public class objectifController {

    @FXML private CheckBox checkBox1;
    @FXML private TextArea noteArea1;
    @FXML private CheckBox checkBox2;
    @FXML private TextArea noteArea2;
    @FXML private CheckBox checkBox3;
    @FXML private TextArea noteArea3;
    @FXML private CheckBox checkBox4;
    @FXML private TextArea noteArea4;
    @FXML private TextArea recommandationsArea;
    @FXML private BarChart<String, Number> barChart;
    @FXML private Button validerButton;

    private Preferences prefs;

    @FXML
    public void GoToList(ActionEvent e) {
        try {
            HelloApplication.loadPage("Afficher_un_rend.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void initialize() {
        prefs = Preferences.userNodeForPackage(ficheSuivieController.class);

        loadPreferences();

        validerButton.setOnAction(e -> {
            savePreferences();
            updateBarChart(); // Ensure the bar chart is updated when the button is clicked
        });
    }

    private void loadPreferences() {
        checkBox1.setSelected(prefs.getBoolean("checkBox1", false));
        noteArea1.setText(prefs.get("noteArea1", "0"));
        checkBox2.setSelected(prefs.getBoolean("checkBox2", false));
        noteArea2.setText(prefs.get("noteArea2", "0"));
        checkBox3.setSelected(prefs.getBoolean("checkBox3", false));
        noteArea3.setText(prefs.get("noteArea3", "0"));
        checkBox4.setSelected(prefs.getBoolean("checkBox4", false));
        noteArea4.setText(prefs.get("noteArea4", "0"));
        recommandationsArea.setText(prefs.get("recommandationsArea", ""));

        updateBarChart(); // Ensure the bar chart is updated when the application starts
    }

    private void savePreferences() {
        prefs.putBoolean("checkBox1", checkBox1.isSelected());
        prefs.put("noteArea1", noteArea1.getText());
        prefs.putBoolean("checkBox2", checkBox2.isSelected());
        prefs.put("noteArea2", noteArea2.getText());
        prefs.putBoolean("checkBox3", checkBox3.isSelected());
        prefs.put("noteArea3", noteArea3.getText());
        prefs.putBoolean("checkBox4", checkBox4.isSelected());
        prefs.put("noteArea4", noteArea4.getText());
        prefs.put("recommandationsArea", recommandationsArea.getText());

        updateBarChart(); // Ensure the bar chart is updated when the preferences are saved
    }

    private void updateBarChart() {
        ObservableList<XYChart.Series<String, Number>> data = FXCollections.observableArrayList();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Scores");

        if (checkBox1.isSelected()) {
            series.getData().add(new XYChart.Data<>("Objectif 1", Integer.parseInt(noteArea1.getText())));
        }
        if (checkBox2.isSelected()) {
            series.getData().add(new XYChart.Data<>("Objectif 2", Integer.parseInt(noteArea2.getText())));
        }
        if (checkBox3.isSelected()) {
            series.getData().add(new XYChart.Data<>("Objectif 3", Integer.parseInt(noteArea3.getText())));
        }
        if (checkBox4.isSelected()) {
            series.getData().add(new XYChart.Data<>("Objectif 4", Integer.parseInt(noteArea4.getText())));
        }

        barChart.getData().clear();
        barChart.getData().add(series);
    }


}
