package org.example.demo3.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manage_BO implements Serializable {
    private static final String FILE_NAME = "src/main/resources/DATA/bo.txt";
    private BO[] boList;

    public Manage_BO(int length) {
        boList = new BO[length];
        loadBOs();
    }
   public Manage_BO (BO[] bo ,int  size) {
        boList = new BO[size] ;
        boList = bo;
        saveBOs();
   }

    public void addBO(BO bo) {
     try {
       for (int i =0 ; i< boList.length ; i++) {
         if(boList[i] == null) {
             boList[i] = bo;
             saveBOs();
             break;

         }
       }
     }catch(ArrayIndexOutOfBoundsException ex) {
         System.out.println(ex);

        }
    }
    public void updateBO(int index, BO bo) {
        if (index >= 0 && index < boList.length) {
            boList[index] = bo;
            //boList.set(index, bo);
            saveBOs();
        }
    }

    public void removeBO(int index) {
        if (index >= 0 && index < boList.length) {
            boList[index] = null;
            //boList.remove(index);
            saveBOs();
        }
    }
    public BO[] getBOs() {
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
            boList = (BO[]) ois.readObject();
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
