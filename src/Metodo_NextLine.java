import java.util.Scanner;

public class Metodo_NextLine {
    public static void main(String[] args) {
        //EL METODO NEXTLINE ES PARA TEXTO
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese palabra 1: ");
        palabra1 = entrada.nextLine();
        System.out.println("Ingrese palabra 2: ");
        palabra2 = entrada.nextLine();

        System.out.println(palabra1);
        System.out.println(palabra2);
    }
}
