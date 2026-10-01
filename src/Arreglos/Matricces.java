package Arreglos;

public class Matricces {
    public static void main(String[] args) {
        // Crear matriz
        //fila-columna
        int[][] numeros = new int[3][3];
        //Llenado fila 1
        numeros[0][0] = 6;
        numeros[0][1] = 25;
        numeros[0][2] = 34;

        //Llenado fila 2
        numeros[1][0] = 9;
        numeros[1][1] = 45;
        numeros[1][2] = 94;

        //Llenado fila 3
        numeros[2][0] = 1;
        numeros[2][1] = 4;
        numeros[2][2] = 3;

        System.out.println(numeros[0][2]);
    }
}
