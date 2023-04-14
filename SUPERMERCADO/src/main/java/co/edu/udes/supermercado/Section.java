/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado;

/**
 *
 * @author ARDILA
 */
public class Section {
    private String name;
    private Producto product;
    private int amount_product;

    public Section() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    public int getAmount_product() {
        return amount_product;
    }

    public void setAmount_product(int amount_product) {
        this.amount_product = amount_product;
    }

    public Section(String name, Producto product, int amount_product) {
        this.name = name;
        this.product = product;
        this.amount_product = amount_product;
    }
    
}
