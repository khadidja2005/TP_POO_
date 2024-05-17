package org.example.demo3.classes;

public class suivie extends rendez_vous {
    private int numero_dossier;
    private boolean presencielle;

    // Default constructor
    public suivie(boolean premiere_visite, String duree, String observation, String date, int heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
    }

    // Constructor with parameters
    public suivie(boolean presencielle,int numero_dossier,boolean premiere_visite, String duree, String observation, String date, int heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
        this.numero_dossier = numero_dossier ;
        this.presencielle= presencielle;
        setDuree("1h");
    }

    public int getnumero_dossier() {
        return numero_dossier;
    }

    public void setnumero_dossier(int numero_dossier) {
        this.numero_dossier = numero_dossier;
    }

    public boolean isPresencielle() {
        return presencielle;
    }

    public void setPresencielle(boolean presencielle) {
        this.presencielle = presencielle;
    }
}
