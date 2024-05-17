package org.example.demo3.classes;


import com.fasterxml.jackson.databind.ObjectMapper;

public class BO {
    private static boolean numero_BO;
    private EC[] ec ;
    private Projet_therapeutique projet_therapeutique1;
    private trouble[] trouble ;


    public BO() {

        this.numero_BO = false;
        this.ec = new EC[20];
        this.projet_therapeutique1 = new Projet_therapeutique();
        this.trouble = new trouble[20];
    }
    public BO(boolean numero_BO, EC[] ec , Projet_therapeutique projet_therapeutique1 , trouble[] trouble) {
        this.numero_BO = numero_BO;
        this.ec = ec;
        this.projet_therapeutique1 = projet_therapeutique1;
        this.trouble = trouble;
    }
    public static boolean getNumero_BO() {
        return numero_BO;
    }
    public static void setNumero_BO(boolean numero_BO) {

        BO.numero_BO = numero_BO;
    }
    public EC[] getEc() {
        return ec;
    }
    public void setEc(EC[] ec) {
        this.ec = ec;
    }
    public void ajouterEc (EC ec) {
        for (int i = 0 ; i< this.ec.length ; i++){
            if(i== this.ec.length-1){
                i=i+1 ;
                this.ec[i] = ec;
            }
        }
    }
    public void modifierEc (EC ec , int index){
        this.ec[index] = ec ;
    }
    public Projet_therapeutique getProjet_therapeutique1() {
        return projet_therapeutique1;
    }
    public void setProjet_therapeutique1(Projet_therapeutique projet_therapeutique1) {
        this.projet_therapeutique1 = projet_therapeutique1;
    }
    public trouble[] getTrouble() {
        return trouble;
    }
    public void setTrouble(trouble[] trouble) {
        this.trouble = trouble;
    }
    public void ajouterTrouble (trouble trouble) {
        for (int i = 0 ; i< this.trouble.length ; i++){
            if(i== this.trouble.length-1){
                i=i+1 ;
                this.trouble[i] = trouble;
            }
        }
    }
    public void modifierTrouble (trouble trouble , int index){
        this.trouble[index] = trouble ;
    }
 public static void main(String[] arg){
     ObjectMapper mapper = new ObjectMapper();
 }

}
