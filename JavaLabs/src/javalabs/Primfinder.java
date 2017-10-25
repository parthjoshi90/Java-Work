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
public class Primfinder {
     public static void main(String args[]){  
        int i,m=0,flag=0,n;    
        Scanner in = new Scanner(System.in);
        //int n=17;//it is the number to be checked
        System.out.println("Enter the number: ");
        n = in.nextInt();
        m=n/2;    
  
        for(i=2;i<=m;i++){    
            if(n%i==0){    
                System.out.println("Number is not prime");    
                flag=1;    
                break;    
            }    
        }    
        if(flag==0)    
        System.out.println("Number is prime");    
}  
}
