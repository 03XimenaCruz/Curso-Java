import java.util.Scanner;

public class Clase_String {
    public static void main(String[] args) {

        //el metodo next es para solo una palabra
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la palabra 1: ");
        palabra1 = entrada.next();
        System.out.println("Ingresa la palabra 2: ");
        palabra2 = entrada.next();
        // COMPARAR CONTENIDO
        if (palabra1.equals(palabra2)) {
            System.out.println(palabra1 + " es igual a: " + palabra2);
        }else {
            System.out.println(palabra1 + " no es igual a: " + palabra2);
        }


        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println(palabra1 + " es igual a: " + palabra2 + " sin importar las mayusculas..");
        }else {
            System.out.println(palabra1 + " no es igual a: " + palabra2 + " sin importar las mayusculas..");
        }

        //COMPRARAR CANTIDAD DE CARACTERES
        if(palabra1.compareTo(palabra2) == 0) {
            System.out.println(palabra1 + " tiene las mismas letras que: " + palabra2);
        }else {
            if(palabra1.compareTo(palabra2) > 0) {
                System.out.println(palabra1 + " tiene mas letras que: " + palabra2);
            }else {
                System.out.println(palabra1 + " tiene menos letras que: " + palabra2);
            }
        }


        //SABER POSICION DE CARACTER DE UNA PALABRA
        char caracter = palabra1.charAt(0);
        System.out.println("Primera caracter de " + palabra1 + ":" + caracter);


        //CANTIDA DE CARACTERES DE UN TEXTO
        System.out.println("Cantidad de caracteres de " + palabra1 + ":"+  palabra1.length());
        System.out.println("Cantidad de caracteres de " + palabra2 +":" +palabra2.length());

        //IDENTIFICAR VARIOS CARACTERES
        System.out.println(palabra1.substring(0,3));
        System.out.println(palabra2.substring(0,6));

        //BUSCAR CARATERES QUE COINCIDAN EN DOS PALABRAS
        int coincidencia = palabra1.indexOf(palabra2);
        if(coincidencia == -1) {
            System.out.println(palabra1 + "no contiene "+palabra2);
        }else{
            System.out.println(palabra1 + " contiene " +palabra2);
        }

        //CONVERTIR A MAYUSCULA
        System.out.println(palabra1 + " en mayusculas es: " + palabra1.toUpperCase());

        //CONVERTIR A MINUSCULAS
        System.out.println(palabra2 + " en minusculas es: " + palabra2.toLowerCase());
    }
}
