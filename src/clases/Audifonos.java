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
public class Audifonos {
    private String marca;
    private int precio;
    private String modelo;

    
    public Audifonos(){
        marca="Unknown";
        precio=0;
        modelo="Unknown";
    }
    public Audifonos(String marca,int precio,String modelo){
        this.marca=marca;
        this.precio=precio;
        this.modelo=modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
