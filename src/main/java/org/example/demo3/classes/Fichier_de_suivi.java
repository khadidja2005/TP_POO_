package org.example.demo3.classes;

import java.util.Arrays;

public class Fichier_de_suivi {
    private Objectif[] objectif= new Objectif[10];

    public Fichier_de_suivi(Objectif[] objectif){
        this.objectif = objectif;
    }

    public Objectif[] getObjectif() {
        return objectif;
    }

    public void setObjectif(Objectif[] objectif) {
        this.objectif = objectif;
    }

   @Override
    public String toString() {
        return "Fichier_de_suivi{" +
                "objectifs : " + Arrays.toString(objectif) +
                '}';
    }
}
