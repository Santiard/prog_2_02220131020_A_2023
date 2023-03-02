
package com.mycompany.ejerciciosbasicos;
import java.util.Scanner;

public class ejercicio16 {
    
    
    
    public static void main (String[] args){
        
    int distancia,vel1,vel2,dif;
    float x, minutos;
    Scanner lectura = new Scanner(System.in);
        System.out.println("INGRESE LA DISTANCIA A LA QUE SE ENCUENTRAN LOS VEHICULOS (KM)");
        distancia=lectura.nextInt();
        System.out.println("INGRESE LA VELOCIDAD DEL PRIMER CARRO (KM/H");
        vel1=lectura.nextInt();
        System.out.println("INGRESE LA VELOCIDAD DEL SEGUNDO CARRO (KM/H");
        vel2=lectura.nextInt();
        if(vel1<vel2){
            dif=vel2-vel1;
            x=distancia/dif;
            minutos=x*60;
            
            System.out.println("EL SEGUNDO CARRO ALZANCARA AL PRIMERO EN " +minutos+" MINUTOS SI AMBOS MANTIENEN UNA VELOCIDAD CONSTANTE");
            
        
        }else{
            System.out.println("LA VELOCIDAD DEL SEGUNDO CARRO ES MENOR POR ENDE NO ALCANZARA AL PRIMERO");
        }
    
   }    
}