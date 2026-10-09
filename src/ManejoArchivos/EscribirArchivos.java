package ManejoArchivos;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivos {
    public static void main(String[] args) {
        try {
            //true: indica que el contenido agregado se va añadir despues del texto que ya exista
            FileWriter escribir = new FileWriter("ejemplo.txt", true);
            escribir.write("\n esta es una nueva linea"); //sustituye todo el texto anterior
            escribir.close();
            System.out.println("Escritura exitosa");
        }catch (IOException e){
            System.out.println("Error al insertar texto: \n" + e);
        }
    }
}
