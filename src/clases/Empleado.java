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
public class Empleado {
    private String nombre;
    private String clave;
    private int salario;

    
    public Empleado(){
        nombre="Unknown";
        clave="Unknown";
        salario=0;
    }
    public Empleado(String nombre,String clave,int salario){
        this.nombre=nombre;
        this.clave=clave;
        this.salario=salario;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
