package org.example.demo3.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class EC implements Serializable {
    private String observation_clinique ;
    private ArrayList<Test_questionnaire> test1 ;

    public EC(int size) {
        this.test1 = new ArrayList<Test_questionnaire>(size);
        this.observation_clinique = " ";
    }

    public String getObservation_clinique() {
        return observation_clinique;
    }
    public void setObservation_clinique(String observation_clinique) {
        this.observation_clinique = observation_clinique;
    }
    public ArrayList<Test_questionnaire> getTest() {
        return test1;
    }
    public void setTest(ArrayList<Test_questionnaire> test) {
        this.test1 = test;
    }
    public void addTest(Test_questionnaire test) {
      test1.add(test);
    }
    public void removeTest(Test test) {
     this.test1.remove(test);
    }
    public void updateTest(Test_questionnaire test, int index) {
        this.test1.set(index , test);
    }
    @Override
    public String toString() {
        return "EC{" +
                "observation_clinique='" + observation_clinique + '\'' +
                ", test1=" + test1 +
                '}';
    }
}
