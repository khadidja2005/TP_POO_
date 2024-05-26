package org.example.demo3.classes;

public class Consultation extends Rendez_vous {
    private String nom;
    private String prenom;
    private int age;

    // Default constructor
    public Consultation(boolean premiere_visite, String duree, String observation, String date, String heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
    }

    // Constructor with parameters
    public Consultation(String nom, String prenom, int age, boolean premiere_visite, String duree, String observation, String date, String heure) {
        super(premiere_visite,duree,observation,date,heure); // Call the superclass constructor
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        if (age > 18) {
            setDuree("1h30min");
        } else {
            setDuree("2h30min");
        }
    }

    // Getters and setters for nom, prenom, and age
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Consultation{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }
}
