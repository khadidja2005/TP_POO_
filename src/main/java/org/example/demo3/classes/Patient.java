package org.example.demo3.classes;

import java.io.Serializable;

public class Patient implements Serializable{

    private String nom;
    private String prenom;
    private String adresse;
    private String date_de_naissance;
    private String lieu_de_naissance;
    private Dossier dossier;

    //constructors

    public Patient(String nom, String prenom, String adresse, String date_de_naissance, String lieu_de_naissance, Dossier dossier) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.date_de_naissance = date_de_naissance;
        this.lieu_de_naissance = lieu_de_naissance;
        this.dossier = new Dossier();

    }
    public Patient () {

    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getDate_de_naissance() {
        return date_de_naissance;
    }
    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }
    public String getLieu_de_naissance() {
        return lieu_de_naissance;
    }
    public void setLieu_de_naissance(String lieu_de_naissance) {
        this.lieu_de_naissance = lieu_de_naissance;
    }

    public void setDossier (Dossier doc) {
        this.dossier = doc;
    }
    public Dossier getDosssier (){
        return dossier;
    }
    @Override
    public String toString () {

        return "Patient{" +
                "nom :" + nom +
                "prenom :" + prenom +
                "adresse :"+ adresse +
                "date_de_naissance" + date_de_naissance +
                "lieu_de_naissance" + lieu_de_naissance +
                "Dossier" + dossier.toString() +
                "}" ;

    }


}
