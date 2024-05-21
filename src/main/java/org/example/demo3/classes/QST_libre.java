package org.example.demo3.classes;

public class QST_libre extends Questionnaire {
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
    @Override
    public String toString() {
        return "QST_libre{" +
                "reponse='" + reponse + '\'' +
                ", question='" + getQuestion() + '\'' +
                '}';
    }
}
