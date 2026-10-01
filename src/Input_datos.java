import java.util.Scanner;

public class Input_datos {
    public static void main(String[] args) {
        String nombre;
        int edad;

        //ingresar datos mediante consola
        //objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        //next es para texto
        nombre = entrada.next(); // cuando el usuario ingrese su nombre se guardara en la variable nombre
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt(); //nextInt valores enteros
        //salida de datos
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);

    }
}
