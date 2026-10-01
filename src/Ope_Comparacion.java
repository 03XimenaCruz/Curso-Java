public class Ope_Comparacion {
    public static void main(String[] args) {
        int valor = 90, valor1 = 50;

        //**    IGUALDAD    ***
        //compara el valor de la variable, es decir
        //va comparar 90 y 50 para ver si son iguales
        var resultado = valor==valor1;
        System.out.println(valor+ " es igual a " + valor1+ ":"+resultado);

        // DISTINTO DE..
        System.out.println(valor!=valor1);

        //MAYOR QUE
        System.out.println(valor > valor1);

        //MENOR QUE
        System.out.println(valor < valor1);

        //MENOR O IGUAL QUE
        System.out.println(valor <= valor1);

        //MAYOR QUE
        System.out.println(valor >= valor1);
    }
}
