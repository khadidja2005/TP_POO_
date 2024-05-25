package org.example.demo3.classes;

import java.io.Serializable;
import java.util.Arrays;

public class Dossier implements Serializable {
    private static int numero = 1;

    private BO[] BO=new BO[10];
    private Rendez_vous[] rendez_vous=new Rendez_vous[25];
    private Fichier_de_suivi[] fichier_de_suivi=new Fichier_de_suivi[25];


    // Default constructor
    public Dossier() {
        incrementNumero(); // Increment numero each time an object is created
    }

    // Constructor with parameters
    public Dossier(BO[] BO, Rendez_vous[] rendez_vous, Fichier_de_suivi[] fichier_de_suivi) {
        this.BO = BO;
        this.rendez_vous = rendez_vous;
        this.fichier_de_suivi = fichier_de_suivi;
        incrementNumero(); // Increment numero each time an object is created
    }

    // Setter and getter for numero
    public int getNumero() {
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
    public Rendez_vous[] get_rendez_vous() {
        return rendez_vous;
    }

    public void set_rendez_vous(Rendez_vous[] _rendez_vous) {
        this.rendez_vous = rendez_vous;
    }

    // Setter and getter for _fichier_de_suivi
    public Fichier_de_suivi[] get_fichier_de_suivi() {
        return fichier_de_suivi;
    }

    public void set_fichier_de_suivi(Fichier_de_suivi[] _fichier_de_suivi) {
        this.fichier_de_suivi = fichier_de_suivi;
    }
    @Override
    public String toString() {
        return "Dossier{" +
                "BO=" + Arrays.toString(BO) +
                ", rendez_vous: " + Arrays.toString(rendez_vous)+
                ", fichier_de_suivi: " + Arrays.toString(fichier_de_suivi) +
                '}';
    }



}
