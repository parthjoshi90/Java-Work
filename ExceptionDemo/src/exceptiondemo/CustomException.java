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
public class CustomException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 100 :  ");
        int number = scanner.nextInt();
        try{
            validateInput(number);
        }catch(InvalidInputException e){
            System.out.println("Caught Exception - Input is greater than 100");
        }
    }
    static void validateInput(int number) throws InvalidInputException{
        if(number>100){
            throw new InvalidInputException("Exception");
        }else{
            System.out.println("The provided input is valid");
        }
    }
}

class InvalidInputException extends Exception{  
    InvalidInputException(String exceptionText){  
        super(exceptionText);  
    }    
}
