package org.example.demo3.classes;

public class Premier_BO extends BO{
    private Anamnese anamnese;


    public Premier_BO() {
        super();
        this.anamnese = new Anamnese();
    }
    public Premier_BO(Anamnese anamnese , boolean numero_BO, EC[] ec , Projet_therapeutique projet_therapeutique1 , Trouble[] trouble) {
        //super(numero_BO,  ec , projet_therapeutique1 ,  trouble);
        this.anamnese = anamnese;
    }
    public Anamnese getAnamnese() {
        return anamnese;
    }
    public void setAnamnese(Anamnese anamnese) {
        this.anamnese = anamnese;
    }
    public void ajouterAnamnese (Anamnese anamnese) {
        this.anamnese = anamnese;
    }
    public void modifierAnamnese (Anamnese anamnese){
        this.anamnese = anamnese ;
    }
}
