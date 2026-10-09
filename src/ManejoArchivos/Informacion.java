package ManejoArchivos;

import java.io.File;
import java.text.SimpleDateFormat;

public class Informacion {
    public static void main(String[] args) {
        File Info_archivo =  new File("C:/Cursos/java/proyecto1/src/Registros.txt");
        if (Info_archivo.exists()){
            System.out.println("Nombre archivo: "+Info_archivo.getName());
            //ver ruta del archivo
            System.out.println("Ruta del archivo: " +Info_archivo.getPath());
            //Identificar si un archivo puede leerse o no
            System.out.println("Puede leerse? " + Info_archivo.canRead());
            System.out.println("Puede escribirse? "+ Info_archivo.canWrite());
            System.out.println("Puede abrirse el archivo? "+ Info_archivo.canExecute());
            System.out.println("Tamaño del archivo: " + Info_archivo.length());
            //verificar si un archivo es un directprio
            boolean esDirectorio = Info_archivo.isDirectory();
            System.out.println("Es directorio ? "+ esDirectorio);
            //ver si es archivo
            System.out.println("Es un archivo ? "+ Info_archivo.isFile());
            //ultima fecha de modificacion de un archivo
            System.out.println("Ultima actualizacion: "+  Info_archivo.lastModified());
            //formatear fecha
            SimpleDateFormat fechamodif = new SimpleDateFormat("dd/MM/yyyy");
            String fechamodif2 = fechamodif.format(Info_archivo.lastModified());
            System.out.println("Ultima actualizacion: "+  fechamodif2);
        }else {
            System.out.println("No existe el archivo");
        }
    }
}
