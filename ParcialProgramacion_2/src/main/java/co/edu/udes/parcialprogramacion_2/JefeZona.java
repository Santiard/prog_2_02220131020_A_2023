/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcialprogramacion_2;

import java.util.*;

/**
 *
 * @author ARDILA
 */
public class JefeZona extends Empleado {

    private Secretario secretario;
    private Coche coche;
    private List<Vendedor> vendedores;

    public JefeZona(Secretario secretario, Coche coche, List<Vendedor> vendedores, String nombre, String apellido, int DNI, String direccion, int telefono, double salario) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.secretario = secretario;
        this.coche = coche;
        this.vendedores = vendedores;
    }

    
    public void cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void cambiarCoche(Coche coche) {
        this.coche = coche;
    }

    public void darAltaVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
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

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void darBajaVendedor(Vendedor vendedor) {
        this.vendedores.remove(vendedor);
    }

    @Override
    public String toString() {
        return super.toString() + ", Puesto: Jefe de Zona";
    }

    public void incrementarSalario() {
    double incremento = super.getSalario() * 0.2;
    super.setSalario(super.getSalario() + incremento);
}

    public void imprimir() {
        System.out.println("Datos Personales:");
        System.out.println(toString());
        System.out.println("Puesto en la empresa: Jefe de Zona");
        System.out.println("Secretario a cargo:");
        if (secretario != null) {
            System.out.println(secretario.toString());
        } else {
            System.out.println("No tiene secretario asignado.");
        }
        System.out.println("Carro asignado:");
        if (coche != null) {
            System.out.println(coche.toString());
        } else {
            System.out.println("No tiene carro asignado.");
        }
        System.out.println("Lista de vendedores a cargo:");
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor.toString());
        }
    }
}
