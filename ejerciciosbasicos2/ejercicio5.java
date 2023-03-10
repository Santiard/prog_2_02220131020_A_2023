
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio5 {
    
    public static void main (String [] args){
   

        Scanner lectura = new Scanner(System.in);
        
        int num = 0;
        int exponente = 0;
        double resultado = 0;


         System.out.println("Ingrese un numero: ");
        num = lectura.nextInt();
        System.out.println("Ingrese el exponente: ");
        exponente = lectura.nextInt();
        
    if (exponente < 0) {

        exponente = exponente * -1;
        resultado = Math.pow(num, exponente);
        System.out.println("El resultado es: 1/" + resultado);
        System.exit(0);
    }    
    if (exponente == 0) {
        System.out.println("El resultado es: 1");
        System.exit(0);
    }

    
    resultado = Math.pow(num, exponente);
    System.out.println("El resultado es: " + resultado);

        
    
    }
    
}
