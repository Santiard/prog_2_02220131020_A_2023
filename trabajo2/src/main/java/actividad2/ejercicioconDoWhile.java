
package actividad2;

import java.util.Scanner;

public class ejercicioconDoWhile {
   
    
    public  static void main(String[] args) {

         
    Scanner lectura = new Scanner(System.in);

        String palabra;
        String palabraAlrevez;
        palabraAlrevez="";
        int indice=0;
        System.out.println("Introduce una palabra: ");
        palabra = lectura.nextLine();

       do{
            palabraAlrevez = palabraAlrevez + palabra.charAt(palabra.length() - indice - 1);
            indice++;
        }while (indice< palabra.length());

        System.out.println("La palabra al reves es: " + palabraAlrevez);
    }
    
    
    
}
