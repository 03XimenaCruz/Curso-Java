import javax.swing.*;

public class Exercises_while {
    public static void main(String[] args) {
        final String u_correcto="Monkey";
        final String u_password="hola123";

        String user, password;
        int intentos=0, max_intentos=4;
        while(intentos < max_intentos){
            user= JOptionPane.showInputDialog("Ingrese su usuario:");
            password= JOptionPane.showInputDialog("Ingrese su contraseo:");
            if(user.equals(u_correcto) && password.equals(u_password)){
                JOptionPane.showMessageDialog(null, "Crendeciales correctas, Bienvenido" + u_correcto);
                break;
            }else{
                intentos++;
                JOptionPane.showMessageDialog(null, "Usuario o contraseado no valido, intente de nuevo");
            }
            if(intentos>3){
                JOptionPane.showMessageDialog(null, "Intentos de acceso excedidos");
            }
        }

    }

}
