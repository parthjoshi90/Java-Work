/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabs;
import java.util.*;
/**
 *
 * @author Parth Joshi
 */
public class Fibonacci_Series {
    public static void main(String args[]){
        int n1=0,n2=1,n3,i,limit;    
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter limit for the Series:-");
        limit = in.nextInt();
        
        System.out.println("Fibonacci Series is as below from 0 to "+limit);
        
        System.out.println(n1+" "+n2);//printing 0 and 1    
        
        for(i=2;i<limit;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
            n3=n1+n2;
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }
        System.out.println("\n");
    }
}
