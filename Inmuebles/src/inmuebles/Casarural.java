
package inmuebles;
public class Casarural extends Casa{
    protected static double valorArea= 1500000;
    protected int distanciaCabera;
    protected int altitud;

    public Casarural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabera=distanciaCabera;
        this.altitud=altitud;              
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println("distancia la cabezera municipal = " +numeroHabitaciones + "Km" );
        System.out.println("altitud = " +altitud + "mts" );
        System.out.println();
    }
    
    
}
