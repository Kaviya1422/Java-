package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class Program_1617 {
//    // Reverse a String
//    public static void main(String[] args) {
//        String original =  " Hello world ";
//        String reversed = new StringBuilder(original).reverse().toString();
//        // toString() ---> Returns a string containing the character in this sequence in the same order as this sequence.
//        // The length of the string will be the length of this sequence.
//        System.out.println("Original : " + original);
//        System.out.println("Reversed : " + reversed);
//    }
//    //find if a number is palindrom or not
//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    System.out.println("enter a number ");
//    int number = in.nextInt();
//    if(isPalindrome(number)){
//        System.out.println(number + " is a palindrom ");
//      }else{
//        System.out.println(number + " is not a palindrom ");
//      }
//    }
//
//public static boolean isPalindrome(int number){
//    int originalnum = number;
//    int reversednum = 0;
//
//    while (number != 0){
//        int digit = number % 10;
//        reversednum = reversednum * 10 + digit;
//        number /= 10;
//    }
//    return originalnum == reversednum;
//}

    // 18 Future investment value
    // basic formula  FV = PV * (1 + r)^n
    // FV= PV * ( 1 + r/k) ^nk
//
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//
//            // Input present value
//            System.out.println("Enter present value (PV): ");
//            double pv = in.nextDouble();
//
//            // Input annual interest rate
//            System.out.println("Enter annual interest rate (r) in percentage: ");
//            double r = in.nextDouble();
//
//            // Convert annual interest rate to decimal
//            double rate = r / 100;
//
//            // Input number of years
//            System.out.println("Enter number of years (n): ");
//            int n = in.nextInt();
//
//            // Input number of compounding periods per year
//            System.out.println("Enter number of compounding periods per year (k): ");
//            int k = in.nextInt();
//
//            // Calculate future value for simple interest
//            double fvSimple = calculation(pv, rate, n);
//            System.out.printf("Future Value with Simple Interest: %.2f%n", fvSimple);
//
//            // Calculate future value for compound interest
//            double fvCompound = calc(pv, rate, n, k);
//            System.out.printf("Future Value with Compound Interest: %.2f%n", fvCompound);
//
//            in.close();
//        }
//
//        // Method to calculate future value with simple interest
//        public static double calculation(double pv, double r, int n) {
//            double sum = pv * Math.pow((1 + r), n);
//            return sum;
//        }
//
//        // Method to calculate future value with compound interest
//        public static double calc(double pv, double r, int n, int k) {
//            double sum1 = pv * Math.pow((1 + r / k), (n * k));
//            return sum1;
//        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            // Input present value
            System.out.println("Enter present value (PV): ");
            double pv = in.nextDouble();

            // Input annual interest rate
            System.out.println("Enter annual interest rate (r) in percentage: ");
            double r = in.nextDouble();

            // Convert annual interest rate to decimal
            double rate = r / 100;

            // Input number of years
            System.out.println("Enter number of years (n): ");
            int n = in.nextInt();

            // Ask user to choose calculation method
            System.out.println("Choose calculation method: ");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            System.out.println("3. Both Simple and Compound Interest ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    // Calculate future value for simple interest
                    double fvSimple = calculation(pv, rate, n);
                    System.out.printf("Future Value with Simple Interest: %.2f%n", fvSimple);
                    break;
                case 2:
                    // Input number of compounding periods per year for compound interest
                    System.out.println("Enter number of compounding periods per year (k): ");
                    int k = in.nextInt();
                    // Calculate future value for compound interest
                    double fvCompound = calc(pv, rate, n, k);
                    System.out.printf("Future Value with Compound Interest: %.2f%n", fvCompound);
                    break;
                case 3:
                    // Calculate future value for simple interest
                    double fvSimpleBoth = calculation(pv, rate, n);
                    System.out.printf("Future Value with Simple Interest: %.2f%n", fvSimpleBoth);
                    // Input number of compounding periods per year for compound interest
                    System.out.println("Enter number of compounding periods per year (k): ");
                    int kBoth = in.nextInt();
                    // Calculate future value for compound interest
                    double fvCompoundBoth = calc(pv, rate, n, kBoth);
                    System.out.printf("Future Value with Compound Interest: %.2f%n", fvCompoundBoth);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1 or 2 or 3.");
                    break;
            }

            in.close();
        }

        // Method to calculate future value with simple interest
        public static double calculation(double pv, double r, int n) {
            double sum = pv * Math.pow((1 + r), n);
            return sum;
        }

        // Method to calculate future value with compound interest
        public static double calc(double pv, double r, int n, int k) {
            double sum1 = pv * Math.pow((1 + r / k), (n * k));
            return sum1;
        }
    }



