/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.tallercine2;

/**
 *
 * @author ROZO
 */
public class Customer {
      private String name;
    private String id;
    private String cell_number;

    public Customer() {
    }

    public Customer(String name, String id, String cell_number) {
        this.name = name;
        this.id = id;
        this.cell_number = cell_number;
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

    public String getCell_number() {
        return cell_number;
    }

    public void setCell_number(String cell_number) {
        this.cell_number = cell_number;
    }

    @Override
    public String toString() {
        return "Customer{" + "Nombre=" + name + ", id=" + id + ", Numero de telefono=" + cell_number + '}';
    }
}
