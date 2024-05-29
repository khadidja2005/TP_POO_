package org.example.demo3.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_questionnaire extends Test {
  private ArrayList<Questionnaire> questions;
  private float score;
  public Test_questionnaire(int size) {
    this.questions = new ArrayList<Questionnaire>(size);
    this.score = 0;
  }
    public ArrayList<Questionnaire> getQuestions() {
        return questions;
    }
    public void setQuestions(ArrayList<Questionnaire> questions) {
        this.questions = questions;
    }
    public void ajouterQuestion(Questionnaire qst) {
     questions.add(qst);
    }
    public void supprimerQuestion(Questionnaire qst) {
       questions.remove(qst);
    }
    public void modifierQuestion(Questionnaire qst, int index) {
      questions.set(index , qst);
        //this.questions[index] = qst;
    }


    @Override
    public String toString() {
        return "Test_questionnaire{" +
                "questions=" + questions  +
                ", score=" + score +
                ", capacite=" + super.getCapacite() +
                ", compte_rendu='" + super.getCompte_rendu() + '\'' +
                '}';
    }
}
