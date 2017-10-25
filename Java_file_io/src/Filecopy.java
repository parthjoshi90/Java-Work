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
public class Filecopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException 
        { 
              FileInputStream fread =new FileInputStream("F:\\Veerayatan\\BCA-5\\JAVA\\Java_work\\Java_Program\\Java_file_io\\src\\input.txt"); 
              FileOutputStream fwrite=new FileOutputStream("F:\\Veerayatan\\BCA-5\\JAVA\\Java_work\\Java_Program\\Java_file_io\\src\\output.txt") ; 
               
              int c; 
              while((c=fread.read())!=-1) 
              fwrite.write((char)c); 
              fread.close(); 
              fwrite.close();
              System.out.println("File is Copied");
         } 
}
