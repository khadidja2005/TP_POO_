package org.example.demo3.classes;

public class Suivie extends Rendez_vous {
    private int numero_dossier;
    private String presencielle;

    // Default constructor
    public Suivie(boolean premiere_visite, String duree, String observation, String date, String heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
    }

    // Constructor with parameters
    public Suivie(String presencielle, int numero_dossier, boolean premiere_visite, String duree, String observation, String date, String heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
        this.numero_dossier = numero_dossier ;
        this.presencielle= presencielle;
        setDuree("1h");
    }

    public int getnumero_dossier() {
        return numero_dossier;
    }

    public String getPresencielle() {
        return presencielle;
    }

    public void setnumero_dossier(int numero_dossier) {
        this.numero_dossier = numero_dossier;
    }

    public void setPresencielle(String presencielle) {
        this.presencielle = presencielle;
    }

    @Override
    public String toString() {
        return "Suivie{" +
                "numero_dossier=" + numero_dossier +
                ", presencielle=" + presencielle +
                '}';
    }
}
