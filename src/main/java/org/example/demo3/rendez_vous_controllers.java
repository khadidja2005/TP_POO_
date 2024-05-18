package org.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class rendez_vous_controllers {
    @FXML
    private Button retour;
    @FXML
    private Button creerAtelier;
    @FXML
    private Button testsAnamnse;
    @FXML
    private Button BO;
    @FXML
    private Button Creer_BO;
    @FXML
    private Button tests ;

    @FXML
    private Button anamnses ;
    @FXML

    private void initialize() {
        System.out.println("Rendez-vous controller initialized");
    }

    @FXML
    private void HandelButtonAction(ActionEvent e) {
        try {
            HelloApplication.loadPage("Type_de_rendez_vous.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
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
    private void OnclickTests_Anamnse (ActionEvent e) {
        try {
         HelloApplication.loadPage("Liste_BO.fxml");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    private void Onclick_BO (ActionEvent e) {
        try {
            HelloApplication.loadPage("BO_info.fxml");
        }catch(Exception ex) {
         ex.printStackTrace();
         System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    private void retourListe_BO (ActionEvent e) {
        try {
         HelloApplication.loadPage("Liste_BO.fxml");
        } catch(IOException ex) {
           ex.printStackTrace();
           System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    private void OnclickCreerBO (ActionEvent e) {
        try {
       HelloApplication.loadPage("Creer_BO.fxml");
        } catch(IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }
    }
    @FXML
    private void OnlicklisteAnamneses (ActionEvent e) {
        try {
         HelloApplication.loadPage("Liste_anamnese.fxml");
        } catch(IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());

        }
    }
    @FXML
    private void OnlicklisteTests (ActionEvent e) {
        try {
            HelloApplication.loadPage("Liste_Tests.fxml");
        } catch(IOException ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());

        }
    }

}
