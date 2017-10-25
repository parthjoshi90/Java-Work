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
public class Multitasking {

    /**
     * @param args the command line arguments
     */
    
 
 public static void main(String args[]){  
    
    Thread tm = Thread.currentThread();
    TestSleepMethod1 ts1=new TestSleepMethod1();  
    TestSleepMethod1 ts2=new TestSleepMethod1();
    
    ts1.setName("Thread1");
    ts2.setName("Thread2");
    
    ts1.setPriority(Thread.NORM_PRIORITY);
    ts2.setPriority(Thread.NORM_PRIORITY);
    tm.setPriority(Thread.MIN_PRIORITY);
    
    ts1.start();  
    ts2.start();
    
    System.out.println("-------------- Sleep Demo Complete -----------------");
     
 }  
}  
 
class TestSleepMethod1 extends Thread{  
        public void run(){  
            for(int i=1;i<5;i++){  
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
               System.out.println(Thread.currentThread().getName()+" "+i);  
            }  
        }
}

