
package com.mycompany.ejerciciosbasicos2;
import java.util.Scanner;
public class ejercicio10 {
   
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        double preciofinal; 
        double precioinicial;
        System.out.println("INGRESE EL PRECIO INICIAL DEL KILO DE UVA");
        precioinicial=lectura.nextDouble();
        System.out.println("INGRESE EL TAMAÑO DE LA UVA (1 O 2)");
        int tamaño=lectura.nextInt();
        System.out.println("INGRESE EL TIPO DE LA UVA (TIPO A O B)");
        System.out.println("UTILICE 1.PARA A Y 0. PARA B");
        int tipo=lectura.nextInt();
        
        if(tipo==1&&tamaño==1){
        preciofinal=precioinicial+0.20;
            System.out.println("EL PRECIO DE LA ENTREGA DEL KILO DE UVA ES DE "+preciofinal);
        }
        if(tipo==1&&tamaño==2){
        preciofinal=precioinicial+0.30;
            System.out.println("EL PRECIO DE LA ENTREGA DEL KILO DE UVA ES DE "+preciofinal);
        }
        if(tipo==0&&tamaño==1){
        preciofinal=precioinicial-0.30;
            System.out.println("EL PRECIO DE LA ENTREGA DEL KILO DE UVA ES DE "+preciofinal);
        }
        if(tipo==0&&tamaño==2){
        preciofinal=precioinicial-0.50;
            System.out.println("EL PRECIO DE LA ENTREGA DEL KILO DE UVA ES DE "+preciofinal);
        }
    }
    
}
