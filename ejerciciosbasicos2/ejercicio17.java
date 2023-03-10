
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio17 {
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        int numero = (int)(Math.random()*100+1);
        boolean numeroadivinado = false;
        int a=0;
        int adivina;
        do {
        System.out.println("INGRESE EL NUMERO QUE CREE QUE SE CREÓ");
        adivina=lectura.nextInt();
        a++;
        if(adivina==numero){
            numeroadivinado=true;
            System.out.println("ACERTASTE EL NUMERO, ES "+numero);
        }
        if(a==10){
            System.out.println("NO ACERTASTE EL NUMERO, EL NUMERO ERA "+numero);
            break;
        }
        } while(numeroadivinado==false);
        
}
}