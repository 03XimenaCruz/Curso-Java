package ManejoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivos {
    public static void main(String[] args) {
        try {
            File archivo = new File("ejemplo.txt");
            Scanner lector = new Scanner(archivo);

            //Con .hasNextLine(): verifica que existen ineas de texto
            // el bucle va dar vueltas hasta que deje de encontrar lineas que leer
            while (lector.hasNextLine()) {
                //linea: recibe lo que encontro lector gracias a .nextLine()
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            lector.close(); // Cierra la operacion qeu se abre con Scanner(Deja de leer el archivo)
        }//FileNotFoundException: Sirve en caso de que no haya o no se encuentre el archivo que leer
        catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado" + e);
        }
    }
}
