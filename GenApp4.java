/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodGeneric;

/**
 *
 * @author Win 10
 */
public class GenApp4 <C> {
    private C type;
    
    public C getType() {
        return type;
        
    }
    
    public void setType (C type) {
        this.type = type;
    }
 
    private static <A> void OO (A freeParType){
        System.out.println(freeParType);
    }
    
    private static <B> void OOP (){
        System.out.println();
    }
    
    public static void main (String [] args){
        OO(23);
    }
}