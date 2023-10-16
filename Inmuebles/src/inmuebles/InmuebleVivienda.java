package inmuebles;
public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroBaños, int numeroHabitaciones ) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroBaños=numeroBaños;
        this.numeroHabitaciones=numeroHabitaciones;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("numero de habitaciones = " +
        numeroHabitaciones);
        System.out.println("numero de baños = " + numeroBaños);
}
        
    }




