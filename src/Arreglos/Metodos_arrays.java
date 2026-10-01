package Arreglos;

import java.util.Arrays;

public class Metodos_arrays {
    public static void main(String[] args) {
        int[] numeros = {65,32,10,9,3};
        String[] letras ={"a","g","p","q"};
        //Ver array como texto
        System.out.println("Array en texto: " + Arrays.toString(numeros));
        System.out.println("Array original: " + Arrays.toString(letras));
        //Ordenar array
        Arrays.sort(numeros);
        Arrays.sort(letras);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
        System.out.println("Array ordenado alfabeticamente: " + Arrays.toString(letras));

        //Compara los valores de 2 arrays
        int[] num={1,2,3};
        int[] num1={1,2,3};
        boolean iguales = Arrays.equals(num,num1);
        System.out.println("Son iguales " + iguales);

        //Llenar array automaticamente ---> .fill
        int[] llenar = new int[5];
        Arrays.fill(llenar,3);
        System.out.println("Llenado: " + Arrays.toString(llenar));

        //Copiar un array y agrega posiciones  ---> .copyOf
        int[] original = {1,2,3,4};
        int[]  copia =Arrays.copyOf(original,5);
        System.out.println("Copiando array: " + Arrays.toString(copia));
    }
}
