
package com.mycompany.ejerciciosbasicos2;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[]args){
    
    Scanner lectura = new Scanner(System.in);
    GregorianCalendar calendar = new GregorianCalendar();    
        int año;
        System.out.println("INGRESE UN AÑO");
        año=lectura.nextInt();
    if(calendar.isLeapYear(año)){
        System.out.println("EL AÑO ES BICIESTO");
    }else{
        System.out.println("EL AÑO NO ES BISIESTO");
    }    
        
    }
    
}
