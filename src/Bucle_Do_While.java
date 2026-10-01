import java.util.Scanner;

public class Bucle_Do_While {
    public static void main(String[] args) {
        int contador=1;
        final var valor = 5;
        Scanner entrada = new Scanner(System.in);

        //bucle do while
        do{
            System.out.println("Valor: " + contador++);
        }while (contador <= valor);
        System.out.println("Fin del bucle");


        //EJERCICIO CON DO WHILE
        int numero,errores=0;
        do{
            System.out.println("Ingresa el numero 3");
            numero = entrada.nextInt();
            if (numero!=3){
                System.out.println("Numero incorrecto");
                errores++;
            }
        }while (numero!=3);
        System.out.println("Fin del bucle, fallaste " + errores);
    }
}
