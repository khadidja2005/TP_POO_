package org.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import org.example.demo3.classes.Manage_doctor;

import java.io.IOException;

public class ParametreController {

    @FXML
    private TextField nomField = new TextField();

    @FXML
    private TextField prenomField=new TextField();

    @FXML
    private TextField emailField= new TextField();

    @FXML
    private TextField phoneField= new TextField();

    @FXML
    private TextField addressField = new TextField();

    @FXML
    private PasswordField passwordField = new PasswordField();

    @FXML
    private Button retour;

    @FXML
    private Label successMessageLabel;

    private static Manage_doctor md = new Manage_doctor(10);

    @FXML
    public void initialize() {
        // Initialize the UI elements with data when the page is opened directly
        initializeData();
    }

    private void initializeData() {
        // Initialize with existing data
        nomField.setText(md.getOrthophoniste(0).getNom());
        prenomField.setText(md.getOrthophoniste(0).getPrenom());
        emailField.setText(md.getOrthophoniste(0).getAdresse_email());
        phoneField.setText(md.getOrthophoniste(0).getNumero_telephone());
        addressField.setText(md.getOrthophoniste(0).getAdresse());
        passwordField.setText(md.getOrthophoniste(0).getMot_de_passe());
    }

    @FXML
    public void modifierOrthophoniste(ActionEvent e) {
        try {
            // Sauvegarde les informations mises à jour dans l'objet Manage_doctor
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String address = addressField.getText();
            String password = passwordField.getText();

            // Met à jour les informations dans l'objet Manage_doctor
            md.getOrthophoniste(0).setAdresse(address);
            md.getOrthophoniste(0).setNumero_telephone(phone);
            md.getOrthophoniste(0).setAdresse_email(email);
            md.getOrthophoniste(0).setNom(nom);
            md.getOrthophoniste(0).setPrenom(prenom);
            md.getOrthophoniste(0).setMot_de_passe(password);
            md.saveOrthos();

            // Met à jour les champs d'affichage
            initializeData(); // Rafraîchit les données affichées sur la page

            // Affichage pour le débogage
            System.out.println(md.getOrthophoniste(0).getNom());
            System.out.println(prenom);
            System.out.println(email);
            System.out.println(phone);
            System.out.println(address);
            System.out.println(password);

            successMessageLabel.setText("Informations mises à jour avec succès");
            successMessageLabel.setTextFill(Color.GREEN);
        } catch (Exception ex) {
            ex.printStackTrace();
            successMessageLabel.setText("Erreur lors de la mise à jour des informations");
            successMessageLabel.setTextFill(Color.RED);
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
}
