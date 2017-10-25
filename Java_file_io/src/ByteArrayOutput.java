
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth Joshi
 */
public class ByteArrayOutput {
public static void main(String args[])throws Exception{    
      FileOutputStream fout1=new FileOutputStream("f1.txt");    
      FileOutputStream fout2=new FileOutputStream("f2.txt");    
        
    try {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
  
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);    
        
        bout.flush();
        bout.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    
      System.out.println("Success...");    
     }    
    } 