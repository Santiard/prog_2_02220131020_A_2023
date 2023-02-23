
package actividad2;

import java.util.Scanner;

public class ejercicioconFor {
    
    public  static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        String palabra;
        String palabraAlrevez;
        palabraAlrevez="";

        System.out.println("Introduce una palabra: ");
        palabra = lectura.nextLine();

        for (int dato = 0; dato < palabra.length(); dato++) {
            palabraAlrevez = palabraAlrevez + palabra.charAt(palabra.length() - dato - 1);

        }

        System.out.println("La palabra al reves es: " + palabraAlrevez);
    }
    
    
}
