/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth Joshi
 */
public class Multiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result result = new Result("Parth",12,93,84);
        result.display();
        result.percent_cal();
    }
    
}
interface Exam
{
	void percent_cal();
}
class Student
{
	protected String name;
	protected int roll_no,mark1,mark2;
	Student(String n, int r, int m1, int m2)
	{
		this.name=n;
		this.roll_no=r;
		this.mark1=m1;
		this.mark2=m2;
	}
	void display()
	{
		System.out.println ("Name of Student: "+name);
		System.out.println ("Roll No. of Student: "+roll_no);
		System.out.println ("Marks of Subject 1: "+mark1);
		System.out.println ("Marks of Subject 2: "+mark2);
	}
}
class Result extends Student implements Exam
{
	Result(String n, int r, int m1, int m2)
	{
		super(n,r,m1,m2);
	}
	public void percent_cal()
	{
		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println ("Percentage: "+percent+" %");
	}
	public void display()
	{
		super.display();
	}
}