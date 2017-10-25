/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Shape.Cube;
import Shape.Square;

/**
 *
 * @author Parth Joshi
 */
public class Main {

    public static void main(String[] args) {
      double area;
        
        Square sq = new Square(4.5);
        area = sq.Area(); 
        System.out.println("Area of Square = " + area);
        
        Cube cb = new Cube (4.5);
        area = cb.Area();
        System.out.println("Area of Cube = "+area);
    }
    
}
