
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;


public class ejercicio25 {
    
    public static void main (String[] args){

        Scanner lectura = new Scanner(System.in);
        
        int n;
        
        
        System.out.print("Introduce la cantidad de números primos que deseas mostrar: ");
        n = lectura.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {
            boolean esPrimo = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                
                if (num % i == 0) {
                    
                    esPrimo = false;
                    break;
                    
                }
            }
            if (esPrimo) {
                
                System.out.print(num + " ");
                count++;
                
            }
            num++;
}
}
}