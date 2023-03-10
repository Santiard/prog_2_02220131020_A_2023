
package com.mycompany.ejerciciosbasicos2;
import java.util.Scanner;
public class ejercicio1 {
    
    public static void main (String [] args){
    
        int num1 = 0;
        int num2 = 0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = lectura.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = lectura.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
            System.exit(0);
        }
        
        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("El numero mayor es: " + num2);
        }
    
    }
    
}
