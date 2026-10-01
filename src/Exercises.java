import javax.swing.*;

public class Exercises {
    public static void main(String[] args) {

        //*****PEDIR NUMERO Y VERIFICAR SI ES POSITIVO O NEGATIVO
        int num =0;
        String numero;
        numero = JOptionPane.showInputDialog("Ingrese un numero: ");
        num= Integer.parseInt(numero);
        if(num>0){
            JOptionPane.showMessageDialog(null,"El numero es positivo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es negativo");
        }

        //*****PEDIR EDAD Y VERIFICAR SI ES MAYOR O MENOR DE EDAD
        int edad1;
        String edad;
        edad = JOptionPane.showInputDialog("Ingrese su edad: ");
        edad1 = Integer.parseInt(edad);
        if(edad1 < 18){
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        }else {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        }


        //****CICLO FOR*****
        //IMPRIMIR NUMEROS DEL 1 AL 50
        for(int f=0;f<=30;f++){
            System.out.println(f);
        }

        //TABLA DE MULTIPLICAR
        int no;
        String num_tabla;
        num_tabla = JOptionPane.showInputDialog("Ingrese un número: ");
        no = Integer.parseInt(num_tabla);
        for(int f=0;f<=10;f++){
            System.out.println(no+ "X" + f + "=" + (no*f) );
        }


        //******CICLO WHILE
        int num4=5;
        String num3;
        while (num4!=0){
            num3= JOptionPane.showInputDialog(null, "Ingrese un numero: ");
            num4 = Integer.parseInt(num3);
            System.out.println("********");
            System.out.println(num4);
        }
        System.out.println("Programa terminado");

        int q=0;
        while (q<=5){
            System.out.println(q);
            q++;
        }


        //*****CICLO DO WHILE
        int f=0;
        String l;
        do{
            l = JOptionPane.showInputDialog("Ingresa el numero 5: ");
            f = Integer.parseInt(l);
            System.out.println("Número ingresado: " + f);
        }while (f!=5);
            System.out.println("Felicidades ingresaste el numero 5");



    }
}
