/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_applets;

import java.applet.*;
import java.awt.*;
public class Graphical extends Applet {
    @Override
    public void paint(Graphics g){  
        g.setColor(Color.red);  
        g.drawString("Shapes",120, 50);  
        g.drawLine(20,30,20,300);  
        g.drawRect(70,100,30,30);  
        g.fillRect(170,100,30,30);  
        g.drawOval(70,200,30,30);  
        g.fillOval(170,200,30,30);

        g.setColor(Color.blue);  
          
        g.drawArc(70,150,30,30,0,180);  
        g.fillArc(170,150,30,30,0,180);  
        g.drawLine(20,300,300,300);
    }
}