package org.example.demo3.Classes;

public class questionnaire {
    private String question ;
    private int score;
    public questionnaire(String qst , int score) {
        this.question = qst;
        this.score = score;
    }
    public questionnaire() {
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public int getscore() {
        return score ;
    }
    public void setscore(int score){
        this.score = score;
    }
}
