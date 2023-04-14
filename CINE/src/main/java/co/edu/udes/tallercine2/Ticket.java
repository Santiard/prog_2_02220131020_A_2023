/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.tallercine2;

/**
 *
 * @author ROZO
 */
public class Ticket {

    private String movie;
    private double price;
    private int hall;
    private String seat;

    public Ticket() {
    }

    public Ticket(String movie, double price, String seat, int hall) {
        this.movie = movie;
        this.price = price;
        this.hall = hall;
        this.seat = seat;
    }

 
  

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHall() {
        return hall;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Ticket{" + "pelicula=" + movie + ", precio=" + price + ", sala=" + hall + ", Asiento=" + seat + '}';
    }

}
