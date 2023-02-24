
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejericicio3 {
        public static void main(String[] args) {

    System.out.println("----------------------------------------------------");
        
        float cateto1;
        float cateto2;
        float hipotenusacuadrada;
        float hipotenusa;
    
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el cateto 1");
        cateto1=lectura.nextInt();
        System.out.println("Ingrese el cateto 2");
        cateto2=lectura.nextInt();
        
        hipotenusacuadrada= (cateto1*cateto1)+(cateto2*cateto2);
        hipotenusa=(float) Math.sqrt(hipotenusacuadrada);
        System.out.println("La hipotenusa es: "+hipotenusa);
    
    
    
}}
