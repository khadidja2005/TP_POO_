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

import java.io.IOException;
import java.util.ArrayList;

import static org.example.demo3.PatientController.item_RDV;
import static org.example.demo3.rendez_vous_controllers.item_pat;

public class ficheSuivieController {

    public static Fichier_de_suivi item_FCH ;
    @FXML
    private Label Date_rend= new Label();

    @FXML
    private Label Heure_rend = new Label();

    @FXML
    private Label Observation_rend = new Label();

    @FXML
    private Label Type_rend = new Label();


    @FXML
    private ListView<Fichier_de_suivi> listViewFCH;


    @FXML
    private TextField O1 = new TextField();

    @FXML
    private TextField O2= new TextField();

    @FXML
    private TextField O3= new TextField();


    @FXML
    private TextField O4= new TextField();


    @FXML
    private MenuButton typeSeanceMenuButton1;
    @FXML
    private MenuButton typeSeanceMenuButton2;
    @FXML
    private MenuButton typeSeanceMenuButton3;
    @FXML
    private MenuButton typeSeanceMenuButton4;
    @FXML
    private Label successMessageLabel = new Label();

    private String selectedTerm1;
    private String selectedTerm2;
    private String selectedTerm3;
    private String selectedTerm4;


    @FXML
    public void initialize() {
        // Initialize the UI elements with data when the page is opened directly
        initializeData();
    }

    private void initializeData() {
        // Initialize with existing data
        Date_rend.setText(item_RDV.getDate());
        Heure_rend.setText(item_RDV.getHeure());
        Observation_rend.setText(item_RDV.getObservation());
        if (item_RDV instanceof Atelier) {
            Type_rend.setText("Atelier");
        }
        if (item_RDV instanceof Consultation) {
            Type_rend.setText("Consultation");
        }
        if (item_RDV instanceof Suivie) {
            Type_rend.setText("Suivie");
        }
    }

    @FXML
    public void switchToListeRDV(ActionEvent e) {
        try {
            HelloApplication.loadPage("Afficher_rendez.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    public void switchToRDV(ActionEvent e) {
        try {
            HelloApplication.loadPage("Afficher_un_rend.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @FXML
    public void switchToAjouterFCH(ActionEvent e) {
        try {
            HelloApplication.loadPage("Ajouter_ficheSuivie.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }



    @FXML
    public void AjouterficheSuivi(ActionEvent e) {
        try {
            System.out.println("AjouterficheSuivi method called.");

            ArrayList<Objectif> objectifs = new ArrayList<>();

            String objectif1 = O1.getText();
            if (!objectif1.isEmpty()) {
                objectifs.add(new Objectif(objectif1, selectedTerm1));
            }

            String objectif2 = O2.getText();
            if (!objectif2.isEmpty()) {
                objectifs.add(new Objectif(objectif2, selectedTerm2));
            }

            String objectif3 = O3.getText();
            if (!objectif3.isEmpty()) {
                objectifs.add(new Objectif(objectif3, selectedTerm3));
            }

            String objectif4 = O4.getText();
            if (!objectif4.isEmpty()) {
                objectifs.add(new Objectif(objectif4, selectedTerm4));
            }

            // Handle the saving of the objectifs ArrayList
            Fichier_de_suivi fichierDeSuivi = new Fichier_de_suivi(objectifs);
            System.out.println("Objectifs created: " + objectifs);
            /*Manage_patients mp = new Manage_patients();
            int nm_dossier = item_pat.getDosssier().getNumero();
            int patientIndex = -1;

            for (int i = 0; i < mp.getPatients().size(); i++) {
                if (mp.getPatients().get(i) != null && mp.getPatients().get(i).getDosssier().getNumero() == nm_dossier) {
                    patientIndex = i;
                    break;
                }
            }
            Dossier doc = new Dossier() ;
            doc.addFichierDeSuivi(fichierDeSuivi);
            mp.getPatients().get(patientIndex).setDossier(doc);
            mp.savePatients();*/

            item_pat.getDosssier().addFichierDeSuivi(fichierDeSuivi);

            System.out.println("Fichier de suivi added to the patient's dossier.");

            successMessageLabel.setText("Fiche de suivie ajoutée avec succès!");
            successMessageLabel.setTextFill(javafx.scene.paint.Color.GREEN);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    private void handleSessionTypeSelection(ActionEvent event) {
        MenuItem source = (MenuItem) event.getSource();
        MenuButton parent = (MenuButton) source.getParentPopup().getOwnerNode();

        if (parent == typeSeanceMenuButton1) {
            selectedTerm1 = source.getText();
        } else if (parent == typeSeanceMenuButton2) {
            selectedTerm2 = source.getText();
        } else if (parent == typeSeanceMenuButton3) {
            selectedTerm3 = source.getText();
        } else if (parent == typeSeanceMenuButton4) {
            selectedTerm4 = source.getText();
        }

        parent.setText(source.getText());
    }

    @FXML
   public void switchtolisteficheSuivi( ActionEvent e) {
       try {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("liste_ficheSuivi.fxml"));
           Parent root = loader.load();
           // Get the controller for the loaded FXML
           ficheSuivieController controller = loader.getController();


           ArrayList<Fichier_de_suivi> FCH = new ArrayList<Fichier_de_suivi>();




           FCH = item_pat.getDosssier().get_fichier_de_suivi();
           ObservableList<Fichier_de_suivi> list_FCH = FXCollections.observableArrayList(FCH);
           System.out.println("ObservableList contents: " + list_FCH);
           if (controller.listViewFCH != null) {
               controller.listViewFCH.setItems(list_FCH);
               System.out.println("ListView contents: " + controller.listViewFCH.getItems());
               controller.listViewFCH.setCellFactory(new Callback<>() {
                   @Override
                   public ListCell<Fichier_de_suivi> call(ListView<Fichier_de_suivi> listViewFCH) {
                       return new ListCell<Fichier_de_suivi>() {
                           @Override
                           protected void updateItem(Fichier_de_suivi item, boolean empty) {
                               super.updateItem(item, empty);
                               System.out.println("item: " + item);
                               if (item != null && !empty) {
                                   HBox hBox = new HBox(20);
                                   hBox.setPrefHeight(50);
                                   hBox.setAlignment(Pos.CENTER_LEFT);


                                   Label name = new Label("Fiche de suivie " + (getIndex() + 1));


                                   name.setPrefWidth(70);




                                   Button afficherButton = new Button("Afficher Fiche de suivie");


                                   afficherButton.setStyle("-fx-background-color:white; -fx-text-fill: #3191ff; -fx-font-weight: 700;");


                                   afficherButton.setOnAction(event -> {
                                       //PC.afficherinfo_patient();
                                       try {
                                           item_FCH = item;
                                           HelloApplication.loadPage("fiche_suivie.fxml");
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


                                   hBox.getChildren().addAll(name, buttonsBox);
                                   setGraphic(hBox);
                               } else {
                                   setGraphic(null);
                                   System.out.println("item is null");
                               }
                           }
                       };
                   }
               });
               controller.listViewFCH.refresh();
           } else {
               System.out.println("ListView is null in the loaded controller");


           }


           // Set the new scene
           Stage stage = (Stage) ((Button) e.getSource()).getScene().getWindow();
           stage.setScene(new Scene(root));
           stage.show();




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

}