/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ejercicio7 {
    
    
     public static void main (String[]args){
    
    Scanner lectura = new Scanner (System.in);
 
         System.out.println("VALORES DEL PRIMER VECTOR");
         int num1= lectura.nextInt();
         System.out.println("----------------");
         System.out.println("VALORE DEL SEGUNDO VECTOR");
         int num2= lectura.nextInt();
         System.out.println("----------------");
         int[]vector1 = new int[num1] ;
         int[]vector2 = new int [num2];
         int num3=num1+num2;
         int[]vector3= new int[num3];
}
}