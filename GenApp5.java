/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodGenetic;

/**
 *
 * @author Win 10
 */
public class GenApp5 {
    String kelas;
    
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String nm){
     this.kelas= kelas;   
    
    }
 
    private static <T> void GenApp5 (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        GenApp5 gen = new GenApp5();
        
        gen.setKelas(" Teknik Informatika Reguler 14 A");
        System.out.println(gen.getKelas());
        GenApp5("Teknik Informatika Reguler 14 B");
        
    }
}
