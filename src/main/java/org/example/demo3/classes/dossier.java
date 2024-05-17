package org.example.demo3.classes;

public class dossier {
    private static int numero = 1;

    private BO[] BO=new BO[5];
    private rendez_vous[] rendez_vous=new rendez_vous[25];
    private fichier_de_suivi[] fichier_de_suivi=new fichier_de_suivi[25];


    // Default constructor
    public dossier() {
        incrementNumero(); // Increment numero each time an object is created
    }

    // Constructor with parameters
    public dossier(BO[] BO, rendez_vous[] rendez_vous, fichier_de_suivi[] fichier_de_suivi) {
        this.BO = BO;
        this.rendez_vous = rendez_vous;
        this.fichier_de_suivi = fichier_de_suivi;
        incrementNumero(); // Increment numero each time an object is created
    }

    // Setter and getter for numero
    public static int getNumero() {
        return numero;
    }

    public static void incrementNumero() {
        numero++;
    }

    // Setter and getter for _BO
    public BO[] get_BO() {
        return BO;
    }

    public void set_BO(BO[] BO) {
        this.BO = BO;
    }

    // Setter and getter for _rendez_vous
    public rendez_vous[] get_rendez_vous() {
        return rendez_vous;
    }

    public void set_rendez_vous(rendez_vous[] _rendez_vous) {
        this.rendez_vous = rendez_vous;
    }

    // Setter and getter for _fichier_de_suivi
    public fichier_de_suivi[] get_fichier_de_suivi() {
        return fichier_de_suivi;
    }

    public void set_fichier_de_suivi(fichier_de_suivi[] _fichier_de_suivi) {
        this.fichier_de_suivi = fichier_de_suivi;
    }


}
