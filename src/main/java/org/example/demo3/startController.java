package org.example.demo3;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class startController {
    @FXML
    private Button demarrer;

    @FXML
    private void switchTologin(ActionEvent e) {
        try {
            HelloApplication.loadPage("connection.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
}