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
public class DataStreamExample {  
public static void main(String args[])throws Exception{    
      
    File fin = new File("f1.txt");
    File fout = new File("out.txt");
    
    System.out.println(fin.exists());
    System.out.println(fout.exists());
    
    File f = new File("temp");
    f.mkdir();
    
      FileOutputStream fout1=new FileOutputStream(fin);    
      FileOutputStream fout2=new FileOutputStream(fout);    
        
    try {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);    
        
        bout.flush();
        bout.close();
    }catch(IOException  e){
            System.out.println(e);
    }
    System.out.println("Success...");    
    }    
}   