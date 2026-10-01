import javax.swing.*;

public class Input_datos2 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        //ventana grafica
        //ingresar datos
        // JOptiopPane clase para solo texto
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese su edad: ");
        edad = Integer.parseInt(edad2); //convierte a entero lo que trae la variable edad2

        //mostrar datos
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+" edad: "+edad);
    }
}
