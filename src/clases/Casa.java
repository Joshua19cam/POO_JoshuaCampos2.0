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
public class Casa {
    private int cuartos;
    private int ventanas;
    private int puertas;

    
    public Casa(){
        cuartos=0;
        ventanas=0;
        puertas=0;
    }
    public Casa(int cuartos, int ventanas, int puertas){
        this.cuartos=cuartos;
        this.ventanas=ventanas;
        this.puertas=puertas;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
}
