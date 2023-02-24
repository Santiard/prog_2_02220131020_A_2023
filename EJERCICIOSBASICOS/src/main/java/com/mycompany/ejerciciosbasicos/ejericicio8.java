
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;


public class ejericicio8 {
    
    public static void main(String[] args) {

    System.out.println("----------------------------------------------------");
        
        Scanner lectura = new Scanner(System.in);
        int salario;
        int comision1;
        int comision2;
        int comision3;
        int total;
        int pago;
        
        System.out.println("INGRESE SU SALARIO: ");
        salario=lectura.nextByte();
        System.out.println("INGRESE SU PRIMERA VENTA");
        comision1=lectura.nextInt();
        System.out.println("INGRESE SU SEGUNDA VENTA");
        comision2=lectura.nextInt();
        System.out.println("INGRESE SU SEGUNDA VENTA");
        comision3=lectura.nextInt();
        
        total=comision1+comision2+comision3;
        int comisiontotal;
        comisiontotal=(total*10)/100;
        total=salario+comisiontotal;
        System.out.println("Su sueldo base es de "+salario+" y sus comisiones por ventas fueron de "+comisiontotal+" para un pago total "+total);
        
    
}
    
    
}
