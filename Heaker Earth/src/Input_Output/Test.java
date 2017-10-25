/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input_Output;
import java.util.*;
public class Test {
public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int N = s.nextInt();
        

        for (int i = 0; i < N; i++) {
            int W = s.nextInt();
            int H = s.nextInt();
            if((W < L) || (H < L))
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(W == H)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
        
    }
}
