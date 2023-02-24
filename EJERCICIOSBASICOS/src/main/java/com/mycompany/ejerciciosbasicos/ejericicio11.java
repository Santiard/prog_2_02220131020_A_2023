
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejericicio11 {
    
    public static void main (String[] args){
    Scanner lectura= new Scanner(System.in);
    
    int x1;
    int y1;
    int x2;
    int y2;
    int xfinal=0;
    int yfinal;
    System.out.println("---------------------------------------");
        System.out.println("PRIMER PAR DE NUMEROS");
        System.out.println("INGRESE EL VALOR DE X");
        x1=lectura.nextInt();
        System.out.println("INGRESE EL VALOR DE Y");
        y1=lectura.nextInt();
    System.out.println("---------------------------------------");
        System.out.println("SEGUNDO PAR DE NUMEROS");
        System.out.println("INGRESE EL VALOR DE X");
        x2=lectura.nextInt();
        System.out.println("INGRESE EL VALOR DE Y");
        y2=lectura.nextInt();    

        if(x1<x2){
            for(int i=x2;i<x1;i++){
            xfinal=xfinal+i;
            }else{
                    
                    }
        
        
        }
        
    
        System.out.println("LA UBICACION DEL PUNTO RESULTANTE ESTA EN (" +xfinal+","+yfinal +")");
}
}