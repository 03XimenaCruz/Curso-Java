package Excepciones;

import java.util.Scanner;

public class Error_texto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una cantidad: ");
        String cantidad = entrada. next();
        try {
            int resultado = Integer.parseInt(cantidad);
            System.out.println("Resultado: " + resultado);
        }catch (NumberFormatException e) {
            System.out.println("El valor no es una cantidad numerica");
        }
    }
}
