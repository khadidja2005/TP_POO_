package org.example.demo3.classes;

public class EC {
    private String observation_clinique ;
    private test[] test1 ;

    public EC(int size) {
        this.test1 = new test[size];
        this.observation_clinique = " ";
    }

    public String getObservation_clinique() {
        return observation_clinique;
    }
    public void setObservation_clinique(String observation_clinique) {
        this.observation_clinique = observation_clinique;
    }
    public test[] getTest() {
        return test1;
    }
    public void setTest(test[] test) {
        this.test1 = test;
    }
    public void addTest(test test) {
        for (int i = 0; i < this.test1.length; i++) {
            if (this.test1[i] == null) {
                this.test1[i] = test;
                break;
            }
        }
    }
    public void removeTest(test test) {
        for (int i = 0; i < this.test1.length; i++) {
            if (this.test1[i] == test) {
                this.test1[i] = null;
                break;
            }
        }
    }
    public void updateTest(test test, int index) {
        this.test1[index] = test;
    }


}
