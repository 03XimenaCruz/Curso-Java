package Excepciones;

public class MultiExceptions {
    public static void main(String[] args) {
        try {
            String texto = "hola";
            System.out.println("Texto: " + texto.length());
            int[] numeros = new int[5];
            System.out.println(numeros[6]);
        }catch (NullPointerException e){
            System.out.println("El texto tiene valor nulo");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de limite");
        }

    }
}
