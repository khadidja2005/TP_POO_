package org.example.demo3.classes;

public class adulte extends patient
{
    String diplome;
    String profession;
    int numero_telephone;

    public adulte(String nom, String prenom,String adresse, int date_de_naissance, String lieu_de_naissance, dossier dossier) {
        super(nom, prenom, adresse,date_de_naissance,lieu_de_naissance,dossier);
    }

   public adulte(String diplome,String profession,int numero_telephone,String nom, String prenom,String adresse, int date_de_naissance, String lieu_de_naissance, dossier dossier){

        super(nom, prenom, adresse,date_de_naissance,lieu_de_naissance,dossier);
        this.diplome = diplome;
        this.profession=profession;
        this.numero_telephone=numero_telephone;
}
public String getDiplome() {
    return diplome;
}
public void setDiplome(String diplome) {
    this.diplome = diplome;
}
public String getProfession() {
    return profession;
}
public void setProfession(String profession) {
    this.profession = profession;
}
public int getNumero_telephone() {
    return numero_telephone;
}
public void setNumero_telephone(int numero_telephone) {
    this.numero_telephone = numero_telephone;
}}
