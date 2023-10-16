package pooherencia;
public class CuentaCorriente extends cuenta {
    float sobregiro;
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo,tasa);
        sobregiro=0;
        }
    public void retirar (float cantidad){
        float resultado = saldo-cantidad;
        if (resultado<0){
            sobregiro= sobregiro-resultado;
            saldo=0;
        }else{
            super.retirar(cantidad);          
        }
         }
    public void consignar (float cantidad){
        float residuo= sobregiro-cantidad;
        if (sobregiro>0){
            if (residuo>0){
                sobregiro=0;
                saldo=residuo;
            }else{
                sobregiro= -residuo;
                saldo=0;
            }
            }else{
                super.consignar(cantidad);
                }
        }
    public void extractomensual(){
        super.extractoMensual();
        
        }
    public void imprimir(){
        System.out.println("saldo = " + saldo);
        System.out.println("cargo mensual = " +comisionMensual);
        System.out.println("numeor de transacciones  " + numeroConsignaciones+numeroRetiros);
        System.out.println("valor sobregiro = " + numeroConsignaciones + numeroRetiros);
        System.out.println();
        
                
                
    }
}
