/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Parth Joshi
 */
public class Employee {
    
    private String Emp_Code, Emp_Name, Emp_Degignation;
    private double basic_pay;
    private double total_pay;
    private double hra;
    private double da;
    static double HRA_RATE = 0.10;
    static double DA_RATE = 0.45;
    
    Employee(String Emp_Code, String Emp_Name, String Emp_Degignation, double basic_pay){
        this.Emp_Code = Emp_Code;
        this.Emp_Name = Emp_Name;
        this.Emp_Degignation = Emp_Degignation;
        this.basic_pay = basic_pay;
        this.hra = basic_pay*HRA_RATE;
        this.da = basic_pay*DA_RATE;
        this.total_pay = basic_pay + this.hra + this.da;
    }
    
    public void setEmployee(String Emp_Code, String Emp_Name, String Emp_Degignation, double basic_pay){
        this.Emp_Code = Emp_Code;
        this.Emp_Name = Emp_Name;
        this.Emp_Degignation = Emp_Degignation;
        this.basic_pay = basic_pay;
        this.hra = basic_pay*HRA_RATE;
        this.da = basic_pay*DA_RATE;
        this.total_pay = basic_pay + this.hra + this.da;
    }
    
    public String getEmp_code(){
        return(this.Emp_Code);
    }

    public String getEmp_name(){
        return(this.Emp_Name);
    }
    
    public String getEmp_Degignation(){
        return(this.Emp_Degignation);
    }
    
    public double getBasic_pay(){
        return(this.basic_pay);
    }
    
    public double getHra(){
        return(this.hra);
    }
    
    public double getDa(){
        return(this.da);
    }
    
    public double getTotal_pay(){
        return(this.total_pay);
    }
}