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
public class Celular {
    private String marca;
    private String modelo;
    private int precio;

    
    public Celular(){
        marca="Unknown";
        modelo="Unknown";
        precio=0;
    }
    public Celular(String marca,String modelo,int precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
