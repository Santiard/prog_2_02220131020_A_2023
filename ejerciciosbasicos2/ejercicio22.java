
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio22 {
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
         double base;
         int exponente;
         
         
        System.out.println("Introduce la base: ");
        base = lectura.nextDouble();
        
        System.out.println("Introduce el exponente: ");
        exponente = lectura.nextInt();
        
        double resultado = 1;
        
        for (int i = 1; i <= exponente; i++) {
            
            resultado *= base;
        }
        
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
    
}
}