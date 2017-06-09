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
public class GenApp2 <B> {
    private B type;
    
    public B getType() {
        return type;
        
    }
    
    public void setType (B type) {
        this.type = type;
    }
    
    private static <A,B> void anythingYouWanted(A freeParType, B freeTwo) {
        System.out.println(freeParType);
        System.out.println(freeTwo);
    }
    public static void main (String[]Args) {
        anythingYouWanted(23,"Cintiya");
    }
}
