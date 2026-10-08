package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
// InputMismatchException: Ayuda a identificar que se ingresen unicamente valor enteros
public class Error_entero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = false;
        while (!continuar) {
            try {
                int valor1, valor2;
                System.out.println("Ingresa valor 1: ");
                valor1 = entrada.nextInt();
                System.out.println("Ingresa valor 2: ");
                valor2 = entrada.nextInt();
                int resultado = valor1 + valor2;
                System.out.println("Resultado: " + resultado);
                continuar = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e);
                System.out.println("Error un valor ingresado no es un entero");
                entrada.nextLine(); //limpia el valor incorrecto que ingreso el usuario
            }
        }

    }
}
