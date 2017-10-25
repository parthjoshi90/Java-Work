/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth Joshi
 */
import java.io.*;
public class Character_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    char[] ary = { 'j', 'a', 'v', 'a', ' ' , 'w', 'o', 'r', 'l', 'd'};  
    CharArrayReader reader = new CharArrayReader(ary);  
    int k = 0;  
    try{
    while ((k = reader.read()) != -1) {  
      char ch = (char) k;  
      System.out.print(ch + " : ");  
      System.out.println(k);  
    }  
    }catch(IOException e){
        e.printStackTrace();
    }
  }  
}
