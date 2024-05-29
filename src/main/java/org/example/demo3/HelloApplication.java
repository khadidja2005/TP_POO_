package org.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.demo3.classes.*;

import java.io.*;
import java.util.ArrayList;

public class HelloApplication extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage; // Initialize the primaryStage variable
        Parent root = FXMLLoader.load(getClass().getResource("get_started.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void loadPage(String fxmlFile) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource(fxmlFile));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static void main(String[] args) {
        //##################################################################################
        // ############# CREER UNE LISTE DES BOs #############################################
        QST_libre QST_libre_1 = new QST_libre();
        QST_libre_1.setQuestion("Pouvez-vous me décrire comment vous ressentez votre difficulté à parler ?");
        QST_libre Qst_libre_2  = new QST_libre();
        Qst_libre_2.setQuestion("Quels sont les moments de la journée où vous remarquez que votre voix est plus fatiguée ?");
        QST_libre Qst_libre_3  = new QST_libre();
        Qst_libre_3.setQuestion("Comment décririez-vous la sensation lorsque vous avez du mal à prononcer certains mots ?");
        QST_libre Qst_libre_4  = new QST_libre();
        Qst_libre_4.setQuestion("Avez-vous remarqué des changements dans votre capacité à comprendre le langage oral ?");
        QST_libre Qst_libre_5  = new QST_libre();
        Qst_libre_5.setQuestion("Comment votre famille ou vos amis réagissent-ils à votre façon de parler ?");
        QCM qcm1 = new QCM("À quel moment de la journée avez-vous le plus de difficulté à parler ?");
        qcm1.setPropostions(new String[]{"Le matin", "L'après-midi", "Le soir", "La nuit"});
        QCM qcm2 = new QCM("Lorsque vous essayez de parler, quelle est la principale difficulté que vous rencontrez ?");
        qcm2.setPropostions(new String[]{"Articuler les mots", "Trouver les mots", "Parler de manière fluide", "Produire des sons"});
        QCM qcm3 = new QCM("À quelle fréquence avez-vous des difficultés à comprendre ce que les autres disent ?");
        qcm3.setPropostions(new String[]{"toujours", "Souvent", " Parfois", "Rarement"});
        QCM qcm4 = new QCM("Lorsque vous lisez à haute voix, quels problèmes rencontrez-vous le plus souvent ?");
        qcm4.setPropostions(new String[]{" Sauter des mots", "Confondre des lettres", "Lire très lentement", "Aucun problème"});
        QCM qcm5 = new QCM("Quelle est la réaction des autres lorsque vous parlez ?");
        qcm5.setPropostions(new String[]{"Ils comprennent bien", " Ils demandent souvent de répéter", "Ils ne comprennent pas du tout", " Ils évitent de parler avec moi"});
        Test_questionnaire test1 = new Test_questionnaire(2);
        test1.ajouterQuestion(QST_libre_1);
        test1.ajouterQuestion(qcm1);
        test1.setCapacite(10);
        test1.setCompte_rendu("verification des capacites");
        Test_questionnaire test2 = new Test_questionnaire(2);
        test2.ajouterQuestion(Qst_libre_2);
        test2.ajouterQuestion(qcm2);
        test2.setCapacite(10);
        test2.setCompte_rendu("verification des competences");
        Test_questionnaire test3 = new Test_questionnaire(2);
        test3.ajouterQuestion(Qst_libre_3);
        test3.ajouterQuestion(qcm3);
        test3.setCapacite(10);
        test3.setCompte_rendu("verification des competences");
        Test_questionnaire test4 = new Test_questionnaire(2);
        test4.ajouterQuestion(Qst_libre_4);
        test4.ajouterQuestion(qcm4);
        test4.setCapacite(10);
        test4.setCompte_rendu("verification des competences");
        Test_questionnaire test5 = new Test_questionnaire(2);
        test5.ajouterQuestion(Qst_libre_5);
        test5.ajouterQuestion(qcm5);
        test5.setCapacite(10);
        test5.setCompte_rendu("verification des competences");
        Test_questionnaire test6 = new Test_questionnaire(2);
        test6.ajouterQuestion(Qst_libre_3);
        test6.ajouterQuestion(qcm1);
        test6.setCapacite(10);
        test6.setCompte_rendu("bon test pour les enfants");
        Test_questionnaire test7 = new Test_questionnaire(2);
        test7.ajouterQuestion(Qst_libre_2);
        test7.ajouterQuestion(qcm5);
        test7.setCapacite(10);
        test7.setCompte_rendu("verification des regles");
        Test_questionnaire test8 = new Test_questionnaire(2);
        test8.ajouterQuestion(Qst_libre_5);
        test8.ajouterQuestion(qcm1);
        test8.setCapacite(10);
        test8.setCompte_rendu("les regles des communications");
        Test_questionnaire test9 = new Test_questionnaire(2);
        test9.ajouterQuestion(Qst_libre_2);
        test9.ajouterQuestion(qcm3);
        test9.setCapacite(10);
        test9.setCompte_rendu("les regles des communications");
        Test_questionnaire test10 = new Test_questionnaire(2);
        test10.ajouterQuestion(Qst_libre_5);
        test10.ajouterQuestion(qcm4);
        test10.setCapacite(10);
        test10.setCompte_rendu("verification des competences");

        EC ec1 = new EC(2);
        ec1.addTest(test1);
        ec1.addTest(test2);
        ec1.setObservation_clinique("Le patient a des difficultés à parler et à comprendre le langage oral");
        EC ec2 = new EC(2);
        ec2.addTest(test1);
        ec2.addTest(test2);
        ec2.setObservation_clinique("Le patient a des difficultés à parler et à comprendre le langage oral");
        EC ec3 = new EC(2);
        ec3.addTest(test3);
        ec3.addTest(test4);
        ec3.setObservation_clinique("Le patient a des difficultés à parler et à comprendre le langage oral");
        EC ec4 = new EC(2);
        ec4.addTest(test5);
        ec4.addTest(test6);
        ec4.setObservation_clinique("Le patient a des difficultés à parler et à comprendre le langage oral");
        EC ec5 = new EC(2);
        ec5.addTest(test7);
        ec5.addTest(test8);
        ec5.setObservation_clinique("Le patient a des difficultés à parler et à comprendre le langage oral");
        EC ec6 = new EC(2);
        ec6.addTest(test9);
        ec6.addTest(test10);
        ec6.setObservation_clinique("Le patient a des difficultés à parler et à comprendre le langage oral");
        /*BO bo1 = new BO();
        bo1.setNom_BO("BO1");
        bo1.setNumero_BO(false);
        bo1.ajouterEc(ec1);
        bo1.ajouterEc(ec2);
        BO bo2 = new BO();
        bo2.setNom_BO("BO2");
        bo2.setNumero_BO(false);
        bo2.ajouterEc(ec1);
        bo2.ajouterEc(ec2);
        Projet_therapeutique projet_therapeutique2 = new Projet_therapeutique("Le patient doit suivre des séances de rééducation orthophonique");
        bo2.setProjet_therapeutique1(projet_therapeutique2);
        Trouble trouble3 = new Trouble("trouble3" , Categorie_trouble.trouble_neuro_developpementaux);
        Trouble trouble4 = new Trouble("trouble4" , Categorie_trouble.trouble_cognitifs);
        bo2.setTrouble(new Trouble[]{trouble3 , trouble4});

        bo2.ajouterEc(ec6);
        BO bo3 = new BO();
        bo3.setNom_BO("BO_3");
        bo3.setNumero_BO(false);
        bo3.ajouterEc(ec4);
        bo3.ajouterEc(ec3);
        Anamnese AN = new Anamnese();
        AN.ajouterQST_libre(QST_libre_1);
        AN.ajouterQST_libre(Qst_libre_2);
        Premier_BO bo4 = new Premier_BO();
        bo4.ajouterAnamnese(AN);
        bo4.setNumero_BO(true);
        bo4.setNom_BO("premier_BO");
        bo4.ajouterEc(ec6);
        bo4.ajouterEc(ec2);
        BO bo5 = new BO();
        bo5.ajouterEc(ec4);
        bo5.ajouterEc(ec1);
        bo5.setNumero_BO(false);
        bo5.setNom_BO("bo_5");
        BO bo6 = new BO();
        bo6.ajouterEc(ec2);
        bo6.ajouterEc(ec5);
        bo6.setNom_BO("bo_6");
        bo6.setNumero_BO(false);*/
        /*Manage_BO manageBo=new Manage_BO(10);
        manageBo.addBO(bo1);
        manageBo.addBO(bo2);
        manageBo.addBO(bo3);
        manageBo.addBO(bo4);
        manageBo.addBO(bo5);
        manageBo.addBO(bo6);
        manageBo.saveBOs();

        //Manage_BO manageBo = new Manage_BO(2);
        //manageBo.addBO(bo1);
        //manageBo.addBO(bo2);
        //manageBo.displayBOs();
        //System.out.println(manageBo.getBOs().size());
        //Manage_BO manage_bo2 = new Manage_BO();
        //manage_bo2.getBOs().removeAll(manage_bo2.getBOs());
        //manage_bo2.addBO(bo1);
        //manage_bo2.addBO(bo2);
        //manage_bo2.removeBO(bo2);
        //manage_bo2.removeBO(bo1);

        //manage_bo2.displayBOs();
        //System.out.println(manage_bo.getBOs().getFirst().getEc()[0].getTest()[0].getCapacite());
        //System.out.println(manage_bo2.getBOs().size());

        //Manage_BO manage_bo2 = new Manage_BO(10);
        //Manage_BO manage_bo = new Manage_BO(new BO[]{bo1 , bo2} ,10 );
        //manage_bo2.getBOs().removeAll(manage_bo2.getBOs());
        //manage_bo2.addBO(bo1);
        //manage_bo2.addBO(bo2);
        /*Manage_BO bo22 = new Manage_BO(10);
        bo22.addBO(bo1);
        bo22.addBO(bo2);
        bo22.loadBOs();*/
        //System.out.println(bo22.getBOs()[0].getEc()[0].getTest()[0].getCapacite());
        // #####################################################################################
        //##############  CREER PATIENT  ####################################################
      /*  Patient patient = new Patient();
        patient.setAdresse("Oued Smar Alger");
        patient.setDate_de_naissance("02/02/2005");
        patient.setNom("Brakta");
        patient.setPrenom("Khadidja");
        patient.setLieu_de_naissance("algiers");
        Dossier doc = new Dossier();
        doc.set_BO(manageBo.getBOs());
        patient.setDossier(doc);
        Manage_patients manage_patient = new Manage_patients(10);
        manage_patient.removePatient(1);
        //
        manage_patient.addPatient(patient);
        manage_patient.displayPatients();
        //manage_bo2.displayBOs();
        // ########################################################################################
        // #################  CREER ORTHOPHONISTE  ################################################
        Orthophoniste orthophoniste = new Orthophoniste();
        orthophoniste.setAdresse("New York");
        orthophoniste.setAdresse_email("marchelle21@esi.dz");
        orthophoniste.setMot_de_passe("march21");
        orthophoniste.setNom("Jo");
        orthophoniste.setPrenom("Marchelle");
        orthophoniste.setNumero_telephone("0665132395");
        Manage_doctor manage_doctor = new Manage_doctor(10);
        manage_doctor.addOrtho(orthophoniste);
        manage_doctor.displayOrthos();*/
        launch();
    }
}
