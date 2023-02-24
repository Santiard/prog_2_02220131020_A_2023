
package com.mycompany.ejerciciosbasicos;
import java.util.Scanner;

public class ejericicio10 {
    
    public static void main (String[] args){
    
    Scanner lectura = new Scanner(System.in);
    double calificacionparcial;
    double calificacionparcia2;
    double calificacionparcia3;
    double examenfinal;
    double trabajofinal;
    double notafinal;
    
    System.out.println("INGRESE SU NOTA 1 PARCIAL ");
    calificacionparcial=lectura.nextDouble();
    System.out.println("INGRESE SU NOTA 2 PARCIAL ");
    calificacionparcia2=lectura.nextDouble();
    System.out.println("INGRESE SU NOTA 3 PARCIAL ");
    calificacionparcia3=lectura.nextDouble();
    System.out.println("INGRESE SU NOTA DEL EXAMEN FINAL");
    examenfinal=lectura.nextDouble();
    System.out.println("INGRESE SU NOTA DEL TRABAJO FINAL");
    trabajofinal=lectura.nextDouble();
    
    double promedio1;
    promedio1=(((calificacionparcia2+calificacionparcia3+calificacionparcial)/3)*55)/100;
    double promedio2;
    promedio2=(examenfinal*30)/100;
    double promedio3;
    promedio3=(trabajofinal*15)/100;
    notafinal=promedio1+promedio2+promedio3;
    System.out.println("SU NOTA FINAL ES DE "+notafinal);
    } 
}
