package org.example.demo3.classes;

public class trouble {
    private String nom;
    private Categorie_trouble categorie_trouble;


    public trouble(String nom , Categorie_trouble categorie_trouble) {
        this.nom = nom;
        this.categorie_trouble = categorie_trouble;
    }
    public trouble() {

    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Categorie_trouble getCategorie_trouble() {
        return categorie_trouble;
    }
    public void setCategorie_trouble(Categorie_trouble categorie_trouble) {
        this.categorie_trouble = categorie_trouble;
    }

}
