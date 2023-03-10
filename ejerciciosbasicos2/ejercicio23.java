
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;


public class ejercicio23 {
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        System.out.println("INGRESE EL PLAZO DE LA COMPRA (meses) ");
        int plazo = lectura.nextInt();
        int pago;
        System.out.println("INGRESE EL PAGO DEL PRIMER MES");
        pago=lectura.nextInt();
        for(int i=1 ;i<plazo;i++){
        pago=pago+pago;
        }
        System.out.println("FINALMENTE SE HABRAN PAGADO UN TOTAL DE "+pago+" EUROS.");
}
}