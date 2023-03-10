
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio14 {
   
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO CORRESPONDIENTE A UN DIA DE LA SEMANA");
        int dia =lectura.nextInt();
        
        if(dia<1||dia>7){
            System.out.println("ERROR: número incorrecto");
        }
        
        switch(dia){
            
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
        }
}
}