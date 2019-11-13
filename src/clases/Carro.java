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
public class Carro {
    private String fabricante;
    private String modelo;
    private int cilindros;

    
    public Carro(){
        fabricante="Unknown";
        modelo="Unknown";
        cilindros=0;
    }
    public Carro(String fabricante,String modelo,int cilindros){
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.cilindros=cilindros;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    
}
