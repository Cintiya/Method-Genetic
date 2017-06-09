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
public class GenApp3 {
       private static <T, N> void printArray(T[]a, N[] b)
    {
        for (Object o : a){
            System.out.println(o);
        }
        
        for (Object p : b){
            System.out.println(p);
        }
    }
     public static void main (String []args){
         Character cArr[] = new Character[3];
         cArr[0] = '4';
         cArr[1] = '2';
         cArr[2] = '5';
         String sArr[] = new String[3];
         sArr[0] = "Sepuluh";
         sArr[1] = "Dua Puluh";
         sArr[2] = "Tiga Puluh";
         printArray(cArr,sArr);
     }
        
        
         
    
}
