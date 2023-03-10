
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;


public class ejercicio7 {
    
    public static void main (String [] args){
   

        Scanner lectura = new Scanner(System.in);
        
        double x1,x2,y1,y2;
        double distancia,sumaR;
        double valoresx, valoresy;
        int r1,r2,difr;
        System.out.println("INGRESE LA POSICION EN X DEL PUNTO CENTRAL 1");
        x1=lectura.nextDouble();
        System.out.println("INGRESE LA POSICION EN Y DEL PUNTO CENTRAL 1");
        y1=lectura.nextDouble();
        System.out.println("INGRESE LA POSICION EN X DEL PUNTO CENTRAL 2");
        x2=lectura.nextDouble();
        System.out.println("INGRESE LA POSICION EN Y DEL PUNTO CENTRAL 2");
        y2=lectura.nextDouble();
        System.out.println("INGRESE EL RADIO DE LA PRIMERA CIRCUNFERENCIA");
        r1=lectura.nextInt();
        System.out.println("INGRESE EL RADIO DE LA SEGUNDA CIRCUNFERENCIA");
        r2=lectura.nextInt();
        
        sumaR=r1+r2;
        valoresx = Math.pow(x2-x1,2);
        valoresy = Math.pow(y2-y1,2);
        distancia= Math.sqrt(valoresx+valoresy);

        if(distancia>sumaR){
            System.out.println("SON EXTERIOIRES ");
        }
        if(r1>r2){
        difr=r1-r2;
        }else {
        difr=r2-r2;
        }
        if(distancia<sumaR && distancia>difr){
            System.out.println("SON SECANTES");
        }
        if(distancia>0&&distancia<difr){
            System.out.println("SON INTERIORES");
        }
        if(distancia==sumaR){
            System.out.println("SON TANGENTES");
        }
        if(distancia==difr){
            System.out.println("SON INTERIORES");
        }
        if(distancia==0){
            System.out.println("SON CONCENTRICAS");
        }
}
}