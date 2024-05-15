package org.example.demo3.Classes;

public class questionnaire {
    private String question ;

    public questionnaire(String qst) {
        this.question = qst;
    }
    public questionnaire() {
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
}
