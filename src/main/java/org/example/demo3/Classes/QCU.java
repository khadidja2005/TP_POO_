package org.example.demo3.Classes;

public class QCU extends questionnaire {
    private String[] propostions;
    private String reponse;

    public QCU(String qst) {
        this.propostions = new String[10];
        this.reponse = " ";
    }
    public QCU(String[] propostions, String reponse) {
        this.propostions = propostions;
        this.reponse = reponse;

    }
    public String[] getPropostions() {
        return propostions;
    }
    public void setPropostions(String[] propostions) {
        this.propostions = propostions;
    }
    public String getReponse() {
        return reponse;
    }
    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}
