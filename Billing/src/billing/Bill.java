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
public class Bill {
    private String b_code;
    Item item;
    private String item_name;
    private String item_code;
    private double total_bill;
    
    Bill(Item item,String code){
        this.item = item;
        this.b_code = code;
        this.total_bill = item.getItem_cost();
        this.item_name = item.getItem_name();
        this.item_code = item.getItem_code();
    }
    public void makeBill(Item item,String code){
        this.item = item;
        this.b_code =code;
        this.total_bill = item.getItem_cost();
    }
    public double get_Bill(){
        return(this.total_bill);
    }
    public String get_Billcode(){
        return(this.b_code);
    }
    public String get_Item_name(){
        return(this.item_name);
    }
    public String get_Item_code(){
        return(this.item_code);
    }
}
