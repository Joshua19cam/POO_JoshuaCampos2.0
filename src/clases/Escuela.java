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
public class Escuela {
    private String nombre;
    private String clave;
    private int alumnos;

    
    public Escuela(){
        nombre="Unknown";
        clave="Unknown";
        alumnos=0;
    }
    public Escuela(String nombre,String clave,int alumnos){
        this.nombre=nombre;
        this.clave=clave;
        this.alumnos=alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }
    
}
