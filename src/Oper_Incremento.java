public class Oper_Incremento {
    public static void main(String[] args) {
        int valor1 = 5;
        //***SUMA***
        //incremento postfijo
        valor1++;
        System.out.println("Incremento: "+ valor1);

        //incremento prefijo
        ++valor1;
        System.out.println("Incremento: "+ valor1);

        //INCREMENTO DE 2 EN 2 O DE 10 EN 10 ETC
        valor1+=2;
        System.out.println("Incremento: "+ valor1);


        //****RESTA****
        //valor original
        int valor2=10;
        System.out.println("Valor original: "+ valor2);

        //decremento postfijo
        valor2--;
        System.out.println("Valor con decremento: "+ valor2);

        //decremento prefijo
        --valor2;
        System.out.println("Valor con decremento prefijo: "+ valor2);

        valor2-=3;
        System.out.println("Valor con decremento de 3: "+valor2);

        //****MULTIPLICACION****
        int valor3= 20;
        System.out.println("Valor original: "+ valor3);

        valor3*=9;
        System.out.println("Valor multiplicado: "+valor3);

        //***DIVICION***
        valor3/=10;
        System.out.println("Valor dividido: "+valor3);


    }
}
