/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;

import java.util.Scanner;

/**
 *
 * @author Parth Joshi
 */
public class ThrowwithArgument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number to be divided by 3 : ");
        int num1 = scanner.nextInt();
        
        int result = num1%3;
        
        if (result!=0){
            throw new ArithmeticException("The input number is not divisible by 3");
        }else{
            System.out.println("The input number is divisible by 3");
        }
    }
    
}
