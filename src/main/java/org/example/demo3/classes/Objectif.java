package org.example.demo3.classes;

public class Objectif {

    public enum terme {
        COURT_TERME,
        MOYEN_TERME,
        LONG_TERME
    }

    private String nom;
    private terme terme;

    public Objectif(String nom, terme terme) {
        this.nom = nom;
        this.terme = terme;}

        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public terme getterme() {
            return terme;
        }
        public void settereme(terme terme) {
            this.terme = terme;
        }
}
