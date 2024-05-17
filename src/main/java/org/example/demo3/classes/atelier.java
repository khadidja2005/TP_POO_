package org.example.demo3.classes;

public class atelier extends rendez_vous {
    private String thematique;
    private patient[] patient = new patient[10];

    // Default constructor
    public atelier(boolean premiere_visite, String duree, String observation, String date, int heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
    }

    // Constructor with parameters
    public atelier(String thematique,patient[] patient,boolean premiere_visite, String duree, String observation, String date, int heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
        this.thematique=thematique;
        this.patient = patient;
        setDuree("1h");
    }

    public String getthematique() {
        return thematique;
    }

    public void setThematique(String thematique ) {
        this.thematique=thematique;
    }

    public patient[] getpatient() {
        return patient;
    }

    public void setPatient(patient[] patient) {
        this.patient = patient;
    }
}
