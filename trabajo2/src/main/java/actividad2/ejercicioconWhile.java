
package actividad2;

import java.util.Scanner;

public class ejercicioconWhile {
    
    public  static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        String palabra;
        String palabraAlrevez;
        palabraAlrevez="";
        int indice=0;
        System.out.println("Introduce una palabra: ");
        palabra = lectura.nextLine();

        while (indice< palabra.length()) {
            palabraAlrevez = palabraAlrevez + palabra.charAt(palabra.length() - indice - 1);
            indice++;
        }

        System.out.println("La palabra al reves es: " + palabraAlrevez);
    }
    
}
