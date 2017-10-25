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
public class Random_file {
   public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("books.dat", "rw");

            String books[] = new String[5];
            books[0] = "Professional JSP";
            books[1] = "The Java Application Programming Interface";
            books[2] = "Java Security";
            books[3] = "Java Security Handbook";
            books[4] = "Hacking Exposed J2EE & Java";
            for (int i = 0; i < books.length; i++) {
                raf.writeUTF(books[i]);
            }
            raf.seek(raf.length());
            raf.writeUTF("Servlet & JSP Programming");
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                System.out.println(raf.readUTF());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}