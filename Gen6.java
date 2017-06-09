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
public interface Gen6 {
    public static <T> void printArray(T[] a)
    {
	for (Object o : a) {
		System.out.println(o);
	}
    }
}
    
    
