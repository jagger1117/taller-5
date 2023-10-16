
package pooherencia;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("cuenta de ahorros");
        System.out.println("ingrese saldo inicial");
        float saldoinicialAhorros = input.nextFloat();
        System.out.println("Ingrese tasa de interes=");
        float tasaAhorros=input.nextFloat();
        CuentaAhorros cuenta1=new CuentaAhorros (saldoinicialAhorros, tasaAhorros);
        System.out.println("Ingrese cantidad a consignar");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.println("Ingresar cantidad a retirar");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
        
        
       
    }
    
}
