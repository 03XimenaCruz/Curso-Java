class Matematica{
    //Declaracion de un metodo estatico
    public static int suma (int a, int b){
        return a+b;
    }
}

public class Metodos_estaticos {
    public static void main(String[] args) {
        //llamar(invocar)bel metodo estatico
        int resultado = Matematica.suma(10, 20);
        System.out.println(resultado);
    }
}
