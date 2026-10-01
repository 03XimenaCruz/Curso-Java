public class Break_Continue {
    public static void main(String[] args) {
        int control=0,f =0;
        System.out.println("Cargando registros");
        while(f<=10){
            System.out.println("Ciclo" + f);
            f++;
            if(f==7){
                System.out.println("error de carga, saliendo del sitema..");
                break;
            }
        }


        for(f=0;f<=20;f++){
            if(f%2==0){
                continue; //ignora el resultaod y continua con lo demas
            }
            System.out.println("Ciclo" + f);
        }
    }
}
