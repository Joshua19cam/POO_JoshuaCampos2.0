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
public class Procesador {
    private String marca;
    private String modelo;
    private int nucleos;

    
    public Procesador(){
        marca="Unknown";
        modelo="Unknown";
        nucleos=0;
    }
    public Procesador(String marca,String modelo,int nucleos){
        this.marca=marca;
        this.modelo=modelo;
        this.nucleos=nucleos;
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

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
    
}
