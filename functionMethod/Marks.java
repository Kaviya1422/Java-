package com.functionMethod;

import java.util.Scanner;

public class Marks {
    //switch((int)percentage / 10){ -> this expression evaluates the integer part of the percentage divided by 10 .
    // eg if percentage is 85 ((int)85/10) evaluates to 8.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your marks (out of 100):");
//        int marks = scanner.nextInt();
//
//        displayGrade(marks);
//    }
//
//    // Method to display the grade based on marks
//    private static void displayGrade(int marks) {
//        String grade;
//
//        // Calculate the grade range based on marks
//        int gradeCategory = marks / 10;
//
//        switch (gradeCategory) {
//            case 10: // This covers marks from 100 (though 100 falls in 91-100 range)
//            case 9:  // This covers marks from 91 to 100
//                grade = "AA";
//                break;
//            case 8:  // This covers marks from 81 to 90
//                grade = "AB";
//                break;
//            case 7:  // This covers marks from 71 to 80
//                grade = "BB";
//                break;
//            case 6:  // This covers marks from 61 to 70
//                grade = "BC";
//                break;
//            case 5:  // This covers marks from 51 to 60
//                grade = "CD";
//                break;
//            case 4:  // This covers marks from 41 to 50
//                grade = "DD";
//                break;
//            default: // This covers marks from 0 to 40 (including negative or invalid values)
//                if (marks <= 40) {
//                    grade = "Fail";
//                } else {
//                    grade = "Invalid marks"; // Handling any invalid input outside expected range
//                }
//                break;
//        }
//
//        System.out.println("Grade: " + grade);
//    }
//}

// Method to determine and display the grade
//static void displayGrade(int marks) {
//    if (marks >= 91 && marks <= 100) {
//        System.out.println("Grade: AA");
//    } else if (marks >= 81 && marks <= 90) {
//        System.out.println("Grade: AB");
//    } else if (marks >= 71 && marks <= 80) {
//        System.out.println("Grade: BB");
//    } else if (marks >= 61 && marks <= 70) {
//        System.out.println("Grade: BC");
//    } else if (marks >= 51 && marks <= 60) {
//        System.out.println("Grade: CD");
//    } else if (marks >= 41 && marks <= 50) {
//        System.out.println("Grade: DD");
//    } else if (marks <= 40) {
//        System.out.println("Grade: Fail");
//    } else {
//        System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
//    }


    //method 2
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }

        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;

        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }


    }

}