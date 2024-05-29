package org.example.demo3.classes;

import java.io.Serializable;

public class Objectif implements Serializable {


    private String nom;
    private String terme;

    public Objectif(String nom, String terme) {
        this.nom = nom;
        this.terme = terme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTerme() {
        return terme;
    }

    public void setTerme(String terme) {
        this.terme = terme;
    }

    @Override
    public String toString() {
        return "Objectif{" +
                "nom='" + nom + '\'' +
                ", terme=" + terme +
                '}';
    }
}
