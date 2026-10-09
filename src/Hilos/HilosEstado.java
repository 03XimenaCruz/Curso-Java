package Hilos;

class HilosMonitor extends Thread{
    public void run (){
        //--> .getState: trae el estado del hilo
        System.out.println("Estado del hilo al comenzar: " + this.getState());
        try {
            //el hilo entra en estado runnable cuando se llama start
            for(int i=0;i<5;i++){
                System.out.println("Hilo en ejecución: " + i);
                Thread.sleep(2000); //el hilo entra en estado TIMED_WAITING
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Estado del hilo al terminar: " +  this.getState());
    }
}

public class HilosEstado {
    public static void main(String[] args) {
        HilosMonitor obj = new HilosMonitor();
        System.out.println("Estado del hilo despues de creado: "+  obj.getState());
        obj.start(); // el hilo paasa a runable
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Estado luego de esperar: " +  obj.getState());
        try {
            obj.join(); //Espera que el hilo termine
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Estado al finalizar el hilo: " +  obj.getState());

    }
}
