import javax.swing.*;

public class Condicional_if {
    public static void main(String[] args) {

        // ***AND**
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String edad1 = JOptionPane.showInputDialog("Ingrese su edad: ");
        edad = Integer.parseInt(edad1);

        if(edad<12){
            JOptionPane.showMessageDialog(null, "Eres un niñ@");
        } else if (edad > 12 && edad < 19) {
            JOptionPane.showMessageDialog(null, "Eres un adolescente");
        }else {
            JOptionPane.showMessageDialog(null,"Eres adulto");
        }


        //  **OR**
        boolean domingo = false, Vacaciones = false, licencia = false;

        if (domingo == true || Vacaciones == true || licencia == true ) {
            System.out.println("ACCESO DENEGADO");
        }else {
            System.out.println("ACCESO CONCEDIDO");
        }


        //  **NOT**
        System.out.println("===MONITOREO DE SISTEMA===");
        var enlinea= true;
        // ! cambia el valor de la variable a false
        if (!enlinea) {
            System.out.println("Sistema fuera de linea ");
        }else {
            System.out.println("Sistema en linea ");
        }
    }
}
