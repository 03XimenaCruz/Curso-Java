import java.util.Scanner;

public class Bucle_While {
    public static void main(String[] args) {
        int f =0;
        Scanner entrada = new Scanner(System.in);

       /* while(f <= 5){
            System.out.println("Vuelta #: "+ f);
            if(f==3){
                System.out.println("soy la vuelta 3");
            }
            f++;
        }*/

        //Tabla de multiplicar
        /*int valor;

        System.out.println("Ingrese tabla a consultar..");
        valor = entrada.nextInt();

        while (f <=10){
            System.out.println(valor+"X"+f+"="+valor*f);
            f++;
        }*/


        final String username = "monkey";
        final String password = "mon123";
        boolean acceso = false;

        while (!acceso){
            System.out.println("Introduce el nombre del usuario");
            String nombre = entrada.next();
            System.out.println("Introduce contraseña: ");
            String contrasenia = entrada.next();

            if (nombre.equals(username) && contrasenia.equals(password)){
                System.out.println("ACCESO CORRECTO");
                acceso = true;
            }else {
                System.out.println("CREDENCIALES INCORRECTAS");
            }
        }
        System.out.println("Final del bucle");


    }
}
