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
public class ejercicio1 {
    
    
    public static void main (String[]args){
    
    Scanner lectura = new Scanner (System.in);
        // PEDIMOS EL INGRESO DE LOS SEGUNDOS EN ENTERO 
        System.out.println("INGRESE EL TOTAL DE SEGUNDOS");
        int inseconds = lectura.nextInt();
        //ENCONTRAMOS SUS RESPECTIVAS EQUIVALENCIAS EN HORAS Y DEMAS
        int hours = inseconds/3600;
        int minutes = (inseconds%3600)/60;
        int seconds = (inseconds%3600)%60;
        int days = hours/24;
        hours=hours%24;
        //PARA SABER SI ES AM O PM COLOCAMOS UN IF
        if(hours>12){
        //calculamos e imprimimos 
        int newhours= hours-12;
            System.out.println(inseconds+ " serian "+days+" dias, "+hours+" horas, "+minutes+ " minutos, "+seconds+" segundos");
            System.out.println("CORRESPONDIENDO A:");
            System.out.println(inseconds+ " serian "+days+" dias, "+newhours+" horas(PM), "+minutes+ " minutos, "+seconds+" segundos");   
                }else{
            System.out.println(inseconds+ " serian "+days+" dias, "+hours+" horas, "+minutes+ " minutos, "+seconds+" segundos"); 
            System.out.println("CORRESPONDIENDO A:");
            System.out.println(inseconds+ " serian "+days+" dias, "+hours+" horas(AM), "+minutes+ " minutos, "+seconds+" segundos");
        }
    }
    
    
}
