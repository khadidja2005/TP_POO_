package org.example.demo3.classes;

import java.io.IOException;
import java.util.List;

public class Manage_doctor {
private orthophoniste doctor = new orthophoniste();

private static final String FILE_NAME = "orthophoniste.txt";

    public Manage_doctor() {
        try {
            doctor= Serialize_deserialize_orthophoniste.deserialize(FILE_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found. Starting fresh.");
        }
    }
    public orthophoniste getDoctor () {
        return doctor;
    }
    public void updateDocor (orthophoniste doctor) {
        this.doctor = doctor ;
        saveData();
    }
    private void saveData() {
        try {
            Serialize_deserialize_orthophoniste.serialize(doctor, FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
