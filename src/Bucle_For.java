public class Bucle_For {
    public static void main(String[] args) {

        //bucle ascendente
        for (int f=0; f<=10; f++) {
            System.out.println(f);
        }
        System.out.println("Fin del bucle");

        // bucle descendente
        for (int j=10; j>=0;j--){
            System.out.println(j);
        }
        System.out.println("Fin del bucle");

        int suma =0;
        System.out.println("Sumando valores");
        for(int f=0;f<=20;f++){
            if (f%2==0) {
                suma = suma + f;
                System.out.println("Valor sumado:" + f);
            }
        }
        System.out.println("Suma de pares" + suma);
    }
}
