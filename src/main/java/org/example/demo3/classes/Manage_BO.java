package org.example.demo3.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manage_BO implements Serializable {
    private static final String FILE_NAME = "src/main/resources/DATA/bo.txt";
    private ArrayList<BO> boList;

    public Manage_BO(int length) {
        boList = new ArrayList<BO>(length);
        loadBOs();
    }
   public Manage_BO (ArrayList<BO> bo ,int  size) {
        boList = new ArrayList<BO>(size) ;
        boList = bo;
        saveBOs();
   }

    public void addBO(BO bo) {
     try {
       boList.add(bo);
       saveBOs();
     }catch(ArrayIndexOutOfBoundsException ex) {
         System.out.println(ex);

        }
    }
    public void updateBO(int index, BO bo) {
        if (index >= 0 && index < boList.size()) {
            boList.set(index , bo);
            //boList.set(index, bo);
            saveBOs();
        }
    }

    public void removeBO(int index) {
       boList.remove(index);
    }
    public ArrayList<BO> getBOs() {
        return boList;
    }
    public void saveBOs() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(boList);
            System.out.println("saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("failed to save");
        }
    }

    public void loadBOs() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            boList = (ArrayList<BO>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found or error loading data. Starting fresh.");
        }
    }

    public void displayBOs() {
        for (BO bo : boList) {
            System.out.println(bo);
        }
    }
}
