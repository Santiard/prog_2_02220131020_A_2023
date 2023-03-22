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
public class ejercicio4 {
    public static void main (String[]args){
    
    Scanner lectura = new Scanner (System.in);
        System.out.println("INGRESE EL NUMERO DE DATOS QUE DESEA VER EN LA SERIE");
        int num = lectura.nextInt();
        int first=0;
        int second=1;
        System.out.println("-------------");
        
        for(int i=0;i<num;i++){
        
        int fibonacci=first+second;
        System.out.println(fibonacci);
        first = second;
        second= fibonacci;
        
        
        }
        
    
    } 
}
