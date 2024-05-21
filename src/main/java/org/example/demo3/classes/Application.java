package org.example.demo3.classes;

public class Application {
    private Patient[] patient= new Patient[100];

    private Orthophoniste doctor ;
    public Application(Patient[] patient , Orthophoniste doctor){
        this.patient = patient;
    }
    public Application(Orthophoniste doctor){
        this.patient = new Patient[100];
        this.doctor = doctor;
    }
   public void addpatient(Patient patient){
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i] == null) {
                this.patient[i] = patient;
                break;
            }
        }
    }
    public void deletepatient(Patient patient){
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i] == patient) {
                this.patient[i] = null;
                break;
            }
        }
    }
    public void updatepatient(Patient patient){
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i] == patient) {
                this.patient[i] = patient;
                break;
            }
        }
    }
    public Orthophoniste getDoctor(  ){
        return  this.doctor;
    }
    public void setDoctor (Orthophoniste doctor){
        this.doctor = doctor;
    }

    public Patient[] getpatient() {
        return patient;
    }

    public void setPatient(Patient[] patient) {
        this.patient = patient;
    }
}
