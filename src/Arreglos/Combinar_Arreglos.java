package Arreglos;

public class Combinar_Arreglos {
    public static void main(String[] args) {
        String[] productos = {
                                "Guayaba",
                                "Fresas",
                                "Mandarina",
                                "Sandia"};
        double[] precio= {35,65.50,50,115};
        for (int i=0; i<productos.length;i++){
            System.out.println(productos[i]+ " $ " +  precio[i]);
            if(precio[i]<100.0){
                System.out.println("NO PAGA IMPUESTOS");
            }else {
                System.out.println("PAGA IMPUESTOS");
            }
        }

    }
}
