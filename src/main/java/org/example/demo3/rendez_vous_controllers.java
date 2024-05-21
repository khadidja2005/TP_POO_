package org.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class rendez_vous_controllers {
    @FXML
    private Button retour;

    @FXML
    private Button gererPatients;

    @FXML
    private Button AfficherPas;

    @FXML
    private Button AjouterPas;

    @FXML

    private void initialize() {
        System.out.println("Rendez-vous controller initialized");
    }


    @FXML
    private void HandelRetourAction2(ActionEvent e) {
        try {
            HelloApplication.loadPage("page_acceuil.fxml");
        } catch (IOException ex){
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }




    @FXML
    private void switchTolistePatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("liste_patients.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    private void switchToAfficherPatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("Afficher_patient.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    private void switchToAjouterPatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("Ajouter_patient.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }


}

