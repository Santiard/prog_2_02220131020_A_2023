
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejericicio28 {
    
    public static void main (String[]args){
    
        Scanner lectura = new Scanner(System.in);
          int[] lista = new int[10];
          int max=0;
          int min=99999;
        for(int i=0;i<10;i++){
            System.out.println("INGRESE UN NUMERO");
            lista[i]=Integer.parseInt(lectura.nextLine());
            if(lista[i]>max){
		max = lista[i];}
            if(lista[i]<min){
                min = lista[i];}
        
        }
        System.out.println("LOS NUMEROS AL REVES SON");
        for(int i=0;i<10;i++){
 
            if(lista[i]==max){
                System.out.println(lista[i]+ " maximo");
            }
            if(lista[i]==min){
                System.out.println(lista[i]+ " minimo");
            }
            if(lista[i]!=min&&lista[i]!=max){
                System.out.println(lista[i]);
            
            }
        }
    }
}
