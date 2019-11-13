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
public class Caja {
    private int largo;
    private int ancho;
    private int profundidad;

    
    public Caja(){
        largo=0;
        ancho=0;
        profundidad=0;
    }
    public Caja(int largo,int ancho,int profundidad){
        this.largo=largo;
        this.ancho=ancho;
        this.profundidad=profundidad;
}

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    
}