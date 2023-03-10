
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;


public class ejercicio6 {
    
    public static void main (String [] args){
   

        Scanner lectura = new Scanner(System.in);
        
        int edad = 0;
        String genero = "";
        int nota = 0;


        System.out.println("Ingrese su edad: ");
        edad = lectura.nextInt();
        System.out.println("Ingrese su genero (M para Masculino - F Para femenino): ");
        genero = lectura.next();
        System.out.println("Ingrese su nota: ");
        nota = lectura.nextInt();

        if (edad >= 18 && genero.equals("M") && nota >= 5) {
            System.out.println("POSIBLE");
            System.exit(0);
        }
        if (edad >= 18 && genero.equals("F") && nota >= 5) {
            System.out.println("ACEPTADA");
            System.exit(0);
        }else{
            System.out.println("NO ACEPTADA");
            
        }
        
    
    }
    
}
