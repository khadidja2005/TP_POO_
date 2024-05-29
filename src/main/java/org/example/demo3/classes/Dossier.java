package org.example.demo3.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Dossier implements Serializable {
    private static int numero = 1;

    private ArrayList<BO> BO = new ArrayList<BO>(20);
    private ArrayList<Rendez_vous> rendez_vous = new ArrayList<Rendez_vous>() ;
    //private Rendez_vous[] rendez_vous = new Rendez_vous[25];
    private ArrayList<Fichier_de_suivi> fichier_de_suivi = new ArrayList<Fichier_de_suivi>(10);

    // Default constructor
    public Dossier() {
        incrementNumero(); // Increment numero each time an object is created
    }

    // Constructor with parameters
    public Dossier(ArrayList<BO> BO, ArrayList<Rendez_vous> rendez_vous, ArrayList<Fichier_de_suivi> fichier_de_suivi) {
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
    public ArrayList<BO> get_BO() {
        return BO;
    }

    public void set_BO(ArrayList<BO> BO) {
        this.BO = BO;
    }

    // Setter and getter for _rendez_vous
    public ArrayList<Rendez_vous> get_rendez_vous() {
        return rendez_vous;
    }

    public void set_rendez_vous(ArrayList<Rendez_vous> _rendez_vous) {
        this.rendez_vous = _rendez_vous;
    }

    // Setter and getter for _fichier_de_suivi
    public ArrayList<Fichier_de_suivi> get_fichier_de_suivi() {
        return fichier_de_suivi;
    }

    public void set_fichier_de_suivi(ArrayList<Fichier_de_suivi> _fichier_de_suivi) {
        this.fichier_de_suivi = _fichier_de_suivi;
    }

    // Method to add a BO
    public void addBO(BO newBO) {
        BO.add(newBO);
    }

    // Method to add a Rendez_vous
    public void addRendezVous(Rendez_vous newRendezVous) {
    rendez_vous.add(newRendezVous);
    }
    // Method to add a Fichier_de_suivi
    public void addFichierDeSuivi(Fichier_de_suivi newFichierDeSuivi) {
        fichier_de_suivi.add(newFichierDeSuivi);
    }

    @Override
    public String toString() {
        return "Dossier{" +
                "BO=" + BO +
                ", rendez_vous=" + rendez_vous +
                ", fichier_de_suivi=" + fichier_de_suivi +
                '}';
    }
}
