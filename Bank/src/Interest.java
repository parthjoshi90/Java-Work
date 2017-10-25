/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth Joshi
 */
public class Interest {
    protected int principal,year;
    protected int simple,compound;
    Interest(int principal,int year)
    {
        this.principal = principal;
        this.year = year;
    }
    public int simple(double rate)
    {
        simple = principal + (int)(principal * year * rate / 100);
        return simple;
    }
    public int compound (double rate)
    {
        compound = (int)(principal * Math.pow((1 + rate /100),year));
        return compound;
    }
}
