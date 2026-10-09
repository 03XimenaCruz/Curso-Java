package ManejoArchivos;

import java.io.File;

public class BorrarArchivo {
    public static void main(String[] args) {
        File archivo = new File("ejemplo.txt");
        //.delete() borra el archivo
        if (archivo.delete()) {
            System.out.println("Archivo eliminado: " + archivo.getName());
        }else{
            System.out.println("No se pudo borrar el archivo: " + archivo.getName());
        }
    }
}
