
package com.mycompany.ejerciciosbasicos2;
import java.util.Scanner;

public class ejercicio11 {
    
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        int pagototal;
        int precio100=65;
        int precio50=70;
        int precio30=95;
        System.out.println("INGRESE EL NUMERO DE ALUMNOS QUE VAN A VIAJAR");
        int alumnos = lectura.nextInt();
        if(alumnos>=100){
            pagototal=precio100*alumnos;
            System.out.println("El pago total es de "+pagototal+" Y A CADA ALUMNO LE CORRESPONDE PAGAR "+precio100);
        }
        if(alumnos>=50&&alumnos<=99){
            pagototal=precio50*alumnos;
            System.out.println("El pago total es de "+pagototal+" Y A CADA ALUMNO LE CORRESPONDE PAGAR "+precio100);
        
        }
        if(alumnos>=30&&alumnos<=49){
            pagototal=precio30*alumnos;
            System.out.println("El pago total es de "+pagototal+" Y A CADA ALUMNO LE CORRESPONDE PAGAR "+precio100);
        
        }
        if(alumnos<30){
            pagototal=4000/alumnos;
            System.out.println("EL TOTAL A PAGAR ES DE 4000 Y A CADA ESTUDIANTE LE CORRESPONDEN PAGAR "+pagototal);
        }
        
}
}