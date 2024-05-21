package org.example.demo3.classes;
import java.io.Serializable;
public class Questionnaire implements Serializable{
    private String question ;
    private int score;
    public Questionnaire(String qst , int score) {
        this.question = qst;
        this.score = score;
    }
    public Questionnaire() {
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

    @Override
    public String toString() {
        return "Questionnaire{" +
                "question='" + question + '\'' +
                ", score=" + score +
                '}';
    }
}
