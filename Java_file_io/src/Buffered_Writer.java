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
public class Buffered_Writer {
    public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("output.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to the world of Java");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  

