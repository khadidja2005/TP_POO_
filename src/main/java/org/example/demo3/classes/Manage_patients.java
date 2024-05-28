package org.example.demo3.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manage_patients implements Serializable {
    private static final String FILE_NAME = "src/main/resources/DATA/patients.txt";
    private ArrayList<Patient> patients;
    public Manage_patients () {
        loadPatients();
    }

    public Manage_patients(int length) {
        patients = new ArrayList<>(length);
        //patients = new Patient[length];
        loadPatients();
    }
    public Manage_patients( ArrayList<Patient> patientss ,int  size) {
        //patients = new ArrayList<>(size);
        patients = patientss;
        savePatients();
    }

    public void addPatient(Patient patient) {
        try {
            patients.add(patient);
            savePatients();
        }catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array is full");

        }
    }
    public void updatePatient(int index, Patient p) {
           if (index >= 0 && index < patients.size()) {
                patients.set(index, p);
                savePatients();
            }
    }

    public void removePatient(int index) {
        if (index >= 0 && index < patients.size()) {
            patients.remove(index);
            //boList.remove(index);
            savePatients();
        }
    }
    public ArrayList<Patient> getPatients() {
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
            Object obj = ois.readObject();
            if (obj instanceof ArrayList) {
                patients = (ArrayList<Patient>) obj;
            } else if (obj instanceof Patient[]) {
                patients = new ArrayList<>(Arrays.asList((Patient[]) obj));
            } else {
                System.out.println("Unknown data format");
                patients = new ArrayList<>();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found or error loading data. Starting fresh.");
            patients = new ArrayList<>();
        }
    }
 /*   public void loadPatients() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            patients = (ArrayList<Patient>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found or error loading data. Starting fresh.");
        }
    }*/

    public void displayPatients() {
        for (Patient bo : patients) {
            System.out.println(bo);
        }
    }
}
