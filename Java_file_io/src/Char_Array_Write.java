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
public class Char_Array_Write {
    public static void main(String[] args)throws Exception{    
          CharArrayWriter out=new CharArrayWriter();    
          out.write("Welcome to the World of Java");    
          FileWriter f1=new FileWriter("a.txt");    
          FileWriter f2=new FileWriter("b.txt");    
          FileWriter f3=new FileWriter("c.txt");    
          FileWriter f4=new FileWriter("d.txt");    
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
          out.writeTo(f4);    
          f1.close();    
          f2.close();    
          f3.close();    
          f4.close();    
          System.out.println("Success...");    
         }    
        }