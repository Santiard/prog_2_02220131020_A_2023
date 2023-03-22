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
public class ejercicio6 {
    
    public static void main (String[]args){
    
    Scanner lectura = new Scanner (System.in);
    
        System.out.println("INGRESE SU FRASE");
        String cadena= lectura.nextLine();
        System.out.println(cadena);
        int contador=0;
        char ayuda;
        int indice = cadena.length();
        String vacio=" ";
        char espacio= vacio.charAt(0);
        for(int i=0;i<cadena.length();i++){

             ayuda = cadena.charAt(i);
            
            if(ayuda==espacio){
                contador=contador+1;

            }

            if(i==indice-1){
                
                contador=contador+1;
                System.out.println(contador);
                }else{
                System.out.println(contador);
            }
        
        }
        
        
    
    
}
}