package org.example.demo3.Classes;

public class test_questionnaire extends test {
  private questionnaire[] questions;
  private float score;
  public test_questionnaire(int size) {
    this.questions = new questionnaire[size];
    this.score = 0;
  }
    public questionnaire[] getQuestions() {
        return questions;
    }
    public void setQuestions(questionnaire[] questions) {
        this.questions = questions;
    }
    public void ajouterQuestion(questionnaire qst) {
        for (int i = 0; i < this.questions.length; i++) {
            if (i == this.questions.length - 1) {
                i = i+1;
                this.questions[i] = qst;
            }
        }
    }
    public void supprimerQuestion(questionnaire qst) {
        for (int i = 0; i < this.questions.length; i++) {
            if (this.questions[i] == qst) {
                this.questions[i] = null;
                break;
            }
        }
    }
    public void modifierQuestion(questionnaire qst, int index) {
        this.questions[index] = qst;
    }

}
