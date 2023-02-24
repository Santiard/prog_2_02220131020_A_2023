
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejericicio7 {
    public static void main(String[] args) {

    System.out.println("----------------------------------------------------");
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los minutos que desea convertir");
        int minutos;
        int horas;
        int minutosrestantes;
        minutos=lectura.nextInt();
        minutosrestantes=minutos%60;
        horas=minutos/60;
        System.out.println(minutos +" equivale a "+horas +" completas y sobraran "+minutosrestantes +" minutos.");
        
    
    
}}
