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
public class Usuario {
    private String nombre;
    private String correo;
    private String clave;

    
    public Usuario(){
        nombre="Unknown";
        correo="Unknown";
        clave="Unknown";
    }
    public Usuario(String nombre,String correo,String clave){
        this.nombre=nombre;
        this.correo=correo;
        this.clave=clave;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
