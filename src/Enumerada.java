public class Enumerada {
    //Definicon de un ENUM
    enum DiasSemana {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    public static void main(String[] args) {
        DiasSemana hoy = DiasSemana.Lunes;
        //for each toma un valor inicial y  recorre una lista de valores 1 por 1 utilizando -> .values
        for (DiasSemana dia : DiasSemana.values()) {
            System.out.println(dia);
        }
    }
}
