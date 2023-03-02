
package com.mycompany.ejerciciosbasicos;
import java.util.Scanner;
public class ejercicio19 {
    
    public static void main (String[] args){
    
    Scanner lectura = new Scanner(System.in);
        int total =0;
        System.out.println("INGRESE EL NUMERO DE RESPUESTAS A RPOMEDIAR");
        int respuestas=lectura.nextInt();
        
        for(int dato = 0; dato < respuestas; dato++){
            System.out.println("LA RESPUESTA NUMERO "+(dato)+" ES:");
            System.out.println("1.CORRECTA");
            System.out.println("2.INCORRECTA");
            System.out.println("3.NO RESONDIO");
            String opcion=lectura.nextLine();
            switch (opcion){
                
                case "1" -> {
                    total=total+5;
                    System.out.println("-----------------------------");
                    System.out.println("SE SUMARON 5 PUNTOS");
                    System.out.println("SE TIENE UN TOTAL DE "+total);
                    System.out.println("-----------------------------");
            }
                case "2" -> {
                    total=total-1;
                    System.out.println("-----------------------------");
                    System.out.println("SE RESTO 1 PUNTO");
                    System.out.println("SE TIENE UN TOTAL DE "+total);
                    System.out.println("-----------------------------");
            }
                case "3" -> {
                    System.out.println("-----------------------------");
                    System.out.println("NO SE MODIFICARON LOS PUNTOS");
                    System.out.println("SE TIENE UN TOTAL DE "+total);
                   System.out.println("-----------------------------");
                    break;
                }
 
            
            }
                    
            
        }
        System.out.println("EL PUNTAJE TOTAL DE LA EVALUACION FUE DE "+total+ " DESPUES DE CALIFICAR LAS "+respuestas+" RESPUESTAS");
    }
    
}
