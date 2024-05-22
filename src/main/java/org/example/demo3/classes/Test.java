package org.example.demo3.classes;

import java.io.Serializable;

public class Test implements Serializable {
    private int capacite ;
    private String compte_rendu ;

    private float score ;

    public Test() {
        this.capacite = 0;
        this.compte_rendu = " ";
        this.score = 0;
    }
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public String getCompte_rendu() {
        return compte_rendu;
    }
    public void setCompte_rendu(String compte_rendu) {
        this.compte_rendu = compte_rendu;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Test{" +
                "capacite=" + capacite +
                ", compte_rendu='" + compte_rendu + '\'' +
                ", score=" + score +
                '}';
    }


}
