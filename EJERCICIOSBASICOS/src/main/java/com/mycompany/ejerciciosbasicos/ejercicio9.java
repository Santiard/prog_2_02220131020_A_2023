
package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class ejercicio9 {
    
    public static void main (String[] args){
    Scanner lectura = new Scanner(System.in);
    double compra;
    double subtotal;
    double total;
    
        System.out.println("INGRESE EL SUBTOTAL DE LA COMPRA");
        compra=lectura.nextDouble();
        subtotal=(compra*15)/100;
        total=compra+subtotal;

        System.out.println("SU TOTAL A APGAR CON LOS DESCUENTOS APLICADOS ES DE "+total);
    
 
}}
