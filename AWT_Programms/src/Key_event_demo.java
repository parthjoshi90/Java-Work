/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth Joshi
 */
import java.awt.*;  
import java.awt.event.KeyListener; 
import java.awt.event.KeyEvent;
import java.applet.*;

public class Key_event_demo extends Applet implements KeyListener {
    String txt1 = " ";
    String txt2 = " ";
    String txt3 = " ";
    String txt4 = " ";
    int kcode; 
    char ch;
    int drawnumber;
    
    @Override
    public void init()
    {
       addKeyListener(this);
       requestFocus();
    }
    @Override
    public void keyTyped(KeyEvent ke)
    {
        ch = ke.getKeyChar();
        txt2+= ch;
        if(txt2.length() > 25)
        {
            txt2 = " ";
        }
        txt1 = "Key Typed";
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent ke)
    {
        kcode = ke.getKeyCode();
        if(kcode == KeyEvent.VK_F1)
            txt3 = "You have typed F1 key";
        if(kcode == KeyEvent.VK_SHIFT)
            txt4 = "You have typed Shift key";    
        txt1 = "Key pressed";
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent ke)
    {
        txt1 = "Key released";
        repaint();
    }
    @Override
    public void paint(Graphics gp)
    {
        gp.drawString(txt1, 20, 20);
        gp.drawString(txt2, 20, 40);
        gp.drawString(txt3, 20, 60);
        gp.drawString(txt4, 20, 80);
        showStatus("Key events");
    }
}
