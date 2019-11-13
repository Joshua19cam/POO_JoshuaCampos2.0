/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaGe;

/**
 *
 * @author Joshua C.H
 */
public class PruebaG <A> {
    
    A atrib;
    
    public PruebaG(A r){
        atrib=r;
       // atrib2=t;
    }
    public void Mdemostrar(){
        System.out.println("El tipo de dato es :"+atrib.getClass());
       // System.out.println("El tipo de dato es :"+atrib2.getClass());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaG<String> s= new PruebaG<String>("Hi");
        s.Mdemostrar();
        PruebaG<Integer> d= new PruebaG<Integer>(2);
        d.Mdemostrar();
        
    }
    
}
