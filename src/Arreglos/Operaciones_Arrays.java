package Arreglos;

public class Operaciones_Arrays {
    public static void main(String[] args) {
        int[] ventas ={500,950,120,450};
        int[] ventas1 ={100,50,80,60};
        int[] total= new int[ventas.length];
        int suma=0;
        System.out.println("***SUMA***");
        for(int i=0;i<ventas.length;i++){
            total[i]=ventas[i]+ventas1[i];
            suma=suma+total[i];
            System.out.println(total[i]);
        }
        System.out.println("Total: "+ suma);

        System.out.println("***RESTA***");
        int suma1=0;
        for(int i=0;i<ventas.length;i++){
            total[i]=ventas[i]-ventas1[i];
            suma1=suma1+total[i];
            System.out.println(total[i]);
        }
        System.out.println("Total: "+ suma1);

        System.out.println("***MULTIPLICACIÓN***");
        int suma2=0;
        for(int i=0;i<ventas.length;i++){
            total[i]=ventas[i]*ventas1[i];
            suma2=suma2+total[i];
            System.out.println(total[i]);
        }
        System.out.println("Total: "+ suma2);

        System.out.println("***DIVICIÓN***");
        int suma3=0;
        for(int i=0;i<ventas.length;i++){
            total[i]=ventas[i]/ventas1[i];
            suma3=suma3+total[i];
            System.out.println(total[i]);
        }
        System.out.println("Total: "+ suma3);

        System.out.println("***RESIDUO***");
        int suma4=0;
        for(int i=0;i<ventas.length;i++){
            total[i]=ventas[i]%ventas1[i];
            suma4=suma4+total[i];
            System.out.println(total[i]);
        }
        System.out.println("Total: "+ suma4);
    }
}
