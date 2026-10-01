import java.util.Scanner;

public class switch_mejorada {
    public static void main(String[] args) {
        int diaSemana;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el dia de semana: ");
        diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case 1 -> System.out.println("Hoy es Lunes");
            case 2 -> System.out.println("Hoy es Martes");
            case 3 -> System.out.println("Hoy es  miercoles");
            case 4 -> System.out.println("Hoy es  jueves");
            case 5 -> System.out.println("Hoy es  viernes");
            case 6 -> System.out.println("Hoy es  sabado");
            case 7 -> System.out.println("Hoy es  domingo");
            default -> System.out.println("Numero incorrecto");

        }
    }
}
