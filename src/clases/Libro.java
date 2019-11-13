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
public class Libro {
    private String nombre;
    private String autor;
    private int paginas;

    
    public Libro(){
        nombre="Unknown";
        autor="Unknown";
        paginas=0;
    }
    public Libro(String nombre,String autor,int pag){
        this.nombre=nombre;
        this.autor=autor;
        this.paginas=pag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
}
