package Arreglos;

import java.util.Arrays;

public class Arreglos_bucles {
    public static void main(String[] args) {
        //**RECORRER ARREGLO CON BUCLE FOR
        String[] productos = {"",
                              "Guayaba",
                              "Fresas",
                              "Mandarina",
                               "Sandia"};
        System.out.println("Recorrer arrego con bucle for");
        Arrays.sort(productos);
        for(int i =1; i<productos.length;i++){
            System.out.println("Producto " + i +": " + productos[i]);
        }

        //****RECORRER ARREGLO CON BUCLE WHILE
        int f=1;
        System.out.println("Recorrer arreglo con bucle while");
        while (f<productos.length){
            System.out.println("Producto " + f +": " + productos[f]);
            f++;
        }
    }
}
