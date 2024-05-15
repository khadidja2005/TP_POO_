package org.example.demo3.classes;

public class fichier_de_suivi {
    private objectif[] objectif= new objectif[10];

    public fichier_de_suivi(objectif[] objectif){
        this.objectif = objectif;
    }

    public objectif[] getObjectif() {
        return objectif;
    }

    public void setObjectif(objectif[] objectif) {
        this.objectif = objectif;
    }
}
