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
public class Sabritas {
    private String nombre;
    private String sabor;
    private int porcion;

    
    public Sabritas(){
        nombre="Unknown";
        sabor="Unknown";
        porcion=0;
    }
    public Sabritas(String nombre,String sabor,int porcion){
        this.nombre=nombre;
        this.sabor=sabor;
        this.porcion=porcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getPorcion() {
        return porcion;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }
    
}
