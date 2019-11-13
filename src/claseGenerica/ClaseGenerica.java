/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseGenerica;

/**
 *
 * @author Joshua C.H
 */
public class ClaseGenerica<H> {
    H obj;
    
    public ClaseGenerica(H o){
        this.obj = o;
    }
    
    public void classType(){
        System.out.println("El objeto g es de tipo: "+obj.getClass().getName());
    }
    
    public static void main(String[] args){
        ClaseGenerica<Integer> intObj = new ClaseGenerica<>(8);
        intObj.classType();
        
        ClaseGenerica<String> strObj = new ClaseGenerica<>("Hola");
        strObj.classType();
    }
}
