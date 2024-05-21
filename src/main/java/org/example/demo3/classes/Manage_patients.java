package org.example.demo3.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manage_patients {
    private List<patient> patients = new ArrayList<>();
    private static final String FILE_NAME = "patients.txt";

    public Manage_patients() {
        try {
            patients= serialize_deserialize_patients.deserialize(FILE_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found. Starting fresh.");
        }
    }

    public void addpatient(patient obj) {
        patients.add(obj);
        saveData();
    }

    public void removepatient(patient obj) {
        patients.remove(obj);
        saveData();
    }

    public void updatepatient(int index, patient obj) {
        if (index >= 0 && index < patients.size()) {
            patients.set(index, obj);
            saveData();
        }
    }

    private void saveData() {
        try {
            serialize_deserialize_patients.serialize(patients, FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<patient> getPatients() {
        return patients;
    }

}
