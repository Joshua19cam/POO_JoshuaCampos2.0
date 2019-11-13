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
public class Perro {
    private String nombre;
    private String raza;
    private String sexo;
    private int edad;
    private String color;
    
    public Perro(){
        nombre="Unknown";
        raza="Unknown";
        sexo="Unknown";
        edad=0;
        color="Unknown";
    }
    public Perro(String nombre,String raza,String sexo,int edad,String color){
        this.nombre=nombre;
        this.raza=raza;
        this.sexo=sexo;
        this.edad=edad;
        this.color=color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
