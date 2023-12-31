
package inmuebles;
public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int ValorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int ValorAdministracion,
        boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);  
        this.ValorAdministracion = ValorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
        }

        void imprimir(){
            super.imprimir(); // Invoca al método imprimir de la clase padre
            System.out.println("valor de la administración = " + ValorAdministracion);
            System.out.println("Tiene piscina?  " + tienePiscina);
            System.out.println("Tiene campos deportivos?  "+tieneCamposDeportivos);
            System.out.println();     
        }
        }

    
    


