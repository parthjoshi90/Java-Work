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
public class File_Writer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){          
        try{    
           FileWriter fw=new FileWriter("file_write.txt");    
           fw.write("Welcome to the world of Java.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  
    

