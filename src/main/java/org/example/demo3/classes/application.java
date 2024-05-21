package org.example.demo3.classes;

public class application {
    private patient[] patient= new patient[100];

    private orthophoniste doctor ;
    public application(patient[] patient , orthophoniste doctor){
        this.patient = patient;
    }
    public application (orthophoniste doctor){
        this.patient = new patient[100];
        this.doctor = doctor;
    }
   public void addpatient(patient patient){
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i] == null) {
                this.patient[i] = patient;
                break;
            }
        }
    }
    public void deletepatient(patient patient){
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i] == patient) {
                this.patient[i] = null;
                break;
            }
        }
    }
    public void updatepatient(patient patient){
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i] == patient) {
                this.patient[i] = patient;
                break;
            }
        }
    }
    public orthophoniste getDoctor(  ){
        return  this.doctor;
    }
    public void setDoctor (orthophoniste doctor){
        this.doctor = doctor;
    }

    public patient[] getpatient() {
        return patient;
    }

    public void setPatient(patient[] patient) {
        this.patient = patient;
    }
}
