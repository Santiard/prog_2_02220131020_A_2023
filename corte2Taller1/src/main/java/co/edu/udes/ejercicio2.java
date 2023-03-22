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
public class ejercicio2 {
    
    public static void main (String[]args){
    
    Scanner lectura = new Scanner (System.in);
    
        System.out.println("INGRESE UNA FECHA");
        int day = 32;
        do{
        System.out.println("DIA (MENOR O IGUAL A 31):");
        day=lectura.nextInt();}while(day>31);
        int month= 13;
        do{
            System.out.println("MES (MENOR O IGUAL A 12):");
            month= lectura.nextInt();
        }while(month>12);
        int year=2030;
        do{
            System.out.println("AÑO (MENOR O IGUAL A 2029):");
            year=lectura.nextInt();
            
        }while(year>2029);
        int newdays=0;
        switch(month){
        
            case 1:
                newdays=day;
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
            
            case 2:
                if((year%4)==0){
                if(day>29){
                    System.out.println("LA FECHA ES INCORRECTA");
                }else{
                    
                    newdays=(31+day);
                    System.out.println("LA FECHA ES CORRECTA");
                    System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                
                }
                }else{
                if(day>228){
                    System.out.println("LA FECHA ES INCORRECTA");
                }else{
                    
                    newdays=(31+day);
                    System.out.println("LA FECHA ES CORRECTA");
                    System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                
                }
                }
            case 3:
                if((year%4)==0){
                newdays=(30*(month-1))+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}
                else{
                newdays=(30*(month-1))-1+day;
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }
            case 4:
                if((year%4)==0){
                newdays=(30*(month-1))+1+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}}
                else{
                newdays=(30*(month-1))+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }}
            case 5:
                if((year%4)==0){
                newdays=(30*(month-1))+1+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}
                else{
                newdays=(30*(month-1))+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }
            case 6:
                if((year%4)==0){
                newdays=(30*(month-1))+2+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}}
                else{
                newdays=(30*(month-1))+1+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }}
            case 7 :
                if((year%4)==0){
                newdays=(30*(month-1))+2+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}
                else{
                newdays=(30*(month-1))+1+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }
            case 8:
                if((year%4)==0){
                newdays=(30*(month-1))+3+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}
                else{
                newdays=(30*(month-1))+2+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }
            case 9 :
                if((year%4)==0){
                newdays=(30*(month-1))+4+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}}
                else{
                newdays=(30*(month-1))+3+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }}
            case 10:
                if((year%4)==0){
                newdays=(30*(month-1))+4+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}
                else{
                newdays=(30*(month-1))+3+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }
            case 11:
                if((year%4)==0){
                newdays=(30*(month-1))+5+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}}
                else{
                newdays=(30*(month-1))+4+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }}
            case 12:
                if((year%4)==0){
                newdays=(30*(month-1))+4+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");}
                else{
                newdays=(30*(month-1))+3+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("HAN TRANSCURRIDO UN TOTAL DE "+newdays +" DIAS DEL AÑO");
                }
                
        }
}
}
