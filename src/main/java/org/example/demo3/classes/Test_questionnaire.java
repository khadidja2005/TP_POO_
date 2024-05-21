package org.example.demo3.classes;

import java.util.Arrays;

public class Test_questionnaire extends Test {
  private Questionnaire[] questions;
  private float score;
  public Test_questionnaire(int size) {
    this.questions = new Questionnaire[size];
    this.score = 0;
  }
    public Questionnaire[] getQuestions() {
        return questions;
    }
    public void setQuestions(Questionnaire[] questions) {
        this.questions = questions;
    }
    public void ajouterQuestion(Questionnaire qst) {
        for (int i = 0; i < this.questions.length; i++) {
            if (this.questions[i] == null) {
                this.questions[i] = qst;
                break;
            }
        }
    }
    public void supprimerQuestion(Questionnaire qst) {
        for (int i = 0; i < this.questions.length; i++) {
            if (this.questions[i] == qst) {
                this.questions[i] = null;
                break;
            }
        }
    }
    public void modifierQuestion(Questionnaire qst, int index) {
        this.questions[index] = qst;
    }

    @Override
    public String toString() {
        return "Test_questionnaire{" +
                "questions=" + Arrays.toString(questions) +
                ", score=" + score +
                ", capacite=" + super.getCapacite() +
                ", compte_rendu='" + super.getCompte_rendu() + '\'' +
                '}';
    }
}
