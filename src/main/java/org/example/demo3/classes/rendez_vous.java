package org.example.demo3.classes;

public class rendez_vous {

   private boolean premiere_visite;
   private String duree;
   private String observation;
   private String date;
   private int heure;


    public rendez_vous(boolean premiere_visite, String duree, String observation, String date, int heure) {
        this.premiere_visite = premiere_visite;
        this.duree = duree;
        this.observation = observation;
        this.date = date;
        this.heure = heure;
    }

    public boolean isPremiere_visite() {
        return premiere_visite;
    }

    public void setPremiere_visite(boolean premiere_visite) {
        this.premiere_visite = premiere_visite;
    }

    // Getters and setters for duree
    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    // Getters and setters for observation
    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    // Getters and setters for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getters and setters for heure
    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

}
