package org.example.demo3.classes;

public class Atelier extends Rendez_vous {
    private String thematique;

    // Default constructor
    public Atelier(boolean premiere_visite, String duree, String observation, String date, String heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
    }

    // Constructor with parameters
    public Atelier(String thematique, boolean premiere_visite, String duree, String observation, String date, String heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
        this.thematique=thematique;
        setDuree("1h");
    }

    public String getthematique() {
        return thematique;
    }

    public void setThematique(String thematique ) {
        this.thematique=thematique;
    }

}
