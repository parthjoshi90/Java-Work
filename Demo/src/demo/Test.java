/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Parth Joshi
 */
public class Test {
    
    public static void display(int[] in){
        for(int i =0;i<in.length;i++)
            System.out.println(in[i]);
    }
    public static int[] reverse(int[] in){
        int[] rev = new int[in.length];
        for(int i=0,j=rev.length-1;i<in.length;i++,j--){
            rev[j] = in[i];
        }
        return rev; 
    }
    
}
