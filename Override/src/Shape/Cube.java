/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author Parth Joshi
 */
public class Cube extends Square 
{
    double length;
    public Cube(double a)
    {
        super(a);
        length = a;
    }
    public double Area()
    {
         return 6 * (length * length);
        
    }
}
