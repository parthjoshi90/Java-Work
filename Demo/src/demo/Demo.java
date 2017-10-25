/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Parth Joshi
 */

public class Demo {

    /**
     * @param args the command line arguments
     */
    static{
        System.out.println("This is from static block");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is from main class");
        
        System.out.println("------------------------------------------------------");
        
        Bank sbi = new Sbi();
        sbi.diposit();
        sbi.withdraw();
        sbi.calculateinterest();
        
        System.out.println("-------------------------------------------------------");
        
        Imp_Demo test = new Imp_Demo();
        test.Area(12);
        
        System.out.println("-------------------------------------------------------");
        
        int[] marks = {35,48,50,96,90};
        System.out.println("The Original Array:-");
        Test.display(marks);
        System.out.println("-------------------------------------------------------");
        System.out.println("Reverse Array:-");
        Test.display(Test.reverse(marks));
        
        System.out.println("-------------------------------------------------------");
        
        Count_Object.get_count();
        Count_Object.get_count();
        Count_Object.get_count();
        Count_Object.get_count();
        Count_Object.get_count();
        System.out.println(Count_Object.count);
        
        
        /* 
        Count_Object co1 =new Count_Object()
        Count_Object co2 =new Count_Object()
        Count_Object co3 =new Count_Object()
        Count_Object co4 =new Count_Object()
        System.out.println(co4.count);
        */        
    }
    
}

abstract class Bank{

    public void diposit(){
        System.out.println("Deposit from Base class");
    }
    
    public void withdraw(){
        System.out.println("Withdraw from Basae Class");
    }
    
    public abstract void calculateinterest();

}

class Sbi extends Bank{
    public void calculateinterest(){
        System.out.println("Calculate for interest from SBI");
    }
}

interface Interface_Demo{
        final double pi = 3.14;
        public void Area(int radious);
       // public void demo1();
        
}

class Imp_Demo implements Interface_Demo{
    public void Area(int n){
        System.out.println("This is from Interface");
        double area = n * pi;
        System.out.println(area);
        
        //pi=pi+1;
    }
}