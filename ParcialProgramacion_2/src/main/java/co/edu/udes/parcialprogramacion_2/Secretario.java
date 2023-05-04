/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcialprogramacion_2;

/**
 *
 * @author ARDILA
 */
public class Secretario extends Empleado {

    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String apellido, int DNI, String direccion, int telefono, double salario, String despacho, String numeroFax) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Salario: " + this.salario);
        System.out.println("Puesto: Secretario");
        System.out.println("Despacho: " + this.despacho);
        System.out.println("Número de fax: " + this.numeroFax);
    }

    public void incrementarSalario() {
        double incremento = this.salario * 0.05;
        this.salario += incremento;
    }

    

}
