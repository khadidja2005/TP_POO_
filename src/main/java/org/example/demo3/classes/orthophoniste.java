package org.example.demo3.classes;

public class orthophoniste {

    private String nom;
    private String prenom;
    private String adresse;
    private int numero_telephone;
    private String adresse_email;
    private String mot_de_passe;

    public orthophoniste(String nom, String prenom,String adresse_email,String adresse, int numero_telephone, String mot_de_passe) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numero_telephone = numero_telephone;
        this.adresse_email = adresse_email;
        this.mot_de_passe = mot_de_passe;

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
    public int getNumero_telephone() {
        return numero_telephone;
    }
    public void setNumero_telephone(int numero_telephone) {
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
}
