
import java.io.ByteArrayInputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth Joshi
 */
public class ByteArrayInput {
  public static void main(String[] args) throws IOException {  
    byte[] buf = { 35, 36, 37, 38 };  
    ByteArrayInputStream byt = new ByteArrayInputStream(buf);
    int k = 0;
    while ((k = byt.read()) != -1) {
        
        char ch = (char) k;
        System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
    }
  }
  }  