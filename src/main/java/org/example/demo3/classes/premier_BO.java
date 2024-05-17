package org.example.demo3.classes;

public class premier_BO  extends BO{
    private anamnese anamnese;


    public premier_BO () {
        super();
        this.anamnese = new anamnese();
    }
    public premier_BO (anamnese anamnese , boolean numero_BO, EC[] ec , Projet_therapeutique projet_therapeutique1 , trouble[] trouble) {
        super(numero_BO,  ec , projet_therapeutique1 ,  trouble);
        this.anamnese = anamnese;
    }
    public anamnese getAnamnese() {
        return anamnese;
    }
    public void setAnamnese(anamnese anamnese) {
        this.anamnese = anamnese;
    }
    public void ajouterAnamnese (anamnese anamnese) {
        this.anamnese = anamnese;
    }
    public void modifierAnamnese (anamnese anamnese){
        this.anamnese = anamnese ;
    }
}
