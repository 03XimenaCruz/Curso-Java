package Recursividad;

public class Factorial {
    //metodo
    public int factorial(int n){
        System.out.println(n);
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }
    public static void main(String[] args) {
        Factorial objvalor = new Factorial();
        System.out.println(objvalor.factorial(6));

    }
}
