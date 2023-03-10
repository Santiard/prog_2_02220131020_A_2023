
package com.mycompany.ejerciciosbasicos2;

import java.util.Scanner;

public class ejercicio21 {
    public static void main (String[] args){
        boolean limite=false;
        int num1,num2;
        Scanner lectura = new Scanner(System.in);
        do{
        System.out.println("INGRESE EL PRIMER NUMERO DEL LIMITE SUPERIOR INTERVALO");
        num1=lectura.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO DEL LIMITE INFERIOIR INTERVALO");
        num2=lectura.nextInt();
        if(num1>num2){limite=true;}
        }while(limite==false);
        boolean cero=false;
        int numero;
        int sumadentro = 0;
        int numerosfuera = 0;
        boolean igual;
        
        while(cero==false){
            System.out.println("INGRESE UN NUMERO");
            numero=lectura.nextInt();
        if(numero==0){
            cero=true;
        }    
            
        if(numero<num1&&numero>num2){
            sumadentro=sumadentro+numero;
            //System.out.println(sumadentro);
        }else{
        numerosfuera=numerosfuera+1;
        }
        if(numero==num1||numero==num2){
        igual=true;
        }
        
            
        }
        System.out.println("INFORMES \n -LA SUMA DE LOS NUMEROS QUE ESTAN DENTRO DEL INTERVALO ES DE "+sumadentro);
        System.out.println("HAY "+numerosfuera+" NUMEROS FUERA DEL INTERVALO");
        if(cero==true){
            System.out.println("SE INGRESARON NUMEROS IGUALES A LOS LIMITES");
        }
    }  
}
