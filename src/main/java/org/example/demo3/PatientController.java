package org.example.demo3;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class PatientController {

    @FXML
    private Button retour;

    @FXML
    private Button creer_rend;

    @FXML
    private Button creer_consult;

    @FXML
    private Button creer_suivir;

    @FXML
    private Button creer_atelier;

    @FXML
    private Button afficher_rend;

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
    private void switchToAjouterPatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("Ajouter_patient.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    private void OnclickCreerRendezVous ( ActionEvent e) {
        try {
            HelloApplication.loadPage("Type_de_rendez_vous.fxml");

        }catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }

    }

    @FXML
    private void onclickconsultation (ActionEvent e) {
        try {
            HelloApplication.loadPage("prise_rendez_vous.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    private void OnclickSuivi ( ActionEvent e) {
        try {
            HelloApplication.loadPage("Creer_Suivi.fxml");

        } catch (IOException ex){
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }

    }
    @FXML
    private  void OnClickAtelier (ActionEvent e) {
        try {
            HelloApplication.loadPage("Creer_Atelier.fxml");
        }catch ( IOException ex) {
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
    private void switchToAfficherRendezVous(ActionEvent e) {
        try {
            HelloApplication.loadPage("Afficher_rendez.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
}