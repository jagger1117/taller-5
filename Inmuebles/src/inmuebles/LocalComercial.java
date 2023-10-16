package inmuebles;
public class LocalComercial extends Local{
    protected static double ValorArea=3000000;
    protected String CentroComercial;
    
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, String CentroComercial){
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.CentroComercial=CentroComercial;      
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Centro comercial = " + CentroComercial);
        System.out.println();
    }
    
}
