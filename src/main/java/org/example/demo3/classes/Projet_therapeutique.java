package org.example.demo3.classes;

import java.io.Serializable;

public class Projet_therapeutique implements Serializable {
    private String texte;

    public Projet_therapeutique(String texte) {
        this.texte = texte;
    }
    public Projet_therapeutique() {

    }
    public String getTexte() {
        return texte;
    }
    public void setTexte(String texte) {
        this.texte = texte;
    }
    @Override
    public String toString() {
        return "Projet_therapeutique{" +
                "texte='" + texte + '\'' +
                '}';
    }
}
