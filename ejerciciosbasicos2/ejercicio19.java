
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio19 {
    public static void main (String[] args){
        boolean espacio=false;
        String vocales;
        Scanner lectura = new Scanner(System.in);
        char caracter;
        vocales="aeiou ";
        char a=vocales.charAt(0);
        char e=vocales.charAt(1);
        char i=vocales.charAt(2);
        char o=vocales.charAt(3);
        char u=vocales.charAt(4);
        char vacio=vocales.charAt(5);
        do{
        System.out.println("INGRESE UN CARACTER");
        caracter = lectura.next().charAt(0);
        if(caracter==vacio){
            espacio=true;
            break;
        }
        
        if (caracter==a||caracter==e||caracter==i||caracter==o||caracter==u){
            System.out.println("VOCAL");
            System.out.println("--------------------------");
        }
        if(caracter!=a&&caracter!=e&&caracter!=i&&caracter!=o&&caracter!=u){
            System.out.println("NO VOCAL");
            System.out.println("--------------------------");
        }
        
            }while(espacio==false);
}
}