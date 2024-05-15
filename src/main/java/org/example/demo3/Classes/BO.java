package org.example.demo3.Classes;

public class BO {
    private static boolean numero_BO;


    public BO() {
        this.numero_BO = false;
    }
    public static boolean getNumero_BO() {
        return numero_BO;
    }
    public static void setNumero_BO(boolean numero_BO) {
        BO.numero_BO = numero_BO;
    }

}
