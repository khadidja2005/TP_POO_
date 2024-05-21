package org.example.demo3.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manage_patients {
    private List<Patient> patients = new ArrayList<>();
    int number_of_patients = patients.size();
    private static final String FILE_NAME = "patients.txt";

    public Manage_patients() {
        try {
            patients= Serialize_deserialize_patients.deserialize(FILE_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found. Starting fresh.");
        }
    }

    public void addpatient(Patient obj) {
        patients.add(obj);
        number_of_patients++;
        saveData();
    }

    public void removepatient(Patient obj) {
        patients.remove(obj);
        number_of_patients--;
        saveData();
    }

    public void updatepatient(int index, Patient obj) {
        if (index >= 0 && index < patients.size()) {
            patients.set(index, obj);
            saveData();
        }
    }

    private void saveData() {
        try {
            Serialize_deserialize_patients.serialize(patients, FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

}
