
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejercicio20 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);   
     //monedas tenemos de 2 euros, 1 euro, 50, 20 ó 10 céntimos.
        int euro1,euro2;
        float centimos50,centimos20,centimos10;
        float total = 0;
        System.out.println("¿CUANTAS MONEDAS DE DOS EUROS TIENE?");
        euro2=lectura.nextInt();
        int totaleuro2=euro2*2;
        total=total+totaleuro2;
        System.out.println("SE SUMARON "+totaleuro2+" EUROS EN MONEDAS DE 2 EUROS");
        System.out.println("-------------------------------");
        System.out.println("¿CUANTAS MONEDAS DE 1 EURO TIENE?");
        euro1=lectura.nextInt();
        total=total+euro1;
        System.out.println("SE SUMARON "+euro1+" EUROS EN MONEDAS DE 1 EUROS");
        System.out.println("-------------------------------");
        System.out.println("¿CUANTAS MONEDAS DE 50 CENTIMOS TIENE?");
        centimos50=lectura.nextFloat();
        float totalcentimos50=(centimos50*50)/100;
        total=total+totalcentimos50;
        System.out.println("SE SUMARON "+totalcentimos50+" EUROS EN MONEDAS DE 50 CENTIMOS");
        System.out.println("-------------------------------");
        System.out.println("¿CUANTAS MONEDAS DE 20 CENTIMOS TIENE?");
        centimos20=lectura.nextFloat();
        float totalcentimos20=(centimos20*20)/100;
        total=total+totalcentimos20;
        System.out.println("SE SUMARON "+totalcentimos20+" EUROS EN MONEDAS DE 20 CENTIMOS");
        System.out.println("-------------------------------");
        System.out.println("¿CUANTAS MONEDAS DE 10 CENTIMOS TIENE?");
        centimos10=lectura.nextFloat();
        float totalcentimos10=(centimos10*10)/100;
        total=total+totalcentimos10;
        System.out.println("SE SUMARON "+totalcentimos10+" EUROS EN MONEDAS DE 10 CENTIMOS");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        float totalcentimos=total*100;
        System.out.println("EL TOTAL ES DE "+total+" EUROS");
         System.out.println("LO CUAL AQUIVALE A " +totalcentimos+" CENTIMOS");
        
}
}
