/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statico;

/**
 *
 * @author Joshua C.H
 */
public class MainStatic {
    
    static int contador=0;
    
    public MainStatic(){
        contador++;
    }
    
    public static void main(String[] args){
        MainStatic obj1 = new MainStatic();
        MainStatic obj2 = new MainStatic();
        MainStatic obj3 = new MainStatic();
        MainStatic obj4 = new MainStatic();
        System.out.println("Contador:"+contador);
        
    }
}
