package org.example.demo3.classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Fichier_de_suivi implements Serializable {
    private ArrayList<Objectif> objectif = new ArrayList<>(20);

    public Fichier_de_suivi(ArrayList<Objectif> objectif) {
        this.objectif = objectif;
    }

    public ArrayList<Objectif> getObjectif() {
        return objectif;
    }

    public void setObjectif(ArrayList<Objectif> objectif) {
        this.objectif = objectif;
    }

    public void addObjectif(Objectif newObjectif) {
        this.objectif.add(newObjectif);
    }

    @Override
    public String toString() {
        return "Fichier_de_suivi{" +
                "objectifs : " + objectif +
                '}';
    }
}
