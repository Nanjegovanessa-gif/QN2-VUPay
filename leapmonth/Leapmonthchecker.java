/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapmonthchecker;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Leapmonthchecker {

        // Class variables
    int year;
    int month;
    boolean isLeapMonth;
    
    // Constructor
    public Leapmonthchecker(int year, int month) {
        this.year = year;
        this.month = month;
        this.isLeapMonth = false;
    }
    
    // Method to get month name
    public String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("LEAP MONTH CHECKER");
        System.out.println("==================");
        
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        
        // Check if month is valid
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter 1-12 only.");
            input.close();
            return;
        }
        
        // Create object
        Leapmonthchecker lm = new Leapmonthchecker(year, month);
        
        // Check if it's a leap month using the given formula - FIXED OPERATORS
        lm.isLeapMonth = (lm.year % 4 == 0);
        lm.isLeapMonth = lm.isLeapMonth && (lm.year % 100 != 0);
        lm.isLeapMonth = lm.isLeapMonth || (lm.year % 400 == 0);
        
        // Display result
        System.out.println("\nRESULTS:");
        System.out.println("---");
        System.out.println("Year: " + lm.year);
        System.out.println("Month: " + month + " (" + lm.getMonthName(month) + ")");
        
        if (lm.isLeapMonth) {
            System.out.println("February " + lm.year + " has 29 days (Leap Year)");
            if (month == 2) {
                System.out.println("✓ This month is a leap month!");
            } else {
                System.out.println("Note: " + lm.getMonthName(month) + " is not affected");
            }
        } else {
            System.out.println("February " + lm.year + " has 28 days (Not a Leap Year)");
            System.out.println("✗ This is NOT a leap month");
        }
        
        input.close();
    }
}