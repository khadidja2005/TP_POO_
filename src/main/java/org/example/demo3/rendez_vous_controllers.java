package org.example.demo3;

import javafx.application.Platform;
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
import org.example.demo3.classes.Manage_patients;
import org.example.demo3.classes.Patient;

import java.io.IOException;

public class rendez_vous_controllers {
    @FXML
    private Button retour;
    public static Patient item_pat ;
    @FXML
    private Button gererPatients;

    @FXML
    private Button AfficherPas;

    @FXML
    private Button AjouterPas;

    @FXML
    private ListView<Patient> listView;

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
    public void switchTolistePatients(ActionEvent e) throws IOException {
        PatientController PC = new PatientController();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("liste_patients.fxml"));
            Parent root = loader.load();

            // Get the controller for the loaded FXML
            rendez_vous_controllers controller = loader.getController();

            // Load the patients
            Manage_patients MP = new Manage_patients(10);
            MP.loadPatients();
            System.out.println("Patients:############################################# ");
            MP.displayPatients();

            // Convert array to ObservableList
            ObservableList<Patient> patients = FXCollections.observableArrayList(MP.getPatients());
            System.out.println("ObservableList contents: " + patients);

            // Ensure the ListView is updated in the loaded controller
            if (controller.listView != null) {
                controller.listView.setItems(patients);
                System.out.println("ListView contents: " + controller.listView.getItems());
                controller.listView.setCellFactory(new Callback<>() {
                    @Override
                    public ListCell<Patient> call(ListView<Patient> listView) {
                        return new ListCell<Patient>() {
                            @Override
                            protected void updateItem(Patient item, boolean empty) {
                                super.updateItem(item, empty);
                                System.out.println("item: " + item);
                                if (item != null && !empty) {
                                    HBox hBox = new HBox(20);
                                    hBox.setPrefHeight(50);
                                    hBox.setAlignment(Pos.CENTER_LEFT);

                                    Label name = new Label("Patient" + (getIndex() + 1));
                                    Label nom = new Label(item.getNom());
                                    Label prenom = new Label(item.getPrenom());

                                    name.setPrefWidth(70);
                                    nom.setPrefWidth(150);
                                    prenom.setPrefWidth(150);

                                    Button afficherButton = new Button("Afficher patient");

                                    afficherButton.setStyle("-fx-background-color:white; -fx-text-fill: #3191ff; -fx-font-weight: 700;");

                                    afficherButton.setOnAction(event -> {

                                        System.out.println("Afficher patient: " + item);

                                        item_pat = item;
                                        //PC.afficherinfo_patient();
                                        try {
                                            HelloApplication.loadPage("Afficher_patient.fxml");
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
                controller.listView.refresh();
            } else {
                System.out.println("ListView is null in the loaded controller");
            }

            // Set the new scene
            Stage stage = (Stage) ((Button) e.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception ex) {
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
            HelloApplication.loadPage("ajouter_patient.fxml");
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
