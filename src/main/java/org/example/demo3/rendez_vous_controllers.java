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

    public void initialize() {
        System.out.println("Rendez-vous controller initialized");
    }


    @FXML
    public void HandelRetourAction2(ActionEvent e) {
        try {
            HelloApplication.loadPage("page_acceuil.fxml");
        } catch (IOException ex){
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }




    @FXML
    public void switchTolistePatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("liste_patients.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void switchToAfficherPatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("Afficher_patient.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    public void switchToAjouterPatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("Ajouter_patient.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void OnclickParametre(ActionEvent e) {
        try {
            HelloApplication.loadPage("parametres.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void OnclickgestionInfo(ActionEvent e) {
        try {
            HelloApplication.loadPage("gestion_info.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

}

