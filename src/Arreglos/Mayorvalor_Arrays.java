package Arreglos;

import java.util.Scanner;

public class Mayorvalor_Arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros= new int[5];
        int mayor =0;

        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingresa un valor: ");
            numeros[i]=entrada.nextInt();
            if(mayor<numeros[i]){
                mayor=numeros[i];
            }
        }
        System.out.println("Mayor valor ingresado: " +  mayor);
    }
}
