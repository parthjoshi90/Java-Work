/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;  
import java.awt.event.*; 
import java.applet.*;


/**
 *
 * @author Parth Joshi
 */
public class Key_demo extends Applet implements KeyListener
{
    Label l1, l2;
    TextField tf;
    TextArea ta;
    public void init() 
    {
        l1 = new Label("Enter Text:");
        l2 = new Label("Output:");
         
        ta = new TextArea(7,50);
        tf = new TextField(20);
         
        tf.addKeyListener(this);
         
        add(l1);
        add(tf);        
        add(l2);
        add(ta);
         
    }
    public void keyTyped ( KeyEvent e )
    {  
        ta.append("Key Typed: " + tf.getText()+"\n");
    }  
    public void keyPressed ( KeyEvent e)
    {  
        ta.append ( "Key Pressed: "+ tf.getText() +"\n") ; 
    }  
    public void keyReleased ( KeyEvent e )
    {  
        ta.append( "Key Released: "+ tf.getText()+"\n" ) ; 
    }  
 
}