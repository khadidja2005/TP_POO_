package org.example.demo3;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.demo3.classes.Dossier;
import org.example.demo3.classes.Manage_patients;
import org.example.demo3.classes.Patient;

import java.io.IOException;

public class PatientController {
    @FXML
    private TextField Nom_patient ;
    @FXML
    private TextField Prenom_patient;
    @FXML
    private TextField adresse ;
    @FXML
    private TextField Date_naissance ;
    @FXML
    private TextField lieu_naissance ;


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
    private Label successMessageLabel;

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
    public void switchToAjouterPatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("Ajouter_patient.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void OnclickCreerRendezVous ( ActionEvent e) {
        try {
            HelloApplication.loadPage("Type_de_rendez_vous.fxml");

        }catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }

    }

    @FXML
    public void onclickconsultation (ActionEvent e) {
        try {
            HelloApplication.loadPage("prise_rendez_vous.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    public void OnclickSuivi ( ActionEvent e) {
        try {
            HelloApplication.loadPage("Creer_Suivi.fxml");

        } catch (IOException ex){
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }

    }
    @FXML
    public   void OnClickAtelier (ActionEvent e) {
        try {
            HelloApplication.loadPage("Creer_Atelier.fxml");
        }catch ( IOException ex) {
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
    public void switchToAfficherRendezVous(ActionEvent e) {
        try {
            HelloApplication.loadPage("Afficher_rendez.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    public void ajouterpatient (ActionEvent e) {
        try {
        String nom = Nom_patient.getText();
        String prenom = Prenom_patient.getText();
        String adress = adresse.getText();
        String date_naissance = Date_naissance.getText();
        String lieu_naissanc = lieu_naissance.getText();
        Manage_patients mp = new Manage_patients(10);
        //mp.displayPatients();
        mp.loadPatients();
            Patient patient = new Patient();
            patient.setAdresse(adress);
            patient.setDate_de_naissance(date_naissance);
            patient.setNom(nom);
            patient.setPrenom(prenom);
            patient.setLieu_de_naissance(lieu_naissanc);
            Dossier doc = new Dossier();
            patient.setDossier(doc);
            mp.addPatient(patient);
            mp.displayPatients();
            successMessageLabel.setText("Patient ajouté avec succès");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.GREEN);

        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
            successMessageLabel.setText("Erreur lors de l'ajout du patient");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.RED);

        }

    }

}