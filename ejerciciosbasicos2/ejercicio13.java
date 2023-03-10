
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio13 {
    public static void main (String[] args){
    
    Scanner lectura = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE LA CARA DEL LADO");
        int cara =lectura.nextInt();
        
        if(cara<1||cara>6){
            System.out.println("ERROR: número incorrecto");
        }
        
        switch(cara){
            
            case 1:
                System.out.println("SEIS");
                break;
            case 2:
                System.out.println("CINCO");
                break;
            case 3:
                System.out.println("CUATRO");
                break;
            case 4:
                System.out.println("TRES");
                break;
            case 5:
                System.out.println("DOS");
                break;
            case 6:
                System.out.println("UNO");
                break;
        }
        
            
        }

}
