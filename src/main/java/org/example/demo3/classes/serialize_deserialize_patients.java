package org.example.demo3.classes;
import java.io.IOException;
import java.util.List;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class serialize_deserialize_patients {
    public static void serialize (List<patient> patients , String filename) throws IOException {
        try(FileOutputStream fileout = new FileOutputStream(filename) ;
            ObjectOutputStream out = new ObjectOutputStream(fileout)) {
            out.writeObject(patients);
        }
    }
    public static List<patient> deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (List<patient>) in.readObject();
        }
    }
}
