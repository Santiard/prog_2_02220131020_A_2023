/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado;

/**
 *
 * @author molin
 */
public class Producto {
    private int id;
    private String name;
    private double price;
    
    private String tipe_product;

    public Producto() {
    }

    public Producto(int id, String name, double price, String tipe_product) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tipe_product = tipe_product;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

  

    public String getTipe_product() {
        return tipe_product;
    }

    public void setTipe_product(String tipe_product) {
        this.tipe_product = tipe_product;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", name=" + name + ", price=" + price + ", tipe_product=" + tipe_product + '}';
    }
   

   
    
    
}
