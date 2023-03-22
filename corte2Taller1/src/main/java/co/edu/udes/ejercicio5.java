/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes;

import java.util.Scanner;

/**
 *
 * @author Santiago Ardila
 */
public class ejercicio5 {
    
    
    public static void main (String[]args){
    
    Scanner lectura = new Scanner (System.in);
    
        System.out.println("INGRESE EL ALTO DEL TRIANGULO");
        int num = lectura.nextInt();
        
        System.out.println("QUE ALINEACION DESEA PARA EL TRIANGULO");
        System.out.println("1.IZQUIERDA 2.DERECHA");
        int alienacion=lectura.nextInt();
        if(alienacion==2){
        for(int fila=0;fila<num;fila++){

            for(int a=fila;a<num;a++){
                System.out.print(" ");
                
            }
            
            for(int asterisco = 0;asterisco<=fila;asterisco++){
            System.out.print("*");
        }
            System.out.println("\n");
        }

        } 
        if(alienacion==1){
        for(int fila=0;fila<num;fila++){

            
            
            for(int asterisco = 0;asterisco<=fila;asterisco++){
            System.out.print("*");
        }
            for(int a=fila;a<num;a++){
                System.out.print(" ");
                
            }
            System.out.println("\n");
        }

        } 
}
}