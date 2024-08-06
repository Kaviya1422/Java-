package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class DepreciationvalueAndBatting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println(" what you want to calculate ");
            System.out.println(" 1. depreciation value ");
            System.out.println(" 2. batting average  ");
            System.out.println(" 3. Exit");
            System.out.println(" Enter your choice  : ");
            int choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter initial value  "); //cost of the asset
                    double invalue  = in.nextDouble();
                    System.out.println("Enter salvage value  "); //value at the end of its useful life (duration)
                    double salvageValue  = in.nextDouble();
                    System.out.println("Enter Useful life time ( in years )   "); // duration the asset is expected to be used
                    double durationValue  = in.nextDouble();
                    System.out.println(" enter number of years "); // eg 3 find value after 3 years
                    int  NumOfYears = in.nextInt();
                    double AnnualDepreciation = ( invalue - salvageValue ) / durationValue ; //calculate annual deprection
                    double DepreciatedValue = invalue - ( AnnualDepreciation * NumOfYears ); // calculate depreciate value at a given time

                    System.out.println(" Annual Deprection " + AnnualDepreciation);
                    System.out.println(" So after " + NumOfYears + " the D" +
                            "depreciated value of the asset is " + DepreciatedValue);
                    break;

                case 2:
                    System.out.println("Enter total number of runs scored  ");
                    int totalscore = in.nextInt();
                    System.out.println("Enter total number of dismissals "); // times out or dismissals
                    int dissmissal = in.nextInt();
                    int BattingAverage = totalscore / dissmissal ; // calculate batting average
                    System.out.println(" The batting average is " + BattingAverage);
                    break;
                case 3:
                    System.out.println("Exiting... ");
                    return;
                default:
                    System.out.println(" Invalid choice! Please select a valid option ");

            }
            System.out.println();

        }
    }
}
