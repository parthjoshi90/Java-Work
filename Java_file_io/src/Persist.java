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

class Persist{  
 public static void main(String args[])throws Exception{  
     
     File fout1 = new File("output.dat");
     Student s1 =new Student(211,"parth");  
     
 //  String s = new String("Hello world");
  
  FileOutputStream fout=new FileOutputStream(fout1);  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  
