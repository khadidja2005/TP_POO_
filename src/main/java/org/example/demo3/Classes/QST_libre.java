package org.example.demo3.Classes;

public class QST_libre extends questionnaire{
    private String reponse;

    public QST_libre(String reponse) {
        this.reponse = reponse;
    }
    public QST_libre() {
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}
