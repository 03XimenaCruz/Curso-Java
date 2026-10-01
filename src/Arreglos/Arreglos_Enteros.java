package Arreglos;

import java.util.Arrays;

public class Arreglos_Enteros {
    public static void main(String[] args) {
        //Declaracion de un array -> int[] numeros;
        int[] numeros = new int[5];
        //Creación de un array ->numeros = new int[10];
        //Inicializar array forma 1
        numeros[0] = 110;
        numeros[1] = 22;
        numeros[2] = 3;
        numeros[3] = 564;
        numeros[4] = 599;
        //inicalizra array forma 2
        int[] valor = {65,35,40};
        //Consultar array
        Arrays.sort(numeros);
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(valor[1]);
    }
}
