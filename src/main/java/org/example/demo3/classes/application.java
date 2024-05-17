package org.example.demo3.classes;

public class application {
    private patient[] patient= new patient[100];

    public application(patient[] patient){
        this.patient = patient;
    }

    public patient[] getpatient() {
        return patient;
    }

    public void setPatient(patient[] patient) {
        this.patient = patient;
    }
}
