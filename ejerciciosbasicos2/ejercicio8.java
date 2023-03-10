
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio8 {
    
    public static void main (String [] args){
    
        int lado1;
        int lado2;
        int lado3;
        double h1,h2,h3;
        Scanner lectura = new Scanner(System.in);

        System.out.println("INGRESE EL LADO 1 DEL TRIANGULO");
        lado1=lectura.nextInt();
        System.out.println("INGRESE EL LADO 2 DEL TRIANGULO");
        lado2=lectura.nextInt();
        System.out.println("INGRESE EL LADO 3 DEL TRIANGULO");
        lado3=lectura.nextInt();
    
        
        if(lado1==lado2&&lado1==lado3){
            System.out.println("ES UN TRIANGULO EQUILATERO");
        } 
        if(lado1==lado2&&lado1!= lado3||lado2==lado3&&lado2!=lado1){
            System.out.println("EL TRIANGULO ES ISOSELES");
        }
        if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3){
            System.out.println("EL TRIANGULO ES ESCALENO");
        }
        
        
        
        if(lado1>lado2&&lado1>lado3){
            
            h1= Math.sqrt(Math.pow(lado2,2)+Math.pow(lado3,2));
            if(lado1==h1){
                System.out.println("ES TRIANGULO RECTANGULO");
            }
        }
        if(lado2>lado1&&lado2>lado3){
            
            h2= Math.sqrt(Math.pow(lado1,2)+Math.pow(lado3,2));
            if(lado2==h2){
                System.out.println("ES TRIANGULO RECTANGULO");
            }
        }
        if(lado3>lado2&&lado3>lado1){
            
            h3= Math.sqrt(Math.pow(lado2,2)+Math.pow(lado1,2));
            if(lado3==h3){
                System.out.println("ES TRIANGULO RECTANGULO");
            }
        }
    
        
    }
    
}
