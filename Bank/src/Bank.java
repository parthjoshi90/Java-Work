/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth Joshi
 */
import java.util.Scanner;
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        int p,y;
        System.out.println("Enter the Principal Amount ");
        p = sc.nextInt();
        System.out.println("Enter the years ");
        y = sc.nextInt();
        Interest deposite = new Interest (p,y);
        System.out.println("Amount deposited = Rs. "+deposite.principal);
        System.out.println("Amount After " + deposite.year + " years in simple interest = Rs. "+ deposite.simple(2));
        System.out.println("Amount After "+ deposite.year + " years in compound interest = Rs. " + deposite.compound(2));
        
        
    }
    
}
