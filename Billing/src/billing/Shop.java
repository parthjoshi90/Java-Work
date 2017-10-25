/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

/**
 *
 * @author Parth Joshi
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item i1 = new Item("i001","book",150,0.06,5);
        Item i2 = new Item("i002","pen",15,0.10,15);
        
        Bill b1 = new Bill(i1, "b001");
        //b1.makeBill(i2, "b001");
        Bill b2 = new Bill(i2,"b002");
        
        System.out.println("------------- Bill 1 ---------------");
        System.out.println("Bill:"+b1.get_Billcode());
        System.out.println("Item Code:"+b1.get_Item_code());
        System.out.println("Item Name:"+b1.get_Item_name());
        System.out.println("Total Cost:"+b1.get_Bill());
        
        System.out.println("------------- Bill 2 ---------------");
        System.out.println("Item Code:"+b2.get_Item_code());
        System.out.println("Item Name:"+b2.get_Item_name());
        System.out.println("Total Cost:"+b2.get_Bill());
        
        
        
    }
    
}
