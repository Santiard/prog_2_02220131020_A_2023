/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcialprogramacion_2;

import java.util.ArrayList;

/**
 *
 * @author ARDILA
 */
public class Vendedor extends Empleado {
     private Coche coche;
    private String areaVenta;
    private ArrayList<String> listaClientes;
    private double comision;
    
    public Vendedor(String nombre, String apellido, int DNI, String direccion, int telefono, double salario, Coche coche, String areaVenta, double comision) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.coche = coche;
        this.areaVenta = areaVenta;
        this.listaClientes = new ArrayList<String>();
        this.comision = comision;
    }
    
    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public ArrayList<String> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<String> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    // Métodos getters y setters
    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carro " + coche.toString() + ", Area de Venta: " + areaVenta;
    }
    
    public void darDeAltaCliente(String cliente) {
        listaClientes.add(cliente);
    }
    
    public void darDeBajaCliente(String cliente) {
        listaClientes.remove(cliente);
    }
    
    public void cambiarCoche(Coche coche) {
        this.coche = coche;
    }
    
    @Override
    public void incrementarSalario(double incremento) {
        super.incrementarSalario(incremento * 1.1); 
    }
    public void imprimir() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("DNI: " + getDNI());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Carro: "+ getCoche());
        System.out.println("Salario: "+getSalario());
        System.out.println("Puesto en la empresa: Vendedor");
    }
}
