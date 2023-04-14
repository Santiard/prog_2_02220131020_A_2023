/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado;

/**
 *
 * @author ARDILA
 */
public class CleaningProducts {
    private Section sectionCleaning;
    private Producto product;
    private Producto tipe_Product;
    private Producto price;

    public CleaningProducts(Section sectionCleaning, Producto product, Producto tipe_Product, Producto price) {
        this.sectionCleaning = sectionCleaning;
        this.product = product;
        this.tipe_Product = tipe_Product;
        this.price = price;
    }

    public Section getSectionCleaning() {
        return sectionCleaning;
    }

    public void setSectionCleaning(Section sectionCleaning) {
        this.sectionCleaning = sectionCleaning;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    public Producto getTipe_Product() {
        return tipe_Product;
    }

    public void setTipe_Product(Producto tipe_Product) {
        this.tipe_Product = tipe_Product;
    }

    public Producto getPrice() {
        return price;
    }

    public void setPrice(Producto price) {
        this.price = price;
    }

   
    
}
