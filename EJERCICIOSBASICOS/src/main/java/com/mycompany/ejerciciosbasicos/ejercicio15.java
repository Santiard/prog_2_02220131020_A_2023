
package com.mycompany.ejerciciosbasicos;
import java.util.Scanner;

public class ejercicio15 {
    
    
    
    public static void main (String[] args){
        
    int num1,num2,num3,num4;
    Scanner lectura = new Scanner(System.in);
    System.out.println("INGRESE UN NUMERO A");
    num1=lectura.nextInt();
    System.out.println("INGRESE UN NUMERO B");
    num2=lectura.nextInt();
    num4=num2;
    num3=num1;
    num1=(num1-num1)+num4;
    num2=(num2-num2)+num3;
        System.out.println("EL NUMERO A ("+num3+") AHORA VALE "+num1);
        System.out.println("EL NUMERO B ("+num4+") AHORA VALE "+num2);
   }    
}
