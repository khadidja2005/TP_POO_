package org.example.demo3.Classes;

public class exercice {
    private String consigne ;
    private Boolean reponse ;
    private boolean Materiel_utilise;
    private String nom_Materiel;
    private int score ;
    public exercice() {
        this.consigne = " ";
    }
    public exercice (String consigne) {
        this.consigne = consigne;
    }
   public exercice (String consigne, Boolean reponse) {
        this.consigne = consigne;
        this.reponse = reponse;
    }
    public exercice (String consigne, Boolean reponse, boolean Materiel_utilise, String nom_Materiel) {
        this.consigne = consigne;
        this.reponse = reponse;
        this.Materiel_utilise = Materiel_utilise;
        this.nom_Materiel = nom_Materiel;
    }

    public String getConsigne() {
        return consigne;
    }
    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }
    public Boolean getReponse() {
        return reponse;
    }
    public void setReponse(Boolean reponse) {
        this.reponse = reponse;
    }
    public boolean getMateriel_utilise() {
        return Materiel_utilise;
    }
    public void setMateriel_utilise(boolean materiel_utilise) {
        Materiel_utilise = materiel_utilise;
    }
    public String getNom_Materiel() {
        return nom_Materiel;
    }
    public void setNom_Materiel(String nom_Materiel) {
        this.nom_Materiel = nom_Materiel;
    }

    public int getScore (){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
}
