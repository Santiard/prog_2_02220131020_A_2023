
package com.mycompany.taller01;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.swing.*;
public class Taller01 {

    public static void main(String[] args) {

        int num1;
        int num2;
        int num3 = 1;
        int resultado;
        int num4;
        int sumaMedia;
        float media;
        float sumacentros;
        int mitad;
        float mediana;
        boolean confirmacion ;
        int numeroayuda = 0;
        int numeroayuda2 = 0;
        String dato;
        
        Random claseRandom = new Random();
        num1 = 1 + claseRandom.nextInt(2024-1);
        num2 = 1 + claseRandom.nextInt(2024-1);
        System.out.println("EJERCICIO NUMERO 1");

        System.out.println("El multiplicando es: "+num1);   
        System.out.println("El multiplicador es: "+num2);

        
        System.out.println("Seleccion que bucle desea probar (usando los numeros indicados) :");
        System.out.println("1. for");
        System.out.println("2. for each");
        System.out.println("3. while");
        System.out.println("4. do while");
        System.out.println("Seleccione su opcion:"); 
        Scanner lectura = new Scanner (System.in); 
        String eleccion1 = lectura.next()  ;
        switch(eleccion1){
           case ("1"):
               for(num3=1; num3<num2; num3++){
                   
                   resultado=num1*num3;
                   System.out.println(num1+" x "+num3 +" = " +resultado);   }
                   break;

           case ("2"):
               
                for(int operacion : new int[num2 + 1]){
                resultado = num1 * num3;
                System.out.println(num1+" x "+num3 +" = " +resultado);
                num3++;
                }

               break;
            
           case ("3"):
               
               while (num3<num2){
               resultado=num1*num3;
               System.out.println(num1+" x "+num3 +" = " +resultado);
               num3++;
               }
               break;
           case ("4"):    
               do {
               resultado=num1*num3;
               System.out.println(num1+" x "+num3 +" = " +resultado);
               num3++;
               } while(num3 <num2);
               break;
           default:
               System.out.println("Seleccion una de las opciones validas");
               

        }
        
        
        System.out.println("EJERCICIO NUMERO 2");
        num4 = 1 + claseRandom.nextInt(21-1);


        System.out.println("Seleccion que bucle desea probar (usando los numeros indicados) :");
        System.out.println("1. for");
        System.out.println("2. for each");
        System.out.println("3. while");
        System.out.println("4. do while");
        System.out.println("Seleccione su opcion:");
        String eleccion2 = lectura.next()  ;
        
        int[] datos = new int [num4];
        sumaMedia=0;
        mediana=0;
        switch(eleccion2){
           case ("1"): 
               System.out.println("Usted va a tener que ingresar "+num4 +" valores para este ejercicio");
               for(int i=0;i<num4;i++){
               System.out.println("ingrese un valor:");
               dato = lectura.next();
               int valor = Integer.parseInt(dato);
               datos[i] = valor;
           }
               System.out.println("Ya ingresaste todos los valores necesarios");
               System.out.println("Los valores ingresados son: ");
               for(int i=0;i<num4;i++){
                   System.out.print(datos[i]+" ");
                   sumaMedia=datos[i]+sumaMedia;  
                   Arrays.sort(datos);
                   mitad = datos.length/2;
                if(datos.length % 2 == 0) {
                    sumacentros=(datos[mitad-1]+datos[mitad]);
                    mediana= (sumacentros/2);
                }
                else{
                    mediana=datos[mitad];
                }
                   
               }
               media=sumaMedia/num4;
               
               System.out.println("\n La MEDIA de los datos ingresados es de: "+media);
               System.out.println("La MEDIANA de los datos ingresados es de " +mediana);
               

               break;
               
        
           case ("2"):
               System.out.println("Usted va a tener que ingresar "+num4 +" valores para este ejercicio");
                
               for(int a: datos){
                System.out.println("ingrese un valor:");
                dato = lectura.next();
                int valor = Integer.parseInt(dato);
                datos[numeroayuda] = valor;
                sumaMedia=datos[numeroayuda]+sumaMedia; 
                numeroayuda++ ;   
               }
               if (numeroayuda==num4){
                System.out.println("Ya ingresaste todos los valores necesarios");
                System.out.println("Los valores ingresados son: ");}
                for(int operacion: new int [numeroayuda2+1]){
                   System.out.print(datos[numeroayuda2]+" ");
                    numeroayuda2++;
                    Arrays.sort(datos);
               }
                mitad = datos.length/2;
                if(datos.length % 2 == 0) {
                    sumacentros=(datos[mitad-1]+datos[mitad]);
                    mediana= (sumacentros/2);
                }
                else{
                    mediana=datos[mitad];
                }
                media=sumaMedia/num4;    
                System.out.println("\n La MEDIA de los datos ingresados es de: "+media);
                System.out.println("La MEDIANA de los datos ingresados es de " +mediana);
                
               
                break;

                
           case ("3"):
                System.out.println("Usted va a tener que ingresar "+num4 +" valores para este ejercicio");

                while (numeroayuda<num4){
                System.out.println("ingrese un valor:");
                dato = lectura.next();
                int valor = Integer.parseInt(dato);
                datos[numeroayuda] = valor;
                sumaMedia=datos[numeroayuda]+sumaMedia; 
                numeroayuda++ ;  }          
                if (numeroayuda==num4){
                System.out.println("Ya ingresaste todos los valores necesarios");
                System.out.println("Los valores ingresados son: ");}
                while (numeroayuda2<num4){
                    System.out.print(datos[numeroayuda2]+" ");
                    numeroayuda2++;
                    Arrays.sort(datos);

                }
                mitad = datos.length/2;
                if(datos.length % 2 == 0) {
                    sumacentros=(datos[mitad-1]+datos[mitad]);
                    mediana= (sumacentros/2);
                }
                else{
                    mediana=datos[mitad];
                }
                media=sumaMedia/num4;    
                System.out.println("\n La MEDIA de los datos ingresados es de: "+media);
                System.out.println("La MEDIANA de los datos ingresados es de " +mediana);
                

               break;
           case ("4"):    
                System.out.println("Usted va a tener que ingresar "+num4 +" valores para este ejercicio");
                do {
                while (numeroayuda<num4){
                System.out.println("ingrese un valor:");
                dato = lectura.next();
                int valor = Integer.parseInt(dato);
                datos[numeroayuda] = valor;
                sumaMedia=datos[numeroayuda]+sumaMedia; 
                numeroayuda++ ;  }          
                }while(numeroayuda<num4);
                if (numeroayuda==num4){
                System.out.println("Ya ingresaste todos los valores necesarios");
                System.out.println("Los valores ingresados son: ");}
                
                while (numeroayuda2<num4){
                    System.out.print(datos[numeroayuda2]+" ");
                    numeroayuda2++;
                    Arrays.sort(datos);

                }
                mitad = datos.length/2;
                if(datos.length % 2 == 0) {
                    sumacentros=(datos[mitad-1]+datos[mitad]);
                    mediana= (sumacentros/2);
                }
                else{
                    mediana=datos[mitad];
                }
                media=sumaMedia/num4;    
                System.out.println("\n La MEDIA de los datos ingresados es de: "+media);
                System.out.println("La MEDIANA de los datos ingresados es de " +mediana);
                
                
                break;
                
                
           default:
               System.out.println("Seleccion una de las opciones validas");
               

        }
        
        System.out.println("EJERCICIO NUMERO 3");

        System.out.println("Seleccion que bucle desea probar (usando los numeros indicados) :");
        System.out.println("1. for");
        System.out.println("2. for each");
        System.out.println("3. while");
        System.out.println("4. do while");
        System.out.println("Seleccione su opcion:");
        String eleccion3 = lectura.next()  ;

        int inventario = (int) ((Math.random()*23)+1);
        System.out.println("Se requiere ingresar un total de " +inventario +" productos para registrar.");  
        System.out.println("");*/
        /* nombre cantidad precio 

        
        String nombre [];
        nombre = new String[inventario];
        
        int cantidad [];
        cantidad = new int [inventario];
        
        float precio [];
        precio = new float [inventario];
        
        int indice=0;
        float preciototal;
        switch (eleccion3){
        
            case("1"):
                
                for(int i=0;i<inventario;i++){
                    System.out.println("Ingrese el producto: ");
                    String nombretemporal = lectura.next()  ;
                    nombre[i]=nombretemporal;
                    System.out.println("Ingrese la cantidad existente del producto: ");
                    int cantidadtemporal = lectura.nextInt();
                    cantidad[i]=cantidadtemporal;
                    System.out.println("Ingrese el precio del producto: ");
                    float preciotemporal = lectura.nextFloat();
                    precio[i]=preciotemporal;
 
                    
                }
                
                System.out.println("SU FACTURA ES LA SIGUIENTE: ");
                for(int i=0;i<inventario;i++){
                preciototal=cantidad[i]*precio[i];    
                System.out.println( indice+" producto es " +nombre[i] +" Cantidad: " +cantidad[i] +"Precio unidad: "+precio[i]);
                System.out.println("Un costo total de " +preciototal +" por el total de unidades.");
                indice++;
                }
                
                 break;
            
            case("2"):
                for(int a: cantidad){
                
                System.out.println("Ingrese el producto: ");
                    String nombretemporal = lectura.next()  ;
                    nombre[indice]=nombretemporal;
                    System.out.println("Ingrese la cantidad existente del producto: ");
                    int cantidadtemporal = lectura.nextInt();
                    cantidad[indice]=cantidadtemporal;
                    System.out.println("Ingrese el precio del producto: ");
                    float preciotemporal = lectura.nextFloat();
                    precio[indice]=preciotemporal;
                    indice++;
                }
                System.out.println("SU FACTURA ES LA SIGUIENTE: ");
                 indice= indice-inventario;
                for(int a: cantidad){
                   
                    preciototal=cantidad[indice]*precio[indice];
                    System.out.println( (indice+1) +" producto es " +nombre[indice] +" Cantidad: " +cantidad[indice] +" Precio unidad: "+precio[indice]);
                    System.out.println("Un costo total de " +preciototal +" por el total de unidades.");

                    indice++;
                }
            
                break;
            case("3"):
                while(indice<inventario){
                
                System.out.println("Ingrese el producto: ");
                String nombretemporal = lectura.next()  ;
                nombre[indice]=nombretemporal;
                System.out.println("Ingrese la cantidad existente del producto: ");
                int cantidadtemporal = lectura.nextInt();
                cantidad[indice]=cantidadtemporal;
                System.out.println("Ingrese el precio del producto: ");
                float preciotemporal = lectura.nextFloat();
                precio[indice]=preciotemporal;
                indice++;
                }
                System.out.println("SU FACTURA ES LA SIGUIENTE: ");
                indice=0;
                while(indice<inventario){
                    preciototal=cantidad[indice]*precio[indice];    
                    System.out.println( (indice+1)+" producto es " +nombre[indice] +" Cantidad: " +cantidad[indice] +" Precio unidad: "+precio[indice]);
                    System.out.println("Un costo total de " +preciototal +" por el total de unidades.");
                    indice++;
                
                }
                break;
            case("4") :   
        
                do{
                System.out.println("Ingrese el producto: ");
                String nombretemporal = lectura.next()  ;
                nombre[indice]=nombretemporal;
                System.out.println("Ingrese la cantidad existente del producto: ");
                int cantidadtemporal = lectura.nextInt();
                cantidad[indice]=cantidadtemporal;
                System.out.println("Ingrese el precio del producto: ");
                float preciotemporal = lectura.nextFloat();
                precio[indice]=preciotemporal;
                indice++;
   
                }while(indice<inventario);
                System.out.println("SU FACTURA ES LA SIGUIENTE: ");
                indice=0;
                do{
                preciototal=cantidad[indice]*precio[indice];    
                    System.out.println( (indice+1)+" producto es " +nombre[indice] +" Cantidad: " +cantidad[indice] +" Precio unidad: "+precio[indice]);
                    System.out.println("Un costo total de " +preciototal +" por el total de unidades.");
                    indice++;
                
                }while(indice<inventario);
                
            break;
            default:
            System.out.println("Seleccion una de las opciones validas");
        }
       
        System.out.println("EJERCICIO NUMERO 4");

        System.out.println("Seleccion que bucle desea probar (usando los numeros indicados) :");
        System.out.println("1. for");
        System.out.println("2. for each");
        System.out.println("3. while");
        System.out.println("4. do while");
        System.out.println("Seleccione su opcion:");
        String eleccion4 = lectura.next();
        
        System.out.println("USTED VA A TENER QUE INGRESAR 5 PALABRAS");
        System.out.println("INGRESE LA PRIMERA PALABRA");
        String palabra1=lectura.next();
        System.out.println("INGRESE LA SEGUNDA PALABRA");
        String palabra2=lectura.next();
        System.out.println("INGRESE LA TERCERA PALABRA");
        String palabra3=lectura.next();
        System.out.println("INGRESE LA CUARTA PALABRA");
        String palabra4=lectura.next();
        System.out.println("INGRESE LA QUINTA PALABRA");
        String palabra5=lectura.next();
        
      
        
        
        switch(eleccion4){
        
            case("1"):

                if(palabra1.length()>palabra2.length() || palabra1.length()==palabra2.length() ){
                for(int i=0; i<palabra1.length();i++){
                  for(int m=0; m<palabra1.length();m++){
                  char letra1 = palabra1.charAt(m);
                  char letra2 = palabra2.charAt(i);
                  if (letra1 == letra2){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 2 en la letra " +letra1 +" del lugar numero " +(i+1));
                  }else{
                      System.out.println("");
                  }
                  }   
             }
            } else {
                for(int i=0; i<palabra2.length();i++){
            
                for(int m=0; m<palabra2.length();m++){
                  char letra1 = palabra1.charAt(i);
                  char letra2 = palabra2.charAt(m);
                  if (letra1 == letra2){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 2 en la letra " +letra1 +" del lugar numero " +(i+1));
                  }else{
                      System.out.println("");
                  }
                  }
                
                }
                }
                if(palabra1.length()>palabra3.length() || palabra1.length()==palabra3.length()){
                for(int i=0; i<palabra1.length();i++){
                  for(int m=0; m<palabra1.length();m++){
                  char letra1 = palabra1.charAt(m);
                  char letra3 = palabra3.charAt(i);
                  if (letra1 == letra3){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 3 en la letra " +letra1 +" del lugar numero " +(i+1));
                  }else{
                      System.out.println("");
                  }
                  }   
             }
            } else {
                for(int i=0; i<palabra3.length();i++){
            
                for(int m=0; m<palabra3.length();m++){
                  char letra1 = palabra1.charAt(i);
                  char letra3 = palabra3.charAt(m);
                  if (letra1 == letra3){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 3 en la letra " +letra1 +" del lugar numero " +(i+1));
                  }else{
                      System.out.println("");
                  }
                  }
                
                }
                }
                
                if(palabra1.length()>palabra4.length() || palabra1.length()==palabra4.length()){
                for(int i=0; i<palabra1.length();i++){
                  for(int m=0; m<palabra1.length();m++){
                  char letra1 = palabra1.charAt(m);
                  char letra4 = palabra4.charAt(i);
                  if (letra1 == letra4){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 4 en la letra " +letra1 +" del lugar numero " +(i+1));
                  }else{
                      System.out.println("");
                  }
                  }   
             }
            } else {
                for(int i=0; i<palabra4.length();i++){
            
                for(int m=0; m<palabra4.length();m++){
                  char letra1 = palabra1.charAt(i);
                  char letra4 = palabra4.charAt(m);
                  if (letra1 == letra4){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 4 en la letra " +letra1 +" del lugar numero " +(i+1));
                  }else{
                      System.out.println("");
                  }
                  }
                
                }
                }
                if(palabra1.length()>palabra5.length() || palabra1.length()==palabra5.length()){
                for(int i=0; i<palabra1.length();i++){
                  for(int m=0; m<palabra1.length();m++){
                  char letra1 = palabra1.charAt(m);
                  char letra5 = palabra5.charAt(i);
                  if (letra1 == letra5){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 5 en la letra " +letra1 +" del lugar numero " +(i+1));
                  }else{
                      System.out.println("");
                  }
                  }   
             }
            } else {
                for(int i=0; i<palabra5.length();i++){
            
                for(int m=0; m<palabra5.length();m++){
                  char letra1 = palabra1.charAt(i);
                  char letra5 = palabra5.charAt(m);
                  if (letra1 == letra5){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 5 en la letra " +letra1 +" del lugar numero " +(i+1));
                  }else{
                      System.out.println("");
                  }
                  }
                
                }
                }
                break;
            case("2"):
                int numeroapoyo4 = palabra1.length();
                int largopalabra1 [];
                largopalabra1 = new int[numeroapoyo4];
                
                int numeroapoyo5 = palabra2.length();
                int largopalabra2 [];
                largopalabra2 = new int[numeroapoyo5];
                
                int numeroapoyo8=palabra3.length();
                int largopalabra3 [];
                largopalabra3 = new int[numeroapoyo8];
                
                int numeroapoyo9=palabra4.length();
                int largopalabra4 [];
                largopalabra4 = new int[numeroapoyo9];
                
                int numeroapoyo10=palabra5.length();
                int largopalabra5 [];
                largopalabra5 = new int[numeroapoyo10];
                
                
                int numeroapoyo6= 0;
                int numeroapoyo7= 0;
                if(palabra1.length()>palabra2.length() || palabra1.length()==palabra2.length()){
                for(int a:largopalabra1 ){
                  for(int b: largopalabra2){
                  char letra1 = palabra1.charAt(numeroapoyo6);
                  char letra2 = palabra2.charAt(numeroapoyo7);
                  if (letra1 == letra2){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 2 en la letra " +letra1 +" del lugar numero " +(numeroapoyo7+1));
                  }else{
                      System.out.println("");
                  }
                  numeroapoyo6=numeroapoyo6+1;
                  }   
                  numeroapoyo7=numeroapoyo7+1;
             }
            } else {
                for(int b: largopalabra2){
            
                for(int a:largopalabra1){
                  char letra1 = palabra1.charAt(numeroapoyo7);
                  char letra2 = palabra2.charAt(numeroapoyo6);
                  if (letra1 == letra2){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 2 en la letra " +letra1 +" del lugar numero " +(numeroapoyo7+1));
                  }else{
                      System.out.println("");
                  }
                numeroapoyo6=numeroapoyo6+1;
                  }
                numeroapoyo7=numeroapoyo7+1;
                }
                }
                if(palabra1.length()>palabra2.length() || palabra1.length()==palabra3.length()){
                for(int a: largopalabra1){
                  for(int b: largopalabra3){
                  char letra1 = palabra1.charAt(numeroapoyo6);
                  char letra3 = palabra3.charAt(numeroapoyo7);
                  if (letra1 == letra3){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 3 en la letra " +letra1 +" del lugar numero " +(numeroapoyo7+1));
                  }else{
                      System.out.println("");
                  }
                  numeroapoyo6=numeroapoyo6+1;
                  }
                  numeroapoyo7=numeroapoyo7+1;
             }
            } else {
                for(int b: largopalabra3){
            
                for(int a: largopalabra1){
                  char letra1 = palabra1.charAt(numeroapoyo7);
                  char letra3 = palabra3.charAt(numeroapoyo6);
                  if (letra1 == letra3){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 3 en la letra " +letra1 +" del lugar numero " +(numeroapoyo7+1));
                  }else{
                      System.out.println("");
                  }
                  numeroapoyo6=numeroapoyo6+1;
                  }
                numeroapoyo7=numeroapoyo7+1;
                }
                }
                
                if(palabra1.length()>palabra4.length() || palabra1.length()==palabra4.length()){
                for(int a: largopalabra1){
                  for(int b: largopalabra4){
                  char letra1 = palabra1.charAt(numeroapoyo6);
                  char letra4 = palabra4.charAt(numeroapoyo7);
                  if (letra1 == letra4){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 4 en la letra " +letra1 +" del lugar numero " +(numeroapoyo7+1));
                  }else{
                      System.out.println("");
                  }
                  numeroapoyo6=numeroapoyo6+1;
                  } 
                  numeroapoyo7=numeroapoyo7+1;
             }
            } else {
                for(int b: largopalabra4){
            
                for(int a: largopalabra1){
                  char letra1 = palabra1.charAt(numeroapoyo7);
                  char letra4 = palabra4.charAt(numeroapoyo6);
                  if (letra1 == letra4){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 4 en la letra " +letra1 +" del lugar numero " +(numeroapoyo7+1));
                  }else{
                      System.out.println("");
                  }
                  numeroapoyo6=numeroapoyo6+1;
                  }
                numeroapoyo7=numeroapoyo7+1;
                }
                }
                if(palabra1.length()>palabra5.length() || palabra1.length()==palabra5.length()){
                for(int a: largopalabra1){
                  for(int b: largopalabra5){
                  char letra1 = palabra1.charAt(numeroapoyo6);
                  char letra5 = palabra5.charAt(numeroapoyo7);
                  if (letra1 == letra5){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 5 en la letra " +letra1 +" del lugar numero " +(numeroapoyo7+1));
                  }else{
                      System.out.println("");
                  }
                  numeroapoyo6=numeroapoyo6+1;
                  }
                  numeroapoyo6=numeroapoyo6+1;
             }
            } else {
                for(int b: largopalabra5){
            
                for(int a: largopalabra1){
                  char letra1 = palabra1.charAt(numeroapoyo7);
                  char letra5 = palabra5.charAt(numeroapoyo6);
                  if (letra1 == letra5){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 5 en la letra " +letra1 +" del lugar numero " +(numeroapoyo7+1));
                  }else{
                      System.out.println("");
                  }
                  numeroapoyo6=numeroapoyo6+1;
                  }
                numeroapoyo6=numeroapoyo6+1;
                }
                }
                
                
                
                
                
                break;
            case("3"):
                int w=0;
                int z=0;
                if(palabra1.length()>palabra2.length() || palabra1.length()==palabra2.length()){
                while(z<palabra1.length()){
                  while(w<palabra1.length()){
                  char letra1 = palabra1.charAt(w);
                  char letra2 = palabra2.charAt(z);
                  if (letra1 == letra2){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 2 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }
                  z++;
             }
            } else {
                while(z<palabra2.length()){
            
                while(w<palabra2.length()){
                  char letra1 = palabra1.charAt(z);
                  char letra2 = palabra2.charAt(w);
                  if (letra1 == letra2){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 2 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                 
                  w++;
                  }
                z++;
                }
                }
                if(palabra1.length()>palabra3.length() || palabra1.length()==palabra3.length()){
                while(z<palabra1.length()){
                  while(w<palabra1.length()){
                  char letra1 = palabra1.charAt(w);
                  char letra3 = palabra3.charAt(z);
                  if (letra1 == letra3){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 3 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }   
                  z++;
             }
            } else {
                while(z<palabra3.length() ){
            
                while(w<palabra3.length()){
                  char letra1 = palabra1.charAt(z);
                  char letra3 = palabra3.charAt(w);
                  if (letra1 == letra3){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 3 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }
                z++;
                }
                }
                
                if(palabra1.length()>palabra4.length() || palabra1.length()==palabra4.length()){
                while(z<palabra1.length()){
                  while(w<palabra1.length()){
                  char letra1 = palabra1.charAt(w);
                  char letra4 = palabra4.charAt(z);
                  if (letra1 == letra4){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 4 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  } 
                  z++;
             }
            } else {
                while(z<palabra4.length()){
            
                while(w<palabra4.length()){
                  char letra1 = palabra1.charAt(z);
                  char letra4 = palabra4.charAt(w);
                  if (letra1 == letra4){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 4 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }
                z++;
                }
                }
                if(palabra1.length()>palabra5.length() || palabra1.length()==palabra5.length()){
                while(z<palabra1.length()){
                  while(w<palabra1.length()){
                  char letra1 = palabra1.charAt(w);
                  char letra5 = palabra5.charAt(z);
                  if (letra1 == letra5){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 5 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }   
                  z++;
             }
            } else {
                while(z<palabra5.length()){
            
                while(w<palabra5.length()){
                  char letra1 = palabra1.charAt(z);
                  char letra5 = palabra5.charAt(w);
                  if (letra1 == letra5){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 5 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                   w++;
                  }
                z++;
                }
                }
            
            
                break;
        
            case("4"):
                
                 w=0;
                 z=0;
                if(palabra1.length()>palabra2.length() || palabra1.length()==palabra2.length()){
                do{
                  do{
                  char letra1 = palabra1.charAt(w);
                  char letra2 = palabra2.charAt(z);
                  if (letra1 == letra2){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 2 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }while(w<palabra1.length());
                  z++;
             }while(z<palabra1.length());
            } else {
                do{
            
                do{
                  char letra1 = palabra1.charAt(z);
                  char letra2 = palabra2.charAt(w);
                  if (letra1 == letra2){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 2 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }while(w<palabra2.length());
                z++;
                }while(z<palabra2.length());
                }
                if(palabra1.length()>palabra3.length() || palabra1.length()==palabra3.length()){
                do{
                  do{
                  char letra1 = palabra1.charAt(w);
                  char letra3 = palabra3.charAt(z);
                  if (letra1 == letra3){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 3 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  } while(w<palabra1.length());  
                  z++;
             }while(z<palabra1.length());
            } else {
                do{
            
                do{
                  char letra1 = palabra1.charAt(z);
                  char letra3 = palabra3.charAt(w);
                  if (letra1 == letra3){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 3 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }while(w<palabra3.length());  
                z++;
                }while(z<palabra3.length());
                }
                
                if(palabra1.length()>palabra4.length() || palabra1.length()==palabra4.length()){
                do{
                  do{
                  char letra1 = palabra1.charAt(w);
                  char letra4 = palabra4.charAt(z);
                  if (letra1 == letra4){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 4 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  } while(w<palabra1.length());
                  z++;
             }while(z<palabra1.length());
            } else {
                do{
            
                do{
                  char letra1 = palabra1.charAt(z);
                  char letra4 = palabra4.charAt(w);
                  if (letra1 == letra4){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 4 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }while(w<palabra4.length());
                z++;
                }while(z<palabra4.length());
                }
                if(palabra1.length()>palabra5.length() || palabra1.length()==palabra5.length()){
                do{
                  do{
                  char letra1 = palabra1.charAt(w);
                  char letra5 = palabra5.charAt(z);
                  if (letra1 == letra5){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 5 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                  w++;
                  }   while(w<palabra1.length());
                  z++;
             }while(z<palabra1.length());
            } else {
                do{
            
                do{
                  char letra1 = palabra1.charAt(z);
                  char letra5 = palabra5.charAt(w);
                  if (letra1 == letra5){
                  System.out.println("La palabra numero 1 se puede cruzar con la palabra numero 5 en la letra " +letra1 +" del lugar numero " +(w+1));
                  }else{
                      System.out.println("");
                  }
                   w++;
                  }while(w<palabra5.length());
                z++;
                }while(z<palabra5.length());
                }
                
                
                break;
            default:
            System.out.println("Seleccion una de las opciones validas");      
                break;
        }

         
        
        
        
    }
}
