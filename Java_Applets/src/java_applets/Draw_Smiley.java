/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_applets;

import java.awt.*;
import java.applet.*;
public class Draw_Smiley extends Applet {
    public void paint(Graphics g){

        Font f = new Font("calibry", Font.BOLD,20);
        g.setFont(f);
        g.drawString("Keep Smiling", 100, 30);
        g.drawOval(60, 60, 200, 200);
        g.fillOval(80, 120, 50, 20);
        g.fillOval(180, 120, 50, 20);
        g.drawLine(160, 125, 160, 175);
        g.drawArc(115, 130, 95, 95, 0, -180);
    }
}
