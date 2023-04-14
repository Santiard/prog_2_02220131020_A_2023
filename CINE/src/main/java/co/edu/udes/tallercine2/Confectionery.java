/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.tallercine2;

/**
 *
 * @author ARDILA
 */
public class Confectionery {
    private double price;
    private String product;
    
    public Confectionery() {
    }

    public Confectionery(double price, String product) {
        this.price = price;
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Confectionery{" + "Precio=" + price + ", producto=" + product + '}';
    }
}
