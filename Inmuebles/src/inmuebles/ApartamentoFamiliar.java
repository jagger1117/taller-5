package inmuebles;
public class ApartamentoFamiliar extends Apartamento{
    protected static double ValorArea=2000000;    
    protected int ValorAdministracion;
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int ValorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.ValorAdministracion=ValorAdministracion;
        
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración = " +
        ValorAdministracion);
        System.out.println();
    }
    
}
