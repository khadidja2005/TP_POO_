package org.example.demo3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.example.demo3.classes.*;
import static org.example.demo3.rendez_vous_controllers.item_pat;

import java.io.IOException;
import java.util.ArrayList;

public class PatientController {
    private static boolean initialized = false;
    public static Rendez_vous item_RDV;


    @FXML
    public TextField nom_pat = new TextField();
    @FXML
    public TextField prenom_pat = new TextField();

    @FXML
    public TextField adress_pat = new TextField();
    @FXML
    public TextField dat_naiss = new TextField();
    @FXML
    public TextField lieu_naiss = new  TextField();
    @FXML
    private TextField Nom_patient ;
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
    private TextField patient1 = new TextField();

    @FXML
    private TextField patient2 = new TextField();

    @FXML
    private TextField patient3 = new TextField();

    @FXML
    private TextField patient4 = new TextField();

    @FXML
    private TextField patient5 = new TextField();

    @FXML
    private TextField patient6 = new TextField();

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
    ListView<Rendez_vous> listViewRDV;
   @FXML
   private void initialize() {
       initializeData();
       System.out.println("Patient controller initialized");
    }
    private void initializeData() {
       if(nom_pat != null && prenom_pat!=null && adress_pat != null && dat_naiss !=null && lieu_naiss != null && item_pat != null )
        nom_pat.setText(item_pat.getNom());
        prenom_pat.setText(item_pat.getPrenom());
        adress_pat.setText(item_pat.getAdresse());
        dat_naiss.setText(item_pat.getDate_de_naissance());
        lieu_naiss.setText(item_pat.getLieu_de_naissance());
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
    public void HandelRetourAction2(ActionEvent e) {
        try {
            HelloApplication.loadPage("page_acceuil.fxml");
        } catch (IOException ex){
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
  public void retourvers_page_afficher_patient(ActionEvent e) {
       try {
         HelloApplication.loadPage("Afficher_patient.fxml");

       } catch(IOException ex) {
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
            Manage_patients mp = new Manage_patients(20);
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
            mp.loadPatients();
            //doc.addRendezVous(newSuivi);
            mp.getPatients().get(patientIndex).setDossier(doc);
            //item_pat.setDossier(doc);
            mp.savePatients();
            //Dossier doc = mp.getPatients().get(patientIndex).getDosssier();
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
            mp.loadPatients();

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
            //Dossier doc = mp.getPatients().get(patientIndex).getDosssier();
            Dossier doc = new Dossier();
            doc.addRendezVous(newConsultation);
            mp.loadPatients();
            mp.getPatients().get(patientIndex).setDossier(doc);
            mp.savePatients();
            item_pat.setDossier(doc);
            //Dossier doc =item_pat.getDosssier();


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
    @FXML
    public void switchtolisterendezvous( ActionEvent e) {
     try {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Afficher_rendez.fxml"));
         Parent root = loader.load();
         // Get the controller for the loaded FXML
         PatientController controller = loader.getController();

         ArrayList<Rendez_vous> RDV = new ArrayList<Rendez_vous>();

         RDV = item_pat.getDosssier().get_rendez_vous();
         ObservableList<Rendez_vous> list_RDV = FXCollections.observableArrayList(RDV);
         System.out.println("ObservableList contents: " + list_RDV);
         if (controller.listViewRDV != null) {
             controller.listViewRDV.setItems(list_RDV);
             System.out.println("ListView contents: " + controller.listViewRDV.getItems());
             controller.listViewRDV.setCellFactory(new Callback<>() {
                 @Override
                 public ListCell<Rendez_vous> call(ListView<Rendez_vous> listView) {
                     return new ListCell<Rendez_vous>() {
                         @Override
                         protected void updateItem(Rendez_vous item, boolean empty) {
                             super.updateItem(item, empty);
                             System.out.println("item: " + item);
                             if (item != null && !empty) {
                                 HBox hBox = new HBox(20);
                                 hBox.setPrefHeight(50);
                                 hBox.setAlignment(Pos.CENTER_LEFT);

                                 Label name = new Label("Rendez_vous" + (getIndex() + 1));
                                 Label nom = new Label(item.getDate());
                                 Label prenom = new Label(item.getDuree());

                                 name.setPrefWidth(70);
                                 nom.setPrefWidth(150);
                                 prenom.setPrefWidth(150);

                                 Button afficherButton = new Button("Afficher RDV");

                                 afficherButton.setStyle("-fx-background-color:white; -fx-text-fill: #3191ff; -fx-font-weight: 700;");

                                 afficherButton.setOnAction(event -> {
                                     //PC.afficherinfo_patient();
                                     try {
                                         item_RDV = item ;
                                         HelloApplication.loadPage("Afficher_un_rend.fxml");
                                     } catch (IOException ex) {
                                         throw new RuntimeException(ex);
                                     }
                                     //PC.afficherinfo_patient(item);
                                 });

                                 setOnMouseEntered(event -> setStyle("-fx-background-color: #e6e7e5;"));
                                 setOnMouseExited(event -> setStyle("-fx-background-color: white;"));

                                 HBox buttonsBox = new HBox(20);
                                 buttonsBox.getChildren().addAll(afficherButton);
                                 buttonsBox.setAlignment(Pos.CENTER_LEFT);

                                 hBox.getChildren().addAll(name, nom, prenom, buttonsBox);
                                 setGraphic(hBox);
                             } else {
                                 setGraphic(null);
                                 System.out.println("item is null");
                             }
                         }
                     };
                 }
             });
             controller.listViewRDV.refresh();
         } else {
            System.out.println("ListView is null in the loaded controller");
        }

        // Set the new scene
        Stage stage = (Stage) ((Button) e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


     }catch (IOException ex) {
         ex.printStackTrace();
         System.out.println("Error: " + ex.getMessage());


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
