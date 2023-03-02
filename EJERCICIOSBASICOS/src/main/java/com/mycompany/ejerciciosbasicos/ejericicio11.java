
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejericicio11 {
    
    public static void main (String[] args){
    Scanner lectura= new Scanner(System.in);
    
    int num1,num2,numfinal;
    
    numfinal=0;
        System.out.println("INGRESE EL PRIMER NUMERO ");
        num1=lectura.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO ");
        num2=lectura.nextInt();
        
        if(num1<num2){
            for(int i=num1;i<num2;i++){
            numfinal=numfinal+1;
            } 
        }
        if(num1>num2){
            for(int i=num2;i<num1;i++){
            numfinal=numfinal+1;
            }
        }
        System.out.println("LA DIFERENCIA ENTRE LOS DOS NUMEROS ES DE " +numfinal);
}
}