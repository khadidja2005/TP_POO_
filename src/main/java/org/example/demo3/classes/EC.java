package org.example.demo3.classes;

import java.io.Serializable;
import java.util.Arrays;

public class EC implements Serializable {
    private String observation_clinique ;
    private Test[] test1 ;

    public EC(int size) {
        this.test1 = new Test[size];
        this.observation_clinique = " ";
    }

    public String getObservation_clinique() {
        return observation_clinique;
    }
    public void setObservation_clinique(String observation_clinique) {
        this.observation_clinique = observation_clinique;
    }
    public Test[] getTest() {
        return test1;
    }
    public void setTest(Test[] test) {
        this.test1 = test;
    }
    public void addTest(Test test) {
        for (int i = 0; i < this.test1.length; i++) {
            if (this.test1[i] == null) {
                this.test1[i] = test;
                break;
            }
        }
    }
    public void removeTest(Test test) {
        for (int i = 0; i < this.test1.length; i++) {
            if (this.test1[i] == test) {
                this.test1[i] = null;
                break;
            }
        }
    }
    public void updateTest(Test test, int index) {
        this.test1[index] = test;
    }
    @Override
    public String toString() {
        return "EC{" +
                "observation_clinique='" + observation_clinique + '\'' +
                ", test1=" + Arrays.toString(test1) +
                '}';
    }
}
