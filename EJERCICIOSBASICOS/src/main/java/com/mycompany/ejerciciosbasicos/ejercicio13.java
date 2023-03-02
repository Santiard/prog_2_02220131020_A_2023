
package com.mycompany.ejerciciosbasicos;

import static java.lang.Math.cbrt;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class ejercicio13 {
    
    public static void main (String[] args){
    Scanner lectura = new Scanner(System.in);   
    
    int num;
    
    System.out.println("INGRESE UN NUMERO");
    num=lectura.nextInt();
    double raiz2=sqrt(num);
    double raiz3=cbrt(num);
    
        System.out.println("LA RAIZ CUADRADA DE "+num +" ES DE "+raiz2+" Y LA RAIZ CUBICA ES "+raiz3);
    }
}
