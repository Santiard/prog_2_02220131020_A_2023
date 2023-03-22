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
public class ejercicio3 {
    public static void main (String[]args){
    
    Scanner lectura = new Scanner (System.in);
    int canscount=0;
    System.out.println("INGRESE EL NUMERO DE LATAS");
    int cans = lectura.nextInt();
    
    for(int i=0; canscount<cans;i++){
    canscount=canscount+(i+1);
        System.out.println(i+1);
    if(canscount>cans){
    canscount = canscount-(i+1);
        System.out.println("NO SE PUEDEN APILAR EXACTAMENTE "+cans+" LATAS");
        System.out.println("EL NUMERO MAXIMO QUE SE PODRIA APLIAR DE ESTAS LATAS ES DE "+canscount);
        System.out.println(i+1);
        break;
    }
    if(canscount==cans){
        System.out.println("SE PUEDEN APLICAR LAS "+cans+" LATAS SIN QUE SOBRE NINGUNA");
    }
    
    
    }
    
    
}}
