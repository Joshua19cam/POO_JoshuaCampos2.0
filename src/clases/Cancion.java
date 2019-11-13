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
public class Cancion {
    private String genero;
    private String artista;
    private int epoca;

    
    public Cancion(){
        genero="Unknown";
        artista="Unknown";
        epoca=0;
    }
    public Cancion(String genero,String artista,int epoca){
        this.genero=genero;
        this.artista=artista;
        this.epoca=epoca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getEpoca() {
        return epoca;
    }

    public void setEpoca(int epoca) {
        this.epoca = epoca;
    }
    
}
