package Excepciones;
//finally se encarga de que el sistema siga adelante haya o no excepcion
public class Try_Cath_Finally {
    public static void main(String[] args) {
        try {
            int[] valores = new int[2];
            valores[3] = 1;
            System.out.println(valores.length);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("EWrror: " +  e);
        }finally {
            System.out.println("Fin del programa");
        }
    }
}
