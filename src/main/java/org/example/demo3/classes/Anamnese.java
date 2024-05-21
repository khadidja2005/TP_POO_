package org.example.demo3.classes;

public class Anamnese {
    private QST_libre[] qst_libre;

    public Anamnese(QST_libre[] qst_libre) {
        this.qst_libre = qst_libre;
    }
    public Anamnese() {
    }
    public QST_libre[] getQst_libre() {
        return qst_libre;
    }
    public void setQst_libre(QST_libre[] qst_libre) {
        this.qst_libre = qst_libre;
    }
    public void ajouterQST_libre(QST_libre qst_libre) {
        for (int i=0 ; i < this.qst_libre.length ; i++){
            if (i == this.qst_libre.length-1){
                i = i+1;
                this.qst_libre[i] = qst_libre;
            }
        }

    }
    public void supprimerQST_libre (QST_libre qst_libre){
        for (int i = 0 ; i < this.qst_libre.length ; i++){
            if (this.qst_libre[i] == qst_libre){
                this.qst_libre[i] = null;
            }
        }
    }
    public void modifierQST_libre (QST_libre qst_libre ,int index){
        this.qst_libre[index] = qst_libre;
    }

}
