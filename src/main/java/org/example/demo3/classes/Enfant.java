package org.example.demo3.classes;

public class Enfant extends Patient
{
    String classe_detude;
    int numero_telephone;

    public Enfant(String nom, String prenom, String adresse, String date_de_naissance, String lieu_de_naissance, Dossier dossier) {
        super(nom, prenom, adresse,date_de_naissance,lieu_de_naissance,dossier);
    }

    public Enfant(String classe_detude, int numero_telephone, String nom, String prenom, String adresse, String date_de_naissance, String lieu_de_naissance, Dossier dossier){

        super(nom, prenom, adresse,date_de_naissance,lieu_de_naissance,dossier);
        this.classe_detude=classe_detude;
        this.numero_telephone=numero_telephone;
    }
    public String getClasse_detude() {
        return classe_detude;
    }
    public void setClasse_detude(String classe_detude) {
        this.classe_detude = classe_detude;
    }

    public int getNumero_telephone() {
        return numero_telephone;
    }
    public void setNumero_telephone(int numero_telephone) {
        this.numero_telephone = numero_telephone;
    }}
