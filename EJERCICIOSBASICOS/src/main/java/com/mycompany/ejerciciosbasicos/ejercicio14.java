
package com.mycompany.ejerciciosbasicos;
import java.util.Scanner;

public class ejercicio14 {
    
    public static void main (String[] args){
    
    int num,invertido = 0, resto;    
        
    Scanner lectura = new Scanner(System.in);
    System.out.println("INGRSE UN NUMERO DE DOS CIFRAS");
    num=lectura.nextInt();
    
    while( num > 0 ) {
         resto = num % 10;
         invertido = invertido * 10 + resto;
         num /= 10;
      }
 
      System.out.println( "Número invertido: " + invertido );
   }
    
    }    

