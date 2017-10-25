/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;
import java.lang.Exception.*;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 *
 * @author Parth Joshi
 */
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c=0;
        a = 5;
        b = 0;
        int [] temp = new int[4];
        try{
            c = a / b;
                for(int i=0;i<=4;i++){
                    temp[i+1] = i;
                }
          
            System.out.println("Value of c:-"+c);
          
        }catch(ArithmeticException e){
            System.out.println("Can not divide by Zero....");
        }
        catch(ArrayIndexOutOfBoundsException ao){
                System.out.println("Check the loop variable");
            }
        System.out.println("Value of c:-"+c);
    }
    
}
