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
public class Item {
    private String item_code;
    private String item_name;
    private double item_mrp;
    private double item_tex;
    private int item_quantity;
    private double item_tex_amount;
    private double item_cost;
    
    Item(String code,String name,double mrp,double tex,int quantity){
        this.item_code = code;
        this.item_name = name;
        this.item_mrp = mrp;
        this.item_tex = tex;
        this.item_quantity = quantity;
        this.item_tex_amount = (mrp + mrp*tex) * quantity;
        this.item_cost = this.item_mrp+this.item_tex_amount;
    }
    public void setItem(String code,String name,double mrp,double tex,int quantity){
        this.item_code = code;
        this.item_name = name;
        this.item_mrp = mrp;
        this.item_tex = tex;
        this.item_quantity = quantity;
        this.item_tex_amount = mrp*tex;
        this.item_cost = (mrp + this.item_tex_amount) * quantity;
    }
    public String getItem_code(){
        return(this.item_code);
    }
    public String getItem_name(){
        return(this.item_name);
    }
    private double getItem_mrp(){
        return(this.item_mrp);
    }
    private double getItem_tex(){
        return(this.item_tex);
    }
    private int getItem_quantity(){
        return(this.item_quantity);
    }
    private double getItem_tex_amount(){
        return(this.item_tex_amount);
    }
    public double getItem_cost(){
        return(this.item_cost);
    }
}
