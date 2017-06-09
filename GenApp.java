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
public class GenApp {
    
    private static <T> void printArray(T[] a)
    {
        for (Object o : a){
            System.out.println(o);
        }
    }
     public static void main (String []args){
         Integer iArr[] = new Integer[3];
         iArr[0] = 10;
         iArr[1] = 20;
         iArr[2] = 30;
         printArray(iArr);
         
         String sArr[] = new String[3];
         sArr[0] = "Sepuluh";
         sArr[1] = "Dua Puluh";
         sArr[2] ="Tiga Puluh";
         printArray(sArr);
         
         Double dArr[] = new Double[3];
         dArr[0] = 4.2;
         dArr[1] = 7.9;
         dArr[2] = 4.5;
         printArray(dArr);
         
         Character cArr[] = new Character[3];
         cArr[0] = '4';
         cArr[1] = '2';
         cArr[2] = '5';
         printArray(cArr);
         
         
         
     }
}

