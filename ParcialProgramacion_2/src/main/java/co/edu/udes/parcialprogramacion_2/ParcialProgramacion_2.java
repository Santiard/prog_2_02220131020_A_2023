/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.udes.parcialprogramacion_2;

import java.util.List;
import java.util.*;

/**
 *
 * @author ARDILA
 */
public class ParcialProgramacion_2 {

    public static void main(String[] args) {
        Secretario secretario1 = new Secretario("Luis", "Meza", 1092526647, "Zulima", 213312312, 1000000, "Despacho 1", "5434");
        Secretario secretario2 = new Secretario("Emmanuel", "Riaño", 888216581, "Prados del Este", 92181201, 2500, "Despacho 2", "4244");

        Coche carro1 = new Coche("KRK-6176", "CHEVROLET", "CAPTIVA");
        Coche carro2 = new Coche("HMT 298", "CHEVROLET", "TRACKER");
        Coche carr03 = new Coche("LIU 566 ", "RENAULT", "LOGAN");
        Vendedor vendedor1 = new Vendedor("JESUS", "ARDILA", 60258668, "San luis", 04144563112, 100000, carr03, "Zona 1", 20);
        Vendedor vendedor2 = new Vendedor("JUAN", "GOMEZ", 100492466, "Los patios", 213213213, 350023, carro1, "Zona 2", 15);

        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor2);

        JefeZona jz1 = new JefeZona(secretario2, carro2, vendedores, "Nicolas", "Maduros", 01010123, "CAPITOLIO-PINTOSALINA", 23131, 92191);

        System.out.println("ESTE PROGRAMA TRABAJA SIN INGRESO DE DATOS");
        System.out.println("DATOS DE LOS EMPLEADOS INSCRITOS:");
        System.out.println("--------------------------------------------------");
        System.out.println("DATOS DE LOS SECRETARIOS: \n");
        secretario1.imprimir();
        System.out.println("--------------------------------------------------");
        secretario2.imprimir();
        System.out.println("--------------------------------------------------");
        System.out.println("DATOS DE LOS VENDEDORES: \n");
        vendedor1.imprimir();
        System.out.println("--------------------------------------------------");
        vendedor2.imprimir();
        System.out.println("--------------------------------------------------");
        System.out.println("DATOS DEL JEFE DE ZONA: \n");
        jz1.imprimir();
        System.out.println("--------------------------------------------------");

        System.out.println("SE CAMBIA EL CARRO A: " + vendedor1.getNombre() + ":");
        vendedor1.cambiarCoche(carro2);
        System.out.println("NUEVO CARRO DE " + vendedor1.getNombre() + ": " + vendedor1.getCoche().getMatricula() + " " + vendedor1.getCoche().getMarca() + " " + vendedor1.getCoche().getModelo());
        
        System.out.println("SE CAMBIA EL CARRO A: "+ jz1.getNombre()+ ":");
        jz1.cambiarCoche(carr03);
        System.out.println("NUEVO CARRO DE: "+jz1.getNombre()+":"+ jz1.getCoche().getMatricula()+" "+jz1.getCoche().getMarca()+" "+jz1.getCoche().getModelo());
        
        System.out.println("SE CAMBIA EL SUPERVISOR ASIGNADO A: " + vendedor1.getNombre() + ":");
        vendedor1.cambiarSupervisor(secretario2);
        System.out.println("NUEVO SUPERVISOR: " + vendedor1 + ": " + vendedor1.getSupervisor().getNombre());
        System.out.println("--------------------------------------------------");

        
        System.out.println("AUMENTOS DE SALARIOS: ");
        secretario1.incrementarSalario(100);
        vendedor2.incrementarSalario(200);
        jz1.incrementarSalario(400);
        System.out.println("--------------------------------------------------");

        System.out.println("DATOS DE LOS EMPLEADOS ACTUALIZADOS:");
        System.out.println("--------------------------------------------------");
        secretario1.imprimir();
        System.out.println("--------------------------------------------------");
        vendedor2.imprimir();
        System.out.println("--------------------------------------------------");
        jz1.imprimir();
        System.out.println("--------------------------------------------------");

        

        

    }
}
