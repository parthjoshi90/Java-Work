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
public class Newthrow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number 1 : ");
        int num1 = scanner.nextInt();
       
        System.out.println("Enter number 2 : ");
        int num2 = scanner.nextInt();
      
        int result=add(num1,num2);
        System.out.println("Result is : "+result);
    }
     
       //Throw exception if number 1 is greater than 900
    static int add(int num1, int num2){
      if (num1 > 900){
         throw new ArithmeticException("Num 1 is greater than 900 and hence Exception is thrown");
      }else{
         System.out.println("Both parameters are correct!!");
      }
      return num1+num2;
   }
}
                
    

