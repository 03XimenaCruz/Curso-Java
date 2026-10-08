package Excepciones;

import java.util.Scanner;

// excepcion: ---> ArithmeticException <----
public class DivisionCero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valor 1: ");
        int valor1 = entrada.nextInt();
        System.out.println("Ingrese valor 2: ");
        int valor2 = entrada.nextInt();

        try {
            int resultado = valor1 / valor2;
            System.out.println("Resultado: " + resultado);
        }catch (ArithmeticException e) {
            System.out.println("No puedes dividir por zero");
        }
    }

}
