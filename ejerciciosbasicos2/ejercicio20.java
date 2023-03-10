
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;


public class ejercicio20 {
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        System.out.println("INGRESE EL PRIMER NUMERO DEL RANGO");
        int num1=lectura.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO DEL RANGO");
        int num2=lectura.nextInt();
        
        if(num1>num2){
            
            for(int a=num2;a<num1;a++){
            int num=a%2;
                
                if(num==0){
                    System.out.println("--> "+a);
                }
            }
        }
        if(num2>num1){
        for(int a=num1;a<num2;a++){
            int num=a%2;
            
                if(num==0){
                    System.out.println("--> "+a);
                }
            }
        
        }
}
}