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
public class Camisa {
    private String marca;
    private int precio;
    private String talla;

    
    public Camisa(){
        marca="Unknown";
        precio=0;
        talla="Unknown";
    }
    public Camisa(String marca,int precio,String talla){
        this.marca=marca;
        this.precio=precio;
        this.talla=talla;
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
}
