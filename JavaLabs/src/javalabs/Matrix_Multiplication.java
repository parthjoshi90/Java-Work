/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabs;
/**
 *
 * @author Parth Joshi
 */
public class Matrix_Multiplication {
    public static void main(String args[]){
        	
    int firstarray[][] = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
    int secondarray[][] = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};
    
    System.out.println("First Matrix:\n");
    display(firstarray);
    System.out.println();
    System.out.println("Second Matrix:\n");
    display(secondarray);
    System.out.println();
    
    int [][] result = new int[firstarray.length][secondarray[0].length];

    /* Loop through each and get product, then sum up and store the value */
    for (int i = 0; i < firstarray.length; i++) { 
        for (int j = 0; j < secondarray[0].length; j++) { 
            for (int k = 0; k < firstarray[0].length; k++) { 
            result[i][j] += firstarray[i][k] * secondarray[k][j];
            }
        }
    }
    System.out.println("Result Matrix:\n");
    display(result);
   }
   public static void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
