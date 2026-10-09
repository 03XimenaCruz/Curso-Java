package Hilos;

class  Mensaje implements Runnable{
    public void run(){
        System.out.println("Hilo en ejecucion");
    }
}

public class I_Runnable {
    public static void main(String[] args) {
        //Es obligatorio crear un objeto de la clase Mensaje y un objeto Thread
        Mensaje obj1 = new Mensaje(); //clase que contiene el hilo
        Thread hilo = new Thread(obj1); // se le pasaa como parametro obj1
        hilo.start();
    }
}
