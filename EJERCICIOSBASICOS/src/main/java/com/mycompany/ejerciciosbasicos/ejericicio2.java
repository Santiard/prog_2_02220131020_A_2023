
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejericicio2 {
 
    public static void main(String[] args) {
        
        int base;
        int altura;
        int perimetro;
        
        Scanner lectura = new Scanner(System.in);   
        System.out.println("Ingrese la base del triangulo :");
        base=lectura.nextInt();
        System.out.println("Ingrese la altura :");
        altura=lectura.nextInt();
        
        perimetro=((2*base)+(2*altura));
        
        System.out.println("El perimetro del rectangulo es de: "+perimetro);
}
    
    
    
    
}
