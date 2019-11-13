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
public class Figura {
    private int lados ;
    private String nombre;
    
    public Figura(){
        lados=0;
        nombre="Unknown";
    }
    public Figura(int lados,String nombre){
        this.lados=lados;
        this.nombre=nombre;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
