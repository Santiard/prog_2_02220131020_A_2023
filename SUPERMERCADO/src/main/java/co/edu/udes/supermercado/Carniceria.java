/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado;

/**
 *
 * @author molin
 */
public class Carniceria {
    private int amount_meat;
    private int amount_chicken;
    private double price;
    public Carniceria(int amount_meat, int amount_chicken, double price) {
        this.amount_meat = amount_meat;
        this.amount_chicken = amount_chicken;
        this.price = price;
    }
    public int getAmount_meat() {
        return amount_meat;
    }

    public void setAmount_meat(int amount_meat) {
        this.amount_meat = amount_meat;
    }

    public int getAmount_chicken() {
        return amount_chicken;
    }

    public void setAmount_chicken(int amount_chicken) {
        this.amount_chicken = amount_chicken;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
