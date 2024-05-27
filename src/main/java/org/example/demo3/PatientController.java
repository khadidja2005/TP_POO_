package org.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.MenuButton;
import javafx.scene.control.DatePicker;
import org.example.demo3.classes.*;
import static org.example.demo3.rendez_vous_controllers.item_pat;

import java.io.IOException;

public class PatientController {
    private static boolean initialized = false;
    @FXML
    public TextField nom_pat;
    @FXML
    public TextField prenom_pat;

    @FXML
    public TextField adress_pat ;
    @FXML
    public TextField dat_naiss;
    @FXML
    public TextField lieu_naiss;
    @FXML
    private TextField Nom_patient;
    @FXML
    private TextArea Observation_consultation;
    @FXML
    private TextField Prenom_patient;
    @FXML
    private TextField adresse;
    @FXML
    private TextField Date_naissance;
    @FXML
    private TextField lieu_naissance;

    @FXML
    private DatePicker Agenda;

    @FXML
    private TextField Heure;

    @FXML
    private MenuButton typeSeanceMenuButton;

    @FXML
    private TextField patientNumero;

    @FXML
    private TextField Observation;

    @FXML
    private TextField thematique;

    @FXML
    private TextField patient1;

    @FXML
    private TextField patient2;

    @FXML
    private TextField patient3;

    @FXML
    private TextField patient4;

    @FXML
    private TextField patient5;

    @FXML
    private TextField patient6;

    @FXML
    private TextField AgePatient;

    @FXML
    private Label lblError;

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
   public void initialize() {
      if(!initialized) {
           //System.out.println("Patient controller initialized");
           nom_pat.setText(item_pat.getNom());
           prenom_pat.setText(item_pat.getPrenom());
           adress_pat.setText(item_pat.getAdresse());
           dat_naiss.setText(item_pat.getDate_de_naissance());
           lieu_naiss.setText(item_pat.getLieu_de_naissance());
           initialized = true;
       }
       System.out.println("Patient controller initialized");

    }
    @FXML
    void handleSessionTypeSelection(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        String selectedSessionType = menuItem.getText();
        typeSeanceMenuButton.setText(selectedSessionType);
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
    public void switchToAjouterPatients(ActionEvent e) {
        try {
            HelloApplication.loadPage("Ajouter_patient.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void OnclickCreerRendezVous(ActionEvent e) {
        try {
            HelloApplication.loadPage("Type_de_rendez_vous.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void onclickconsultation(ActionEvent e) {
        try {
            HelloApplication.loadPage("prise_rendez_vous.fxml");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void OnclickSuivi(ActionEvent e) {
        try {
            HelloApplication.loadPage("Creer_Suivi.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void OnClickAtelier(ActionEvent e) {
        try {
            HelloApplication.loadPage("Creer_Atelier.fxml");
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
    public void switchToAfficherRendezVous(ActionEvent e) {
        try {
            HelloApplication.loadPage("Afficher_rendez.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void ajouterpatient(ActionEvent e) {
        try {
            String nom = Nom_patient.getText();
            String prenom = Prenom_patient.getText();
            String adress = adresse.getText();
            String date_naissance = Date_naissance.getText();
            String lieu_naissanc = lieu_naissance.getText();
            Manage_patients mp = new Manage_patients(10);
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

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
            successMessageLabel.setText("Erreur lors de l'ajout du patient");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.RED);
        }
    }

    @FXML
    void ajoutersuivi(ActionEvent e) {
        try {
            int patientText = Integer.parseInt(patientNumero.getText());

            Manage_patients mp = new Manage_patients(10);
            mp.loadPatients();
            mp.displayPatients();
            boolean patientFound = false;
            int patientIndex = -1;

            System.out.println("Numéro de dossier du premier patient : " + mp.getPatients().get(0).getDosssier().getNumero());

            for (int i = 0; i < mp.getPatients().size(); i++) {
                if (mp.getPatients().get(i) != null && mp.getPatients().get(i).getDosssier().getNumero() == patientText) {
                    patientFound = true;
                    patientIndex = i;
                    break;
                }
            }

            if (!patientFound) {
                successMessageLabel.setText("Le numéro de dossier: " + patientText + " n'existe pas");
                successMessageLabel.setTextFill(javafx.scene.paint.Color.RED);
                return;
            }

            String date = Agenda.getValue().toString();
            String heure = Heure.getText();
            String observation = Observation.getText();
            String sessionType = typeSeanceMenuButton.getText();

            Suivie newSuivi = new Suivie(sessionType, patientText, false, "1h", observation, date, heure);

            Dossier doc = mp.getPatients().get(patientIndex).getDosssier();
            doc.addRendezVous(newSuivi);

            successMessageLabel.setText("Rendez-vous ajouté avec succès");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.GREEN);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
            successMessageLabel.setText("Erreur lors de l'ajout du rendez-vous");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.RED);
        }
    }

    public void ajouteratelier(ActionEvent e) {
        try {
            int[] patientNumbers = {
                    Integer.parseInt(patient1.getText()),
                    Integer.parseInt(patient2.getText()),
                    Integer.parseInt(patient3.getText()),
                    Integer.parseInt(patient4.getText()),
                    Integer.parseInt(patient5.getText()),
                    Integer.parseInt(patient6.getText())
            };

            Manage_patients mp = new Manage_patients(10);
            mp.loadPatients(); // Assuming this method loads the patients into the array

            String date = Agenda.getValue().toString();
            String heure = Heure.getText();
            String thematiqueText = thematique.getText();
            String observation = Observation.getText();
            Atelier newAtelier = new Atelier(thematiqueText, false, "1h", observation, date, heure);

            // Validate all patient numbers and get their indexes
            int[] patientIndexes = new int[patientNumbers.length];
            boolean allPatientsFound = true;

            for (int i = 0; i < patientNumbers.length; i++) {
                boolean patientFound = false;
                for (int j = 0; j < mp.getPatients().size(); j++) {
                    if (mp.getPatients().get(j) != null && mp.getPatients().get(j).getDosssier().getNumero() == patientNumbers[i]) {
                        patientFound = true;
                        patientIndexes[i] = j;
                        break;
                    }
                }
                if (!patientFound) {
                    lblError.setText("Le numéro de dossier: " + patientNumbers[i] + " n'existe pas");
                    lblError.setTextFill(javafx.scene.paint.Color.RED);
                    allPatientsFound = false;
                    break; // Stop checking further if one patient is not found
                }
            }

            // If all patients are found, add the Atelier to their dossiers
            if (allPatientsFound) {
                for (int index : patientIndexes) {
                    Dossier dossier = mp.getPatients().get(index).getDosssier();
                    dossier.addRendezVous(newAtelier);
                }
                successMessageLabel.setText("Atelier ajouté avec succès à tous les patients");
                successMessageLabel.setTextFill(javafx.scene.paint.Color.GREEN);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
            successMessageLabel.setText("Erreur lors de l'ajout de l'atelier");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.RED);
        }
    }



    @FXML
    void ajouterconsultation(ActionEvent e) {
        try {
            Manage_patients mp = new Manage_patients(10);
            mp.loadPatients();
            mp.displayPatients();

            String date = Agenda.getValue().toString();
            String heure = Heure.getText();
            String observation = Observation_consultation.getText();
            String nom = Nom_patient.getText();
            String prenom = Prenom_patient.getText();
            int age = Integer.parseInt(AgePatient.getText());

            System.out.println("Numéro de dossier du premier patient : " + mp.getPatients().get(0).getDosssier().getNumero());

            // Find the patient by name and surname
            boolean patientFound = false;
            int patientIndex = -1;

            for (int i = 0; i < mp.getPatients().size(); i++) {
                if (mp.getPatients().get(i) != null && mp.getPatients().get(i).getNom().equals(nom) && mp.getPatients().get(i).getPrenom().equals(prenom)) {
                    patientFound = true;
                    patientIndex = i;
                    break;
                }
            }

            // If the patient is not found, show an error message
            if (!patientFound) {
                successMessageLabel.setText("Le patient " + nom + " " + prenom + " n'existe pas");
                successMessageLabel.setTextFill(javafx.scene.paint.Color.RED);
                return;
            }

            // Create a new consultation
            Consultation newConsultation = new Consultation(nom, prenom, age, true, "1h", observation, date, heure);

            // Add the consultation to the patient's dossier
            Dossier doc = mp.getPatients().get(patientIndex).getDosssier();
            doc.addRendezVous(newConsultation);

            // Show success message
            successMessageLabel.setText("Rendez-vous ajouté avec succès");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.GREEN);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
            successMessageLabel.setText("Erreur lors de l'ajout du rendez-vous");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.RED);
        }
    }

    /*@FXML
    public void afficherinfo_patient() {
        System.out.println("Afficher les infos du patient: " + item_pat);
        try {
            HelloApplication.loadPage("Afficher_patient.fxml");
            System.out.println("Patient: " + item_pat.getPrenom());
            System.out.println("Patient: " + item_pat.getNom());
            System.out.println("Patient: " + item_pat.getAdresse());
            System.out.println("Patient: " + item_pat.getDate_de_naissance());
            System.out.println("Patient: " + item_pat.getLieu_de_naissance());
            nom_pat.setText(item_pat.getNom());
            prenom_pat.setText(item_pat.getPrenom());
            adress_pat.setText(item_pat.getAdresse());
            dat_naiss.setText(item_pat.getDate_de_naissance());
            lieu_naiss.setText(item_pat.getLieu_de_naissance());
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }

    }*/

}
