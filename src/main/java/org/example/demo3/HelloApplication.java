package org.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.demo3.classes.*;

import java.io.*;

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
        Test_questionnaire test1 = new Test_questionnaire(8);
        test1.ajouterQuestion(QST_libre_1);
        test1.ajouterQuestion(Qst_libre_2);
        test1.ajouterQuestion(qcm2);
        test1.ajouterQuestion(qcm3);
        test1.ajouterQuestion(qcm4);
        test1.ajouterQuestion(qcm5);
        test1.ajouterQuestion(Qst_libre_3);
        test1.ajouterQuestion(Qst_libre_4);
        test1.setCapacite(10);
        test1.setCompte_rendu("");
        Test_questionnaire test2 = new Test_questionnaire(5);
        test2.ajouterQuestion(QST_libre_1);
        test2.ajouterQuestion(Qst_libre_3);
        test2.ajouterQuestion(qcm1);
        test2.ajouterQuestion(qcm2);
        test2.ajouterQuestion(qcm3);
        test2.setCapacite(10);
        test2.setCompte_rendu("");
        Test_questionnaire test3 = new Test_questionnaire(6);
        test3.ajouterQuestion(Qst_libre_4);
        test3.ajouterQuestion(Qst_libre_2);
        test3.ajouterQuestion(qcm1);
        test3.ajouterQuestion(qcm2);
        test3.ajouterQuestion(qcm3);
        test3.ajouterQuestion(qcm4);
        test3.setCapacite(10);
        test3.setCompte_rendu("");
        EC ec1 = new EC(3);
        ec1.addTest(test1);
        ec1.addTest(test2);
        ec1.addTest(test3);
        ec1.setObservation_clinique("Le patient a des difficultés à parler et à comprendre le langage oral");
        EC ec2 = new EC(2);
        ec2.addTest(test1);
        ec2.addTest(test2);
        ec2.setObservation_clinique("Le patient a des difficultés à parler et à comprendre le langage oral");
        BO bo1 = new BO();
        bo1.setNom_BO("BO1");
        bo1.setNumero_BO(false);
        bo1.ajouterEc(ec1);
        bo1.ajouterEc(ec2);
        Projet_therapeutique projet_therapeutique1 = new Projet_therapeutique("Le patient doit suivre des séances de rééducation orthophonique");
        bo1.setProjet_therapeutique1(projet_therapeutique1);
        Trouble trouble1 = new Trouble("trouble1" , Categorie_trouble.trouble_neuro_developpementaux);
        Trouble trouble2 = new Trouble("trouble2" , Categorie_trouble.trouble_cognitifs);
        bo1.setTrouble(new Trouble[]{trouble1 , trouble2});
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
        //Manage_BO manageBo = new Manage_BO();
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
        /*Patient patient = new Patient();
        patient.setAdresse("Oued Smar Alger");
        patient.setDate_de_naissance("02/02/2005");
        patient.setNom("Brakta");
        patient.setPrenom("Khadidja");
        patient.setLieu_de_naissance("algiers");
        Dossier doc = new Dossier();
        doc.set_BO(manage_bo.getBOs().toArray(new BO[0]));
        patient.setDossier(doc);
        Manage_patients manage_patient = new Manage_patients();
        manage_patient.addpatient(patient);*/
        //Manage_BO manage_bo2 = new Manage_BO(10);
        Manage_BO manage_bo = new Manage_BO(new BO[]{bo1 , bo2} ,10 );
        //manage_bo2.getBOs().removeAll(manage_bo2.getBOs());
        //manage_bo2.addBO(bo1);
        //manage_bo2.addBO(bo2);

        //manage_bo2.displayBOs();



        launch();
    }
}
