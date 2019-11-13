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
public class PC {
    private String procesador;
    private int ram;
    private int HDD;
    private String tarjeta_madre;
    private int fuente_power;
    

    public PC() {
      procesador="Desconocido";
      ram=0;
      HDD=0;
      tarjeta_madre="Desconocido";
      fuente_power=0;
    }

    public PC(String procesador, int ram, int HDD, String tarjeta_madre, int fuente_power) {
        this.procesador = procesador;
        this.ram = ram;
        this.HDD = HDD;
        this.tarjeta_madre = tarjeta_madre;
        this.fuente_power = fuente_power;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    public int getHDD() {
        return HDD;
    }

    public String getTarjeta_madre() {
        return tarjeta_madre;
    }

    public int getFuente_power() {
        return fuente_power;
    }
    public void mostar_c(){
        System.out.println("\nLos componentes son: "+"\nProcesador: "+getProcesador()+
        "\nRam: "+getRam()+"\nHDD: "+getHDD()+"\nTarjeta madre: "+getTarjeta_madre()+
        "\nFuente de poder: "+getFuente_power());
    }
    
}
