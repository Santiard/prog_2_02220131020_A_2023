/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado;

/**
 *
 * @author molin
 */
public class supplier {
    private String name;
    private Producto tipe_product;
    private double price;

    public supplier() {
    }

    public supplier(String name, Producto tipe_product, double price) {
        this.name = name;
        this.tipe_product = tipe_product;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producto getTipe_product() {
        return tipe_product;
    }

    public void setTipe_product(Producto tipe_product) {
        this.tipe_product = tipe_product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
