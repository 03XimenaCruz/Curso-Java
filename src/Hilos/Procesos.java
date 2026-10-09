package Hilos;
class Procceso1 extends Thread{
    //metodo define la tarea que realizara el hilo
    public void run(){
        System.out.println("Analizando datos ....");
        //pausar un hilo por un tiempo especifico
        try {
            Thread.sleep(3000); //3000-->3 segundos
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Cargando datos...");
        try {
            Thread.sleep(3000); //3000-->3 segundos
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Carga finalizada");
    }

}
public class Procesos {
    public static void main(String[] args) {
        Procceso1 hilo1 = new Procceso1();
        hilo1.start(); // inicializa el hilo de la clase Proceso1

    }
}
