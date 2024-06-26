package org.example.demo3.classes;

import java.io.Serializable;

public class Orthophoniste implements Serializable {

    private String nom;
    private String prenom;
    private String adresse;
    private String numero_telephone;
    private String adresse_email;
    private String mot_de_passe;

    public Orthophoniste(String nom, String prenom, String adresse_email, String adresse, String numero_telephone, String mot_de_passe) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numero_telephone = numero_telephone;
        this.adresse_email = adresse_email;
        this.mot_de_passe = mot_de_passe;

    }
    public Orthophoniste() {

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
    public String getNumero_telephone() {
        return numero_telephone;
    }
    public void setNumero_telephone(String numero_telephone) {
        this.numero_telephone = numero_telephone;
    }
    public String getAdresse_email() {
        return adresse_email;
    }
    public void setAdresse_email(String adresse_email) {
        this.adresse_email = adresse_email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }
    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }
    @Override
    public String toString() {
        return "Orthophoniste{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numero_telephone=" + numero_telephone +
                ", adresse_email='" + adresse_email + '\'' +
                ", mot_de_passe='" + mot_de_passe + '\'' +
                '}';
    }
}
