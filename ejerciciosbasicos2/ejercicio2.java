
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio2 {
 
    public static void main (String [] args){
    
        int num = 0;

        Scanner lectura = new Scanner(System.in);

        
        System.out.println("Ingrese un numero: ");
        num = lectura.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        
    
    }
    
}
