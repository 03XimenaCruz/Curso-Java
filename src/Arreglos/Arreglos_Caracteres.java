package Arreglos;

import java.util.Arrays;

public class Arreglos_Caracteres {
    public static void main(String[] args) {
        String[]  productos = new String[3];
        productos[0] = "Guayaba";
        productos[1] = "Fresas";
        productos[2] = "Mandarina";


        //organizar el contenido del array en forma alfabetica
        Arrays.sort(productos);
        System.out.println("Producto 1: " + productos[0]);
        System.out.println("Producto 2: " + productos[1]);
        System.out.println("Producto 3: " + productos[2]);
    }
}
