public class Casting {
    public static void main(String[] args) {
        // de texto a entero
        String num= "123";
        int num2 = Integer.parseInt(num);
        System.out.println("Numero entero: " + num2);

        //ENTERO A TEXTO
        int edad= 35;
        String edad2 =String.valueOf(edad);
        System.out.println("texto: " + edad2);

        //DOBLE A ENTERO
        double numDoble= 45.60;
        int numEntero= (int) numDoble;
        System.out.println("Numero entero: " + numEntero);

        //ENTERO A DOBLE
        int numEntero1 = 50;
        double numDoble1 = (double) numEntero1;
        System.out.println("Numero doble: " + numDoble1);

    }
}
