/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Joshua C.H
 */
public class Cama {
    private String marca;
    private String tamaño;
    private String color;

    
    public Cama(){
        marca="Unknown";
        tamaño="Unknown";
        color="Unknown";
    }
    public Cama(String marca,String tamaño,String color){
        this.marca=marca;
        this.tamaño=tamaño;
        this.color=color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
