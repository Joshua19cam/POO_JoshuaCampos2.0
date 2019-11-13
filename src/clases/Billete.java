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
public class Billete {
    private int cantidad;
    private String color;
    private String personaje;

    
    public Billete(){
        cantidad=0;
        color="Unknown";
        personaje="Unknown";
    }
    public Billete(int cantidad,String color,String personaje){
        this.cantidad=cantidad;
        this.color=color;
        this.personaje=personaje;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
    
}
