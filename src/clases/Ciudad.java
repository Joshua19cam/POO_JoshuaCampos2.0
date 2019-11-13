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
public class Ciudad {
    private String nombre;
    private String estado;
    private int poblacion;

    
    public Ciudad(){
        nombre="Unknown";
        estado="Unknown";
        poblacion=0;
    }
    public Ciudad(String nombre,String estado,int poblacion){
        this.nombre=nombre;
        this.estado=estado;
        this.poblacion=poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
}
