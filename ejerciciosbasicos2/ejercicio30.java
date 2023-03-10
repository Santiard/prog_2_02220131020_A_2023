
package com.mycompany.ejerciciosbasicos2;


public class ejercicio30 {
    public static void main (String[] args){
    
     int[][] lista= new int[4][5];   
     
    
     for(int i=0;i<4;i++){
         for(int j=0;j<5;j++){
         int numero= (int)(Math.random()*999+100);
         lista[i][j]=numero ;}
     }
        System.out.println("\n");
     int sumatotal=0;   
     int sumafila;
     for(int i=0;i<4;i++){
         sumafila=0;
         for(int j=0;j<5;j++){
             System.out.print(lista[i][j]+" ");
            sumafila += lista[i][j];}
            sumatotal=sumatotal+sumafila;
            System.out.println(sumafila);
 
     }
     int sumacolumna;
     
     for(int i=0;i<4;i++){
         sumacolumna=0;
         for(int j=0;j<5;j++){
         sumacolumna += lista[i][j];
         }
         sumatotal=sumatotal+sumacolumna;
         System.out.print(sumacolumna+" ");
     }
     
     
     System.out.println(sumatotal);
}
}
