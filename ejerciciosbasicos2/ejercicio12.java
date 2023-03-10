
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio12 {
    
     public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        
        double total;
        double recargo;
        int mañana;
        int tarde;
         System.out.println("¿ES DIA DOMINGO?");
         System.out.println("1.PARA SI 0.PARA NO");
         int domingo=lectura.nextInt();
 
         System.out.println("¿ES TURNO DE MAÑANA?");
         System.out.println("1.PARA SI 0.PARA NO");
         mañana=lectura.nextInt();
           
        System.out.println("¿ES TURNO DE TARDE?");
        System.out.println("1.PARA SI 0.PARA NO");
        tarde=lectura.nextInt();
             
         
        
         System.out.println("INGRESE EL TOTAL DE MINUTOS DE LA LLAMADA");
         double minuto=lectura.nextDouble();
         System.out.println("INGRESE EL NUMERO DE SEGUNDOS");
         int segundos=lectura.nextInt();
         double minutos=minuto+segundos;
         total=0;
         if(minutos==5){
         total=total+1;
         }
         if(minutos<5){
         total=total+1;
         }
         if(minutos>5){
         total=total+0.80;
         }
         if(minutos>8){
         total=total+0.7;
         }
         if(minutos>10){
         total=total+0.5;
         }
         
         if(domingo==1){
             
             recargo=(3*total)/100;
             total=total+recargo;
         }
         if(mañana==1&&domingo==0){
            recargo=(15*total)/100; 
            total=total+recargo;
         }
         if(tarde==1&&domingo==0){
            recargo=(10*total)/100; 
            total=total+recargo;
         }
         System.out.println("LA DURACION DE LA LLAMADA FUE DE "+minuto+" MINUTOS Y "+segundos+" SEGUNDOS, SU COSTO TOTAL FUE DE "+total+" TENIENDO EN CUENTA LSO RECARGOS INCLUIDOS");
         
     }
}