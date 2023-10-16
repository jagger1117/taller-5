
package inmuebles;
public class Casa extends InmuebleVivienda {
        protected int numeroPisos;
        public Casa(int identificadorInmobiliario, int area, String direccion, int numeroBaños, int numeroHabitaciones, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroBaños, numeroHabitaciones);
        this.numeroPisos = numeroPisos;

}

    void imprimir() {
    super.imprimir();
    System.out.println("numero de pisos = "+ numeroPisos);
        }
    }