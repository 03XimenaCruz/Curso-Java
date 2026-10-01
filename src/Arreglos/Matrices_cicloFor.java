package Arreglos;

public class Matrices_cicloFor {
    public static void main(String[] args) {
        int [][] cantidades = {
                {10,5,60},
                {85,69,10},
                {8,11,3}
        };
        //1. For (filas)
        //2. For (columnas)
        for (int i=0;i<cantidades.length;i++){
            for(int j=0;j<cantidades[i].length;j++){
                System.out.print(cantidades[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
