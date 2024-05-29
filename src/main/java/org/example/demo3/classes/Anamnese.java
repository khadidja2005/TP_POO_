package org.example.demo3.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Anamnese implements Serializable {
    private ArrayList<QST_libre> qst_libre = new ArrayList<QST_libre>(2);

    public Anamnese(ArrayList<QST_libre> qst_libre) {
        this.qst_libre = qst_libre;
    }
    public Anamnese() {
    }
    public ArrayList<QST_libre> getQst_libre() {
        return qst_libre;
    }
    public void setQst_libre(ArrayList<QST_libre> qst_libre) {
        this.qst_libre = qst_libre;
    }
    public void ajouterQST_libre(QST_libre qst_libre) {
        this.qst_libre.add(qst_libre);
    }
    public void supprimerQST_libre (QST_libre qst_libre){
        this.qst_libre.remove(qst_libre);
    }
    public void modifierQST_libre (QST_libre qst_libre ,int index){
        this.qst_libre.set(index , qst_libre);
    }

}
