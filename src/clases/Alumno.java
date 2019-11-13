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
public class Alumno {
    private String nombre;
    private double boleta;
    private String carrera;

    
    public Alumno(){
        nombre="Unknown";
        boleta=0000000000;
        carrera="Unknown";
    }
    public Alumno(String nombre,double boleta,String carrera){
        this.nombre=nombre;
        this.boleta=boleta;
        this.carrera=carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBoleta() {
        return boleta;
    }

    public void setBoleta(double boleta) {
        this.boleta = boleta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
