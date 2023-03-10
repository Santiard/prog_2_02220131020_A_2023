
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio18 {
    
    public static void main (String[] args){
    
        Scanner lectura = new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS A PEDIR");
        int cantidad = lectura.nextInt();
        boolean terminado = false;
        int mayor,menor,igual;
        mayor=0;
        menor=0;
        igual=0;
        int a=0;
        do{
            System.out.println("INGRESE UN NUMERO");
            int numero = lectura.nextInt();
            if(numero>0){
            mayor=mayor+1;
                System.out.println("LLEVA "+mayor +" NUMEROS MAYORES A 0");
                System.out.println("-------------------------------------");
            }
            if(numero==0){
            igual=igual+1;
                System.out.println("LLEVA "+igual +" NUMEROS IGUALES A 0");
                System.out.println("-------------------------------------");
            }
            if(numero<0){
            menor=menor+1;
                System.out.println("LLEVA "+menor +" NUMEROS MENORES A 0");
                System.out.println("-------------------------------------");
            }
            a++;
            if(a==cantidad){
            terminado=true;
            }
        }while(terminado==false);
        
        System.out.println("SE INGRESARON: \n ->"+mayor+" MAYORES QUE 0 \n ->"+igual+" IGUALES A 0 \n ->"+menor+" MENORES QUE 0");
        
}
}