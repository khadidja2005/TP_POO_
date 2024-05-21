package org.example.demo3.classes;

import java.io.Serializable;

public class Trouble implements Serializable {
    private String nom;
    private enum Categorie_trouble categorie_trouble;


    public Trouble(String nom , Categorie_trouble categorie_trouble) {
        this.nom = nom;
        this.categorie_trouble = categorie_trouble;
    }
    public Trouble() {

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
    @Override
    public String toString() {
        return "Trouble{" +
                "nom='" + nom + '\'' +
                ", categorie_trouble=" + categorie_trouble +
                '}';
    }

}
