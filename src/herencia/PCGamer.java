/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Joshua C.H 
 */
public class PCGamer extends PC{
    private String tarjeta_video;
    private String enfriamiento;
    private String RGB;

    public PCGamer() {
        tarjeta_video="Desconocida";
        enfriamiento="Desconocido";
        RGB="Desconocido";
    }
    
    public PCGamer(String tarjeta_video, String enfriamiento, String RGB, String procesador, int ram, int HDD, String tarjeta_madre, int fuente_power) {
        super(procesador, ram, HDD, tarjeta_madre, fuente_power);
        this.tarjeta_video = tarjeta_video;
        this.enfriamiento = enfriamiento;
        this.RGB = RGB;
    }

    public String getTarjeta_video() {
        return tarjeta_video;
    }

    public String getEnfriamiento() {
        return enfriamiento;
    }

    public String getRGB() {
        return RGB;
    }
    
    public void mostrar(){
        System.out.println("\nLos componentes son: "+"\nProcesador: "+getProcesador()+
        "\nRam: "+getRam()+"\nHDD: "+getHDD()+"\nTarjeta madre: "+getTarjeta_madre()+
        "\nFuente de poder: "+getFuente_power()+"\nTarjeta de video: "+tarjeta_video+
        "\nEnfriaminto: "+enfriamiento+"\nRGB: "+RGB);        
    }

}
