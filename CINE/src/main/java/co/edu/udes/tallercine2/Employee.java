/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.tallercine2;

/**
 *
 * @author ROZO
 */
public class Employee {
    private String name;
    private String id;
    private double salary;
    private String works_area;

    public Employee() {
    }

    public Employee(String name, String id, double salary, String works_area) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.works_area = works_area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorks_area() {
        return works_area;
    }

    public void setWorks_area(String works_area) {
        this.works_area = works_area;
    }

    @Override
    public String toString() {
        return "Employee{" + "Nombre=" + name + ", id=" + id + ", Salario=" + salary + ", Area de trabajo=" + works_area + '}';
    }

}
