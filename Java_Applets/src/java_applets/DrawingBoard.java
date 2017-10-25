/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_applets;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author Parth Joshi
 */
public class DrawingBoard extends Applet {

    /**
     * Here i am drawing a circle with two Arcs and square from 4 lines
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics gp)
    {
        gp.drawArc(50, 50, 100, 100, 0, 180);
        gp.drawArc(50, 50, 100, 100, 0, -180);
        
        gp.drawLine(50, 250, 50, 350);
        gp.drawLine(50, 350, 250, 350);
        gp.drawLine(250, 350, 250, 250);
        gp.drawLine(250, 250, 150, 250);
    }
}
