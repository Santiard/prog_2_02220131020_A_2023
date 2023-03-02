
package com.mycompany.ejerciciosbasicos;
import java.util.Scanner;
public class ejercicio17 {
    
    public static void main (String[] args){
    Scanner lectura = new Scanner(System.in);
    
    int horas,minutos,segundos,segundosviaje;
    
        System.out.println("INGRESE LA HORA DE SALIDA (HORAS)");
        horas=lectura.nextInt();
        System.out.println("INGRESE LA HORA DE SALIDA (MINUTOS)");
        minutos=lectura.nextInt();
        System.out.println("INGRESE LA HORA DE SALIDA (SEGUNDOS)");
        segundos=lectura.nextInt();
        System.out.println("INGRESE CUANTOP TIEMPO DURA EL VIAJE(SEGUNDOS)");
        segundosviaje=lectura.nextInt();

        int horasviaje=segundosviaje/3600;
        int minutosviaje=(segundosviaje%3600)/60;
        segundosviaje=(segundosviaje%3600)%60;
        System.out.println("EL VIAJE TIENE UNA DURACION DE "+horasviaje+" HORAS, "+minutosviaje+" MINUTOS Y "+segundosviaje+" SEGUNDOS.");
        int horallegada = horas+horasviaje;
        int minutosllegada = minutos+minutosviaje;
        int segundosllegada = segundos+segundosviaje;
        System.out.println("LA HORA DE LLEGADA ES A LAS "+horallegada+" HORAS, "+minutosllegada+" MINUTOS Y "+segundosllegada+" SEGUNDOS.");
    }    
}
