
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio27 {
    public static void main (String[] args){

        Scanner lectura = new Scanner(System.in);
          int[] lista = new int[10];

        for(int i=0;i<10;i++){
            System.out.println("INGRESE UN NUMERO");
            lista[i]=Integer.parseInt(lectura.nextLine());
        }
        System.out.println("LOS NUMEROS AL REVES SON");
        for(int i=9;1>=0;i--){
            System.out.println(lista[i]);
        }
        
}
}