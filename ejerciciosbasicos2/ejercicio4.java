
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;


public class ejercicio4 {
    
    public static void main (String [] args){
   

        Scanner lectura = new Scanner(System.in);
        
        char letra = ' ';

        System.out.println("Ingrese una letra: ");
        letra = lectura.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayuscula");
        } else {
            System.out.println("La letra es minuscula");
        }
        
    
    }
    
}
