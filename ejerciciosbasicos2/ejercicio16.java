
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio16 {
    
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("INGRESE EL PESO DEL PAQUETE (KG");
        double peso=lectura.nextDouble();
        if(peso>5){
            System.out.println("POR POLITCAS DE LA EMPRESA, ESTE PAQUETE NO SE PUEDE TRANSPORTAR.");
        }
        System.out.println("SELECCIONE LA ZONA DE UBICACION: \n 1. America del Norte \n 2.America del Central \n 3.America del Sur \n 4.Europa \n 5.Asia");
        int zona=lectura.nextByte();
        int pesoentero=0;
        int total;
        int pesoayuda;

        switch (zona){
        
            case 1:
                pesoayuda=(int)peso;
                pesoentero=((int)(peso%pesoayuda))+pesoayuda;
                total=pesoentero*24;
                System.out.println("EL COSTO ES DE "+total+" EUROS");
                break;
            case 2:
                pesoayuda=(int)peso;
                pesoentero=((int)(peso%pesoayuda))+pesoayuda;
                
                total=pesoentero*30;
                System.out.println("EL COSTO ES DE "+total+" EUROS");
                break;
            case 3:
                pesoayuda=(int)peso;
                pesoentero=((int)(peso%pesoayuda))+pesoayuda;
                
                total=pesoentero*21;
                System.out.println("EL COSTO ES DE "+total+" EUROS"); 
                break;
            case 4:
                pesoayuda=(int)peso;
                pesoentero=((int)(peso%pesoayuda))+pesoayuda;
               
                total=pesoentero*10;
                System.out.println("EL COSTO ES DE "+total+" EUROS");
                break;
            case 5:
                pesoayuda=(int)peso;
                pesoentero=((int)(peso%pesoayuda))+pesoayuda;
                
                total=pesoentero*18;
                System.out.println("EL COSTO ES DE "+total+" EUROS");
                break;
        }
    
    }
}