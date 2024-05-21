package org.example.demo3.classes;

public class Atelier extends Rendez_vous {
    private String thematique;
    private Patient[] patient = new Patient[10];

    // Default constructor
    public Atelier(boolean premiere_visite, String duree, String observation, String date, int heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
    }

    // Constructor with parameters
    public Atelier(String thematique, Patient[] patient, boolean premiere_visite, String duree, String observation, String date, int heure) {
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

    public Patient[] getpatient() {
        return patient;
    }

    public void setPatient(Patient[] patient) {
        this.patient = patient;
    }
}
