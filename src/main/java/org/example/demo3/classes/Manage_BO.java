package org.example.demo3.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manage_BO {
    private List<BO> BOs = new ArrayList<>();
    int number_of_BOs = BOs.size();
    private static final String FILE_NAME = "BOs.txt";

    public Manage_BO() {
     loadData();
    }
    private void loadData() {
        try {
            BOs = Serialize_deserialize_BO.deserialize(FILE_NAME);
            number_of_BOs = BOs.size();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found. Starting fresh.");
        }
    }
    public void addBO(BO obj) {
        BOs.add(obj);
        number_of_BOs++;
        saveData();
    }

    public void removeBO(BO obj) {
        BOs.remove(obj);
        number_of_BOs --;
        saveData();
    }

    public void updateBO(int index, BO obj) {
        if (index >= 0 && index < BOs.size()) {
            BOs.set(index, obj);
            saveData();
        }
    }

    private void saveData() {
        try {
            Serialize_deserialize_BO.serialize(BOs, FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<BO> getBOs() {
        return BOs;
    }
    public void displayBOs() {
        if (BOs.isEmpty()) {
            System.out.println("No BOs available.");
        } else {
            for (BO bo : BOs) {
                System.out.println(bo);
            }
        }
    }

}
