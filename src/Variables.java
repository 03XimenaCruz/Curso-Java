public class Variables {
    public static void main(String[] args) {
        //DECLARAR VARIABLES
        String nombre= "Lulu";
        String apellido = "Calushis";
        int edad = 25;
        double valor = 10.5;
        //IMPRIMIR EN CONSOLA EL VALOR DE LA VARIABLE
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(valor);

        //CONCATENAR
        System.out.println(nombre + " " + apellido);
        //DECLARAR VARIABLES EN UNA SOLA LINEA E INICIALIZARLAS
        String palabra1="Holap", palabra2="Lulu";
        //CONCATENAR CON EL METODO CONCAT
        System.out.println(palabra1.concat(palabra2));

        //DECLARAR VARIABLES SIN COLOCAR EL TIPO DE DATO, CON LA PALABRA CLAVE **VAR**
        //PARA UTILIZARLA SIEMPRE SE DEBE INICIALIZAR LA VARIABLE
        var anio= 2026;
        var mes = "Septiembre";
        System.out.println(mes + " " + anio);

        //INICIALIZAR VARIABLES
        String canal, curso;
        canal="informaticonfig";
        curso="Java";
        System.out.println(canal.concat(" " + curso));




    }
}
