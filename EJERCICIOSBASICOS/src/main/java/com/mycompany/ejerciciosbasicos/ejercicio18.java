
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;


public class ejercicio18 {

    public static void main (String[] args){
        String apellido1,apellido2;
        Scanner lectura = new Scanner(System.in);
    
    
        System.out.println("INGRESE EL PRIMER APELLIDO");
        apellido1=lectura.nextLine();
        System.out.println("INGRESE EL SEGUNDO APELLIDO");
        apellido2=lectura.nextLine();
        char letra1=apellido1.charAt(0);
        char letra2=apellido2.charAt(0);
        
        System.out.println("LA INICIAL DE "+apellido1+" ES '" +letra1+"' Y LA INICIAL DE "+apellido2+" ES '"+letra2+"'");
    }    
    
    
}
