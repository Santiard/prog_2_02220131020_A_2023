/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.supermercado;

/**
 *
 * @author ARDILA
 */
public class customer extends Person {
    private String cell_number;
    private String mail;
    private String cellphone;

    public customer(String cell_number, String mail, String cellphone, int id) {
        this.cell_number = cell_number;
        this.mail = mail;
        this.cellphone = cellphone;
    }

    public customer(String cell_number, String mail, String cellphone) {
        this.cell_number = cell_number;
        this.mail = mail;
        this.cellphone = cellphone;
    }

    public String getCell_number() {
        return cell_number;
    }

    public void setCell_number(String cell_number) {
        this.cell_number = cell_number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "customer{" + "cell_number=" + cell_number + ", mail=" + mail + ", cellphone=" + cellphone + '}';
    }
    
    
    
    
    
}
