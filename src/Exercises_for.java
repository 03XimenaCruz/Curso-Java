import javax.swing.*;

public class Exercises_for {
    public static void main(String[] args) {
        boolean validar = false;
        for (int f=0; !validar; f++){
            String email = JOptionPane.showInputDialog("Digite su email: ");
            if(email.contains("@") &&  email.endsWith(".com")){
                JOptionPane.showMessageDialog(null, "Correo ingresado correctamente");
                validar=true;
                break;
            } else if (!email.contains("@")) {
                JOptionPane.showMessageDialog(null, "Corre no valido, debes ingresar un @");
            }else {
                JOptionPane.showMessageDialog(null, "Correo no valido debes ingresar .com");
            }
        }











    }
}
