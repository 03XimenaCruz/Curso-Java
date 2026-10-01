import java.util.Scanner;

public class Clase_Math {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //****RAIZ CUADRADA***
        System.out.println("Ingresa un número");
        int numero = 9;
        System.out.println("La rai cuadra de " + numero +" es: " + Math.sqrt(numero));
        //****POTENCIA
        var base= 5;
        var exponente= 6;
        System.out.println("Potencia: " + Math.pow(base, exponente));

        //***VALOR ABSOLUTO DE UN NÚMERO
        var absoluto= 50;
        System.out.println("Valor absoluto de "+ absoluto +"es: " + Math.abs(absoluto));
        //***IDENTIFICAR MAYOR Y MENOR VALOR
        var num1= 30;
        var num2=150;
        System.out.println("Mayor valor: " + Math.max(num1, num2));
        System.out.println("Menor valor: " + Math.min(num1, num2));
        //****REDONDEAR A ENTERO MAS CERCANO
        var total=5.698;
        System.out.println(total+ " Redondeado: " + Math.round(total));
        //****REDONDEAR HACIA ABAJO(decimal)
        System.out.println(total+ " Redondear hacia abajo: " + Math.floor(total));
        //****REDONDEAR HACIA ARRIBA A ENTERO MAS CERCANO
        System.out.println(total+ " Redondear hacia abajo: " + Math.ceil(total));
        //****NUMERO ALEATORIO (entre 0.0 y 1.0)
        // Math.random()*10 (entre 0 y 10);
        double aleatorio = Math.random();
        System.out.println("Valor aleatorio: " + aleatorio);
        //****FUNCION PI
        System.out.println("Valor de PI: " + Math.PI);
        //***SENO DE UN ANGULO
        System.out.println("Seno de un angulo de 90: "+ Math.sin(90));
        //***COSENO DE UN ANGULO
        System.out.println("Coseno de un angulo de 180: "+ Math.cos(180));
        //****LOGARITMO NATURAL DE UN NUMERO
        var log= 100;
        System.out.println("Logaritmo de " + log + " = " +  Math.log(log));
        //***LOGARITMO BASE 10
        var log1= 100;
        System.out.println("Logaritmo base 10 de " + log + " = " +  Math.log10(log1));


    }
}
