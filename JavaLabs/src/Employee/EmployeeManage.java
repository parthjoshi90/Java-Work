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
public class EmployeeManage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new Employee("EC001", "Nitin", "Project Manager", 55000.0);
        Employee e2 = new Employee("EC002", "Paresh", "Developer", 30000.0);
        Employee e3 = new Employee("EC003", "Vidhi", "Developer", 30000.0);
        
//        e1.setEmployee("EC001", "Nitin", "Project Manager", 55000.0);
//        e2.setEmployee("EC002", "Paresh", "Developer", 30000.0);
//        e3.setEmployee("EC003", "Vidhi", "Developer", 30000.0);
        
        
        System.out.println("Employee Code:- " + e1.getEmp_code());
        System.out.println("Employee Name:- " + e1.getEmp_name());
        System.out.println("Employee Degignation:- " + e1.getEmp_Degignation());
        System.out.println("Employee Basic Pay:- " + e1.getBasic_pay());
        System.out.println("Employee HRA :- " + e1.getHra());
        System.out.println("Employee DA :- " + e1.getDa());
        System.out.println("Employee Total Pay:- " + e1.getTotal_pay());
        
        System.out.println("--------------------------------------------");
        
        System.out.println("Employee Code:- " + e2.getEmp_code());
        System.out.println("Employee Name:- " + e2.getEmp_name());
        System.out.println("Employee Degignation:- " + e2.getEmp_Degignation());
        System.out.println("Employee Basic Pay:- " + e2.getBasic_pay());
        System.out.println("Employee HRA :- " + e2.getHra());
        System.out.println("Employee DA :- " + e2.getDa());
        System.out.println("Employee Total Pay:- " + e2.getTotal_pay());
        
        System.out.println("--------------------------------------------");
        
        System.out.println("Employee Code:- " + e3.getEmp_code());
        System.out.println("Employee Name:- " + e3.getEmp_name());
        System.out.println("Employee Degignation:- " + e3.getEmp_Degignation());
        System.out.println("Employee Basic Pay:- " + e3.getBasic_pay());
        System.out.println("Employee HRA :- " + e3.getHra());
        System.out.println("Employee DA :- " + e3.getDa());
        System.out.println("Employee Total Pay:- " + e3.getTotal_pay());
    }
    
}
