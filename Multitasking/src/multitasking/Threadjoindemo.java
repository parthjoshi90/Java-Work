/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitasking;

/**
 *
 * @author Parth Joshi
 */
public class Threadjoindemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestJoinMethod1 tj1=new TestJoinMethod1();  
        TestJoinMethod2 tj2=new TestJoinMethod2();  
        TestJoinMethod1 tj3=new TestJoinMethod1();  
        
        tj1.setName("Thread1");
        tj2.setName("Thread2");
        tj3.setName("Thread3"); 
        
        tj1.start();  
        try{  
            tj1.join();  
        }catch(Exception e){
            System.out.println(e);
        }  
        tj2.setPriority(Thread.MAX_PRIORITY);
        tj2.start();  
        tj3.start();
    }
    
}
class TestJoinMethod1 extends Thread{  
    public void run(){  
        for(int i=1;i<=5;i++){  
        try{  
            Thread.sleep(500);  
           }catch(Exception e){
               System.out.println(e);
           }
        System.out.println("Method 1:- "+Thread.currentThread().getName()+" "+ i);
        }  
          
  }  
 }

class TestJoinMethod2 extends Thread{  
    public void run(){  
        for(int i=6;i<=10;i++){  
        try{  
            Thread.sleep(500);  
           }catch(Exception e){
               System.out.println(e);
           }
        System.out.println("Method 2 :- "+Thread.currentThread().getName()+" "+ i);
        }  
          
  }  
 }