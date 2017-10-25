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
public class Order {
  private int ary[];
  private int n;
    
    public void getData()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("How many numbers you want to enter here : ");
        n = sc.nextInt();
        
        ary = new int[100];
        
        System.out.println("\nEnter numbers:\n");
        
        for (int i=0,k; i<n; i++)
        {
            k = i+1;
            System.out.print("Enter number " + k + " : " );
            ary[i] = sc.nextInt();
        }
    }
    
    public void getAscendingOrder()
    {
        int temp;
        for (int i=0; i<n; i++)
        {
            for (int j=i+1; j<n; j++)
            {
                if (ary[i] > ary[j])
                {
                 temp = ary[i];
                 ary[i] = ary[j];
                 ary[j] = temp;
                }
            }
        }
    }
    
    public void setData()
    {
        System.out.println("\nNumbers in ascending order : ");
        
        for (int i=0; i<n; i++)
        {
            System.out.print(" " + ary[i]);
        }
    }  
}
