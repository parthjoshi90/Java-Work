/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_applets;
import java.applet.Applet;  
import java.awt.Graphics;
import java.util.Scanner;
/**
 *
 * @author Parth Joshi
 */
public class Parameter extends Applet{  
  
public void paint(Graphics g){  
    Scanner in = new Scanner(System.in);
  String msg = in.nextLine();
String str=getParameter(msg);  
g.drawString(str,50, 50);  
}  
  
}  