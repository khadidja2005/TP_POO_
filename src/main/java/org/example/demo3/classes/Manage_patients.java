package org.example.demo3.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manage_patients implements Serializable {
    private static final String FILE_NAME = "src/main/resources/DATA/patients.txt";
    private Patient[] patients;

    public Manage_patients(int length) {
        patients = new Patient[length];
        loadPatients();
    }
    public Manage_patients (Patient[] patient ,int  size) {
        patients = new Patient[size] ;
        patients = patient;
        savePatients();
    }

    public void addPatient(Patient patient) {
        try {
            for (int i =0 ; i< patients.length ; i++) {
                if(patients[i] == null) {
                    patients[i] = patient;
                    savePatients();
                    break;

                }
            }
        }catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);

        }
    }
    public void updatePatient(int index, Patient p) {
        if (index >= 0 && index < patients.length) {
            patients[index] = p;
            //boList.set(index, bo);
            savePatients();
        }
    }

    public void removePatient(int index) {
        if (index >= 0 && index < patients.length) {
            patients[index] = null;
            //boList.remove(index);
            savePatients();
        }
    }
    public Patient[] getPatients() {
        return patients;
    }
    public void savePatients() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(patients);
            System.out.println("saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("failed to save");
        }
    }

    public void loadPatients() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            patients = (Patient[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found or error loading data. Starting fresh.");
        }
    }

    public void displayPatients() {
        for (Patient bo : patients) {
            System.out.println(bo);
        }
    }
}
