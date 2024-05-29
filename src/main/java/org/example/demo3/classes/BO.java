package org.example.demo3.classes;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class BO implements Serializable {
    private String Nom_BO;
    private boolean numero_BO;
    private ArrayList<EC> ec ;
    private Projet_therapeutique projet_therapeutique1;
    private Trouble[] trouble ;


    public BO() {
        this.Nom_BO = "";
        this.numero_BO = false;
        this.ec = new ArrayList<EC>(20);
        this.projet_therapeutique1 = new Projet_therapeutique();
        this.trouble = new Trouble[20];
    }
    public BO(boolean numero_BO, ArrayList<EC> ec , Projet_therapeutique projet_therapeutique1 , Trouble[] trouble , String Nom_BO) {
        this.numero_BO = numero_BO;
        this.ec = ec;
        this.projet_therapeutique1= projet_therapeutique1;
        this.trouble = trouble;
    }
    public void setNom_BO ( String Nom_BO) {
        this.Nom_BO = Nom_BO;
    }
    public String getNom_BO (){
        return Nom_BO;
    }
    public boolean getNumero_BO() {
        return numero_BO ;
    }
    public void setNumero_BO(boolean numero_BO) {

        this.numero_BO = numero_BO;
    }

    public ArrayList<EC> getEc() {
        return ec;
    }
    public void setEc(ArrayList<EC> ec) {
        this.ec = ec;
    }
    public void ajouterEc(EC ec) {
     this.ec.add(ec);
    }
    public void modifierEc (EC ec , int index){
        this.ec.set(index , ec);
    }
    public Projet_therapeutique getProjet_therapeutique1() {
        return projet_therapeutique1;
    }
    public void setProjet_therapeutique1(Projet_therapeutique projet_therapeutique1) {
        this.projet_therapeutique1 = projet_therapeutique1;
    }
    public Trouble[] getTrouble() {
        return trouble;
    }
    public void setTrouble(Trouble[] trouble) {
        this.trouble = trouble;
    }
    public void ajouterTrouble (Trouble trouble) {
        for (int i = 0 ; i< this.trouble.length ; i++){
            if(i== this.trouble.length-1){
                i=i+1 ;
                this.trouble[i] = trouble;
            }
        }
    }
    public void modifierTrouble (Trouble trouble , int index){
        this.trouble[index] = trouble ;
    }
    @Override
    public String toString() {
        return "BO{" +
                "Nom_BO='" + Nom_BO + '\'' +
                ", numero_BO=" + numero_BO +
                ", ec=" + ec +
                ", projet_therapeutique1=" + projet_therapeutique1 +
                ", trouble=" + Arrays.toString(trouble) +
                '}';
    }


}
