
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejercicio12 {
    
    public static void main (String[] args){
    Scanner lectura= new Scanner(System.in);
    
    int x1;
    int y1;
    int x2;
    int y2;
    int xfinal=0;
    int yfinal=0;
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
            for(int i=x1;i<x2;i++){
            xfinal=xfinal+1;
            } 
        }
        if(x1>x2){
            for(int i=x2;i<x1;i++){
            xfinal=xfinal+1;
            }
                    }
        if(y1<y2){
            for(int i=y1;i<y2;i++){
            yfinal=yfinal+1;
            } 
        }
        if(y1>y2){
            for(int i=y2;i<y1;i++){
            yfinal=yfinal+1;
            }
                    }
        
        
        
        
    
        System.out.println("LA UBICACION DEL PUNTO RESULTANTE ESTA EN (" +xfinal+","+yfinal +")");
}
}
