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
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.example.demo3.classes.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class rendez_vous_controllers {
    @FXML
    private Button retour;
    @FXML
    public TextField q1 ;
    @FXML
    private Text show ;
    @FXML
    public TextField q2 ;
    @FXML
    private Button score ;
    public static Patient item_pat ;
    public static ArrayList<Test_questionnaire> item_testqst ;

    public  static BO item_bo ;
    public  static QST_libre QST_lb;
    public static  EC EC_var ;
    @FXML
    private Button gererPatients;

    @FXML
    private Button AfficherPas;

    @FXML
    private Button AjouterPas;

    @FXML
    private ListView<Patient> listView;

    @FXML
    private ListView<BO> boListView ;
    @FXML
    private Button retour_acuiel ;
    @FXML
    private Button retour_BO ;
    @FXML
    private ListView<QST_libre> listViewQST ;
    @FXML
    private  ListView<EC> listViewQST2 ;
    @FXML
    public void backtolistBO (ActionEvent e) {
        try {
            HelloApplication.loadPage("Liste_BO.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error : " + ex.getMessage());

        }
    }
    @FXML
    public void initialize() {
        System.out.println("Rendez-vous controller initialized");
        if (QST_lb != null) {
            q1.setText(QST_lb.getQuestion());
            QST_lb = null ;
        }
        if (EC_var !=null) {
            q1.setText(EC_var.getTest().get(1).getQuestions().get(1).getQuestion());
            q2.setText(EC_var.getTest().get(0).getQuestions().get(0).getQuestion());
            EC_var =null;
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
    @FXML
    public void OnclickScore (ActionEvent e) {

           Random random = new Random();
           int randomNumber = random.nextInt((9 - 6) + 1) + 6;
            show.setText(Integer.toString(randomNumber));
    }
    @FXML
    public void GotoListe_BO (ActionEvent e) {
     try {
         Random random = new Random();
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Liste_BO.fxml"));
         Parent root = loader.load();

         // Get the controller for the loaded FXML
         rendez_vous_controllers controller = loader.getController();

         Manage_BO MB = new Manage_BO(10);
         MB.loadBOs();
         ObservableList<BO> lBO = FXCollections.observableArrayList(MB.getBOs());
         System.out.println("ObservableList contents: " + lBO);
         if (controller.boListView != null) {
             controller.boListView.setItems(lBO);
             System.out.println("ListView contents: " + controller.boListView.getItems());
             controller.boListView.setCellFactory(new Callback<>() {
                 @Override
                 public ListCell<BO> call(ListView<BO> boListView) {
                     return new ListCell<BO>() {
                         @Override
                         protected void updateItem(BO item, boolean empty) {
                             super.updateItem(item, empty);
                             System.out.println("item: " + item);
                             if (item != null && !empty) {
                                 HBox hBox = new HBox(20);
                                 hBox.setPrefHeight(50);
                                 hBox.setAlignment(Pos.CENTER_LEFT);
                                 Label name = new Label("BO" + (getIndex() + 1));
                                 Label nom = new Label(item.getNom_BO());
                                 Label prenom = new Label(item.getNumero_BO()== true ? "premier_bo" : "BO");

                                 name.setPrefWidth(70);
                                 nom.setPrefWidth(150);
                                 prenom.setPrefWidth(150);

                                 Button afficherButton = new Button("Afficher");

                                 afficherButton.setStyle("-fx-background-color:white; -fx-text-fill: #3191ff; -fx-font-weight: 700;");

                                 afficherButton.setOnAction(event -> {

                                     System.out.println("Afficher BO: " + item);

                                     item_bo = item;

                                     //PC.afficherinfo_patient();
                                     try {
                                         //HelloApplication.loadPage("Info_BO.fxml");
                                         go_to_info_BO(event);
                                     } catch (Exception ex) {
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
             controller.boListView.refresh();
         } else {
             System.out.println("ListView is null in the loaded controller");
         }
         // Set the new scene
         Stage stage = (Stage) ((Button) e.getSource()).getScene().getWindow();
         stage.setScene(new Scene(root));
         stage.show();
     } catch (IOException ex){
        ex.printStackTrace();
        System.out.println("error" + ex.getMessage());
        }
    }
    @FXML
    public void retour_aceuil_BO (ActionEvent e) {
        try {
           HelloApplication.loadPage("page_acceuil.fxml");

        }catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error :" + ex.getMessage());
        }
    }
    @FXML
    public void acceuil_vers_BO (ActionEvent e) {
        try {
           HelloApplication.loadPage("Liste_BO.fxml");
        }catch (IOException ex) {
           ex.printStackTrace();
           System.out.println("Error :" + ex.getMessage());
        }

    }
    @FXML
    public void go_to_info_BO (ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Info_BO.fxml"));
            Parent root = loader.load();

            // Get the controller for the loaded FXML
            rendez_vous_controllers controller = loader.getController();
            ArrayList<EC> ec = new ArrayList<EC>(10);
            ec = item_bo.getEc();
            ObservableList<EC> listEC = FXCollections.observableArrayList(ec);
            System.out.println("ObservableList contents: " + listEC);
            if (controller.listViewQST2 != null) {
                controller.listViewQST2.setItems(listEC);
                System.out.println("ListView contents: " + controller.listViewQST2.getItems());
                controller.listViewQST2.setCellFactory(new Callback<>() {
                    @Override
                    public ListCell<EC> call(ListView<EC> listViewQCT2) {
                        return new ListCell<EC>() {
                            @Override
                            protected void updateItem(EC item, boolean empty) {
                                super.updateItem(item, empty);
                                System.out.println("item: " + item);
                                if (item != null && !empty) {
                                    HBox hBox = new HBox(20);

                                    hBox.setPrefHeight(50);
                                    hBox.setAlignment(Pos.CENTER_LEFT);

                                    Label name = new Label("EC" + (getIndex() + 1));
                                    Label nom = new Label(item.getObservation_clinique());
                                    name.setPrefWidth(70);
                                    nom.setPrefWidth(150);

                                    Button afficherButton = new Button("Afficher test");
                                    Button supprimerButton = new Button("supprimer test");
                                    afficherButton.setStyle("-fx-background-color:white; -fx-text-fill: #3191ff; -fx-font-weight: 700;");
                                    supprimerButton.setStyle("-fx-background-color:white; -fx-text-fill: #3191ff; -fx-font-weight: 700;");
                                    supprimerButton.setOnAction(event -> {
                                        listEC.remove(item);
                                        //listViewQST2.getItems().remove(item);
                                    });
                                    afficherButton.setOnAction(event -> {

                                        System.out.println("Afficher test: " + item);

                                        item_testqst = item.getTest();
                                        EC_var = item ;
                                        //PC.afficherinfo_patient();
                                        try {
                                            HelloApplication.loadPage("Anamnese_test.fxml");

                                        } catch (IOException ex) {
                                            throw new RuntimeException(ex);
                                        }
                                        //PC.afficherinfo_patient(item);
                                    });

                                    setOnMouseEntered(event -> setStyle("-fx-background-color: #e6e7e5;"));
                                    setOnMouseExited(event -> setStyle("-fx-background-color: white;"));

                                    HBox buttonsBox = new HBox(20);
                                    buttonsBox.getChildren().addAll(afficherButton ,supprimerButton);
                                    buttonsBox.setAlignment(Pos.CENTER_LEFT);

                                    hBox.getChildren().addAll(name, nom, buttonsBox);
                                    setGraphic(hBox);
                                } else {
                                    setGraphic(null);
                                    System.out.println("item is null");
                                }
                            }
                        };
                    }
                });
                controller.listViewQST2.refresh();
            } else {
                System.out.println("ListView is null in the loaded controller");
            }
            ArrayList<QST_libre> testQST = new ArrayList<QST_libre>(10);
            if (item_bo instanceof Premier_BO) {
                testQST= ((Premier_BO) item_bo).getAnamnese().getQst_libre();
                ObservableList<QST_libre> listQST = FXCollections.observableArrayList(testQST);
                System.out.println("ObservableList contents: " + listQST);

                if (controller.listViewQST != null) {
                    controller.listViewQST.setItems(listQST);
                    System.out.println("ListView contents: " + controller.listViewQST.getItems());
                    controller.listViewQST.setCellFactory(new Callback<>() {
                        @Override
                        public ListCell<QST_libre> call(ListView<QST_libre> listViewQCT) {
                            return new ListCell<QST_libre>() {
                                @Override
                                protected void updateItem(QST_libre item, boolean empty) {
                                    super.updateItem(item, empty);
                                    System.out.println("item: " + item);
                                    if (item != null && !empty) {
                                        HBox hBox = new HBox(20);

                                        hBox.setPrefHeight(50);
                                        hBox.setAlignment(Pos.CENTER_LEFT);

                                        Label name = new Label("QST" + (getIndex() + 1));
                                        Label nom = new Label(item.getQuestion());
                                        name.setPrefWidth(70);
                                        nom.setPrefWidth(150);

                                        Button afficherButton = new Button("Afficher test");
                                        Button Supprimertest = new Button("supprimer test");

                                        afficherButton.setStyle("-fx-background-color:white; -fx-text-fill: #3191ff; -fx-font-weight: 700;");
                                        Supprimertest.setStyle("-fx-background-color:white; -fx-text-fill: #3191ff; -fx-font-weight: 700;");
                                        Supprimertest.setOnAction(event -> {
                                            listQST.remove(item);
                                           //listViewQST.getItems().remove(item);
                                        });
                                        afficherButton.setOnAction(event -> {
                                            System.out.println("Afficher test: " + item);
                                            QST_lb = item;

                                            //PC.afficherinfo_patient();
                                            try {
                                                HelloApplication.loadPage("Anamnese_test.fxml");
                                            } catch (IOException ex) {
                                                throw new RuntimeException(ex);
                                            }
                                            //PC.afficherinfo_patient(item);
                                        });

                                        setOnMouseEntered(event -> setStyle("-fx-background-color: #e6e7e5;"));
                                        setOnMouseExited(event -> setStyle("-fx-background-color: white;"));

                                        HBox buttonsBox = new HBox(20);
                                        buttonsBox.getChildren().addAll(afficherButton ,Supprimertest);
                                        buttonsBox.setAlignment(Pos.CENTER_LEFT);
                                        hBox.getChildren().addAll(name, nom, buttonsBox);
                                        setGraphic(hBox);
                                    } else {
                                        setGraphic(null);
                                        System.out.println("item is null");
                                    }
                                }
                            };
                        }
                    });
                    controller.listViewQST.refresh();
                } else {
                    System.out.println("ListView is null in the loaded controller");
                }
            }
            // Set the new scene
            Stage stage = (Stage) ((Button) e.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error :" + ex.getMessage());
        }

    }


}
