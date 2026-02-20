package com.mycompany.leapmonth;

/**
 * @author mac
 */
public class Leapmonth {
    int year;
    int month;
    boolean isLeapMonth;
    
    public Leapmonth(int year, int month) {
        this.year = year;
        this.month = month;
        this.isLeapMonth = false;
    }
    
    public static void main(String[] args) {
        Leapmonth lm = new Leapmonth(2024, 2);
        
        System.out.println("Year: " + lm.year);
        System.out.println("Month: " + lm.month);
    }
}