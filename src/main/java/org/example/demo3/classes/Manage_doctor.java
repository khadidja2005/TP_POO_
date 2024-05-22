package org.example.demo3.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manage_doctor implements Serializable {
    private static final String FILE_NAME = "src/main/resources/DATA/Orthophoniste.txt";
    private Orthophoniste[] ortho;

    public Manage_doctor(int length) {
        ortho = new Orthophoniste[length];
        loadOrthos();
    }
    public Manage_doctor (Orthophoniste[] bo ,int  size) {
        ortho = new Orthophoniste[size] ;
        ortho = bo;
        saveOrthos();
    }

    public void addOrtho(Orthophoniste bo) {
        try {
            for (int i =0 ; i< ortho.length ; i++) {
                if(ortho[i] == null) {
                    ortho[i] = bo;
                    saveOrthos();
                    break;

                }
            }
        }catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);

        }
    }
    public void updateBO(int index, Orthophoniste bo) {
        if (index >= 0 && index < ortho.length) {
            ortho[index] = bo;
            //boList.set(index, bo);
            saveOrthos();
        }
    }

    public void removeBO(int index) {
        if (index >= 0 && index < ortho.length) {
            ortho[index] = null;
            //boList.remove(index);
            saveOrthos();
        }
    }
    public Orthophoniste[] getBOs() {
        return ortho;
    }
    public void saveOrthos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(ortho);
            System.out.println("saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("failed to save");
        }
    }

    public void loadOrthos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            ortho = (Orthophoniste[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found or error loading data. Starting fresh.");
        }
    }

    public void displayOrthos() {
        for (Orthophoniste bo : ortho) {
            System.out.println(bo);
        }
    }
}
