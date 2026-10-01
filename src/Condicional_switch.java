import java.util.Scanner;

public class Condicional_switch {
    public static void main(String[] args) {
        int diaSemana;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el dia de semana: ");
        diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es  miercoles");
                break;
            case 4:
                System.out.println("Hoy es  jueves");
                break;
            case 5:
                System.out.println("Hoy es  viernes");
                break;
            case 6:
                System.out.println("Hoy es  sabado");
                break;
            case 7:
                System.out.println("Hoy es  domingo");
                break;
            default:
                System.out.println("Numero incorrecto");
                break;
        }

    }
}
