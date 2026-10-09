package ManejoArchivos;

import java.io.File;
import java.io.IOException;

public class Crear_Archivos {
    public static void main(String[] args) {
        //Crear un objeto de la clase File, que contiene la definicion de un archivo
        File archivo = new File("ejemplo.txt");

        if (archivo.exists()){
            System.out.println("El archivo ya existe");
        }else {
            try {
                //Crear archivo
                boolean creado = archivo.createNewFile();
                if (creado) {
                                                //.getName(): consuktar el nombre del archivo
                    System.out.println("Archivo creado " +  archivo.getName());
                }else {
                    System.out.println("El archivo no sea creado");
                }
            }catch (IOException e){
                System.out.println("Error: "+ e);
            }
        }
    }
}
