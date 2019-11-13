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
public class Tennis {
    private String marca;
    private String modelo;
    private int talla;

    
    public Tennis(){
        marca="Unknown";
        modelo="Unknown";
        talla=0;
    }
    public Tennis(String marca,String modelo,int talla){
        this.marca=marca;
        this.modelo=modelo;
        this.talla=talla;
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

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
}
