package herencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*import clases.PC;
import clases.PCGamer;*/

/**
 *
 * @author Joshua C.H
 */
public class HerenciaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    PCGamer two= new PCGamer("GTX 2080", "Liquido", "Rojo", "I9", 32, 1000, "Asus", 600);
    PC uno= new PC();
    
    
    two.mostrar();
    uno.mostar_c();
    }
    
}
