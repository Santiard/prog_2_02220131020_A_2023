
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args) {

    System.out.println("----------------------------------------------------");
        
        int numero1;
        int numero2;
        int suma;
        int  resta;
        int multiplicacion;
        int division;
    
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("Ingrese el 1 numero: ");
        numero1=lectura.nextInt();
        System.out.println("Ingrese el 2 numero: ");
        numero2=lectura.nextInt();
        
        
        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;
        if(numero2==0){
            System.out.println("La suma es: "+suma);
            System.out.println("La resta es: "+resta);
            System.out.println("La suma es: "+multiplicacion);
            System.out.println("La division no se puede efectuar");
        }else{
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La suma es: "+multiplicacion);
        System.out.println("La suma es: "+division);}
        System.out.println("----------------------------------------------------");
        
    
}
    
    
}
