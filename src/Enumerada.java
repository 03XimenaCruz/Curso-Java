public class Enumerada {
    //Definicon de un ENUM
    enum DiasSemana {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    public static void main(String[] args) {
        DiasSemana hoy = DiasSemana.Lunes;
        //for ich recorre una lista de valores utilizando -> .values
        for (DiasSemana dia : DiasSemana.values()) {
            System.out.println(dia);
        }
    }
}
