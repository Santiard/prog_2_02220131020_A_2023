
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejercicio6 {
     public static void main(String[] args) {

    System.out.println("----------------------------------------------------");
        
        Scanner lectura = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        double media;
        System.out.println("INGRESE EL 1 NUMERO");
        num1= lectura.nextInt();
        System.out.println("INGRESE EL 2 NUMERO");
        num2= lectura.nextInt();
        System.out.println("INGRESE EL 3 NUMERO");
        num3= lectura.nextInt();
        
        media=(num1+num2+num3)/3;
        System.out.println("La media de los 3 numeros es " +media);
        
    
    
    
}
    
}
