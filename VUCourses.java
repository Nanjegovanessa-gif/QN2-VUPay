/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vucourses;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class VUCourses {

         // (b) Variable declarations
    String moduleCode;
    String moduleName;
    int tuitionFee;
    boolean isValid = true; 
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        VUCourses[] courses = new VUCourses[4];
        
        // Course 1: BSc. Software Engineering
        courses[0] = new VUCourses();
        courses[0].moduleCode = "BSF";
        courses[0].moduleName = "BSc. Software Engineering";
        courses[0].tuitionFee = 900000;
        
        // Course 2: BSc. Information Technology
        courses[1] = new VUCourses();
        courses[1].moduleCode = "BIT";
        courses[1].moduleName = "BSc. Information Technology";
        courses[1].tuitionFee = 750000;
        
        // Course 3: BSc. Computer Science
        courses[2] = new VUCourses();
        courses[2].moduleCode = "BCS";
        courses[2].moduleName = "BSc. Computer Science";
        courses[2].tuitionFee = 800000;
        
        // Course 4: BSc. Computer Engineering
        courses[3] = new VUCourses();
        courses[3].moduleCode = "BCE";
        courses[3].moduleName = "BSc. Computer Engineering";
        courses[3].tuitionFee = 950000;
        
        // Welcome message
        System.out.println("    WELCOME TO VUPAY ");
        System.out.println("========================================");
        
        // Prompt user for input
        System.out.print("\nEnter Module Code (BSF, BIT, BCS, BCE): ");
        String userInput = scanner.nextLine().toUpperCase();
        
        // Search for the course
        boolean found = false;
        
        for(int i = 0; i < courses.length; i++) {
            if(courses[i].moduleCode.equals(userInput)) {
                // Display course details
                System.out.println("\n----------------------------------------");
                System.out.println("COURSE DETAILS FOUND:");
                System.out.println("----------------------------------------");
                System.out.println("Module Code: " + courses[i].moduleCode);
                System.out.println("Module Name: " + courses[i].moduleName);
                System.out.println("Tuition Fee: UGX " + courses[i].tuitionFee);
                System.out.println("----------------------------------------");
                found = true;
                break;
            }
        }
        
        // If course not found
        if(!found) {
            System.out.println("\n❌ Wrong Module Code details");
            System.out.println("Please enter a valid code: BSF, BIT, BCS, or BCE");
        }
        
        System.out.println("\nThank you for using VUPay!");
        scanner.close();
    
    }
}
