package Hilos;

class Saludar extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Saludos");
        }
    }
}

class Despedir extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Adios a todos");
        }
    }
}


public class Paralelos {
    public static void main(String[] args) {
        Saludar saludar = new Saludar();
        Despedir despedir = new Despedir();
        saludar.start();
        despedir.start();

    }
}
