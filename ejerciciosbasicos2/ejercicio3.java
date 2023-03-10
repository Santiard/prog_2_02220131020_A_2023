
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;


public class ejercicio3 {
    
    public static void main (String [] args){
    

        Scanner lectura = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = lectura.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = lectura.nextInt();
        
        if (num2 == 0) {
            System.out.println("ERROR: No se puede dividir por cero");
            System.exit(0);
        }
        
        System.out.println("El resultado de la division es: " + num1 / num2);
        
    }

        
       
        
    
    }
    

