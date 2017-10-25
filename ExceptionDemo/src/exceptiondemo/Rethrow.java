/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;

/**
 *
 * @author Parth Joshi
 */
public class Rethrow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //   try{
            getStringLength();
   //     }
     //   catch(Exception e){
       //     System.out.println("Caught re-thrown exception : "+e.toString());
        //}
    }

    static void getStringLength(){
        try{
            String text = null;
            int length = text.length();
        }catch(Exception e){
          //  System.out.println("Caught exception : "+e.toString());
            throw e;
        }
    }
}
