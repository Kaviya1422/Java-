package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class Program_1011 {
    //calculate CGPA Java program
//    public static void main(String[] args) {
//        Scanner in =  new Scanner(System.in);
//        System.out.println(" Enter the number of semester : ");
//        int semnum = in.nextInt();
//
//        double totalper = 0;
//        //each sem percentage and calculate total percentage
//        for(int i = 1; i <= semnum ; i++){
//            System.out.println(" enter the percentage of " + i + " semester ");
//            int eachsem = in.nextInt();
//            totalper += eachsem;
//        }
//        //calculate CGPA
//        double TotalCgpa = ( totalper / semnum ) / 9.5 ;
//
//        // Format and display CGPA to 2 decimal places
//        System.out.printf("Your CGPA is: %.2f%n", TotalCgpa);
//    }
    //calculate compound interest
    // A=P(1+ r/n)^nt
    // where A is the amount of money accumulated after n years, including interest.
    //P is the principal amount (the initial amount of money).
    //r is the annual interest rate (in decimal).
    //n is the number of times that interest is compounded per year.
    //t is the time the money is invested for in years.
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.println("Enter principal amount (p) : ");
        int PrincipalAmt = in.nextInt();
        System.out.println(" Enter annual interest rate : ");
        double AnnualInterestRate = in.nextInt();
        // convert annual interest rate percentage into decimal
        double rate = AnnualInterestRate / 100;
        System.out.println("Enter the number of times interest is compounded per year (n) : ");
        int CompoundTime = in.nextInt();
        System.out.println("Enter number of years (t) : ");
        int years = in.nextInt();

        //calculate CI
        double amount = PrincipalAmt * Math.pow(1 + rate / CompoundTime , CompoundTime * years);
        double compoundInterest = amount - PrincipalAmt ;

        System.out.printf("The amount after %.2f years is : %.2f%n " , (double) years, amount);
        System.out.printf("The compound interest is: %.2f%n " , compoundInterest);

    }

}
