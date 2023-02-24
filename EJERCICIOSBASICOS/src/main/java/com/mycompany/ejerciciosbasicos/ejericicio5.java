
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejericicio5 {
    
    public static void main(String[] args) {

    System.out.println("----------------------------------------------------");
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese una temperatura (grados Fahrenheit");
        float gradosF;
        gradosF = lectura.nextFloat();
        float gradosC;
        gradosC=(gradosF-32)*(5/9);
        System.out.println("La temperatura es "+gradosC +"C");

    
    
    
}
    
}
