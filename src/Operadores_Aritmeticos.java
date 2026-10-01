import java.util.Scanner;

public class Operadores_Aritmeticos {
    public static void main(String[] args) {
        int valor1,valor2, resultado;
        Scanner entrada = new Scanner(System.in);

        //ingreso de datos
        System.out.println("Ingresa el valor 1: ");
        valor1 = entrada.nextInt();
        System.out.println("Ingresa el valor 2: ");
        valor2 = entrada.nextInt();

        //SUMA
        resultado = valor1 + valor2;
        System.out.println("Suma: "+ resultado);

        //RESTA
        resultado = valor1 - valor2;
        System.out.println("Resultado: " + resultado);

        //MULTIPLICACION
        resultado = valor1 * valor2;
        System.out.println("Multiplicación: "+ resultado);

        //DIVICION
        resultado = valor1 / valor2;
        System.out.println("Division: "+ resultado);

        //RESIDUO
        resultado = valor1 % valor2;
        System.out.println("Modulo: "+ resultado);


    }
}
