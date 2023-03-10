
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio26 {
    
    public static void main (String[] args){

        Scanner lectura = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE FILAS QUE DESEA IMPRIMIR");
        int x=lectura.nextInt(); 
        int fila=1;
        int num = 1;
        for(int i=1;i<=x;i++){
            int espacio=x-i;
            for(int a=0;a<espacio;a++){
                System.out.print(" ");
            }
            for(int j=1;j<=fila;j++){
                System.out.print(j);
            }
            for(int j=1;j<fila;j++){
                System.out.print(j);
            }

            
            System.out.println("\n");
            fila=fila+1;
        }
}
}
