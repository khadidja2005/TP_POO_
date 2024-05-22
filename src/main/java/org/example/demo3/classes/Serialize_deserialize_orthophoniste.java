package org.example.demo3.classes;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serialize_deserialize_orthophoniste  {
    public static void serialize (Orthophoniste doctor , String filename) throws IOException {
        try(FileOutputStream fileout = new FileOutputStream(filename) ;
            ObjectOutputStream out = new ObjectOutputStream(fileout)) {
            out.writeObject(doctor);
        }
    }
    public static Orthophoniste deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (Orthophoniste) in.readObject();
        }
    }
}
