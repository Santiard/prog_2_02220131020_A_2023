
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio15 {
    
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO DE UN MES");
        int mes= lectura.nextInt();
        if(mes<1||mes>12){
            System.out.println("ERROR: número incorrecto");
        }
        switch(mes){
            
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4: 
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10: 
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        
        
        }
}
}