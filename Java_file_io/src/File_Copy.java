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

public class File_Copy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try
    {  
      FileReader fr = new FileReader("F:\\Veerayatan\\BCA-5\\JAVA\\Java_work\\Java_Program\\Java_file_io\\src\\input.txt");
      FileWriter fw = new FileWriter("F:\\Veerayatan\\BCA-5\\JAVA\\Java_work\\Java_Program\\Java_file_io\\src\\output.txt");
     
      int k;
      while( ( k = fr.read() ) != -1 )
      {
        fw.write(k);   		
        System.out.print((char) k);  
      }
      fw.close();
      fr.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File does not exist. " + e);
    }
    catch(IOException e)
    {
      System.out.println("Some I/O problem. " + e);
    }
    }
    
}
