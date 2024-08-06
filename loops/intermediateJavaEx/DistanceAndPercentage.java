package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class DistanceAndPercentage {

//    //calculate distance between 2 points
//    //function to calculate distance
//    public static double distance( double x1 , double y1 , double x2 , double y2 ){
//        return Math.sqrt( Math.pow( (x2 - x1 ) ,2)
//                + Math.pow( ( y2 - y1 ), 2));
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println(" enter values of X1 AND  Y1 : ");
//        double x1 = in.nextDouble();
//        double y1 = in.nextDouble();
//        System.out.println(" enter values of X2 AND Y2 : ");
//        double x2 = in.nextDouble();
//        double y2 = in.nextDouble();
//        System.out.println(distance( x1 , y1 , x2 , y2 ));
//         }
//         }

// calculate commision percentage
//
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            String choice = "yes"; // Initialize choice to "yes" to enter the loop
//
//            while (choice.equalsIgnoreCase("yes")) {
//                System.out.println("Enter total sales amount:");
//                int sa = in.nextInt();
//
//                System.out.println("Enter commission earned:");
//                int ce = in.nextInt();
//
//                // Calculate commission percentage
//                double commissionPercentage = ((double) ce / sa) * 100;
//
//                System.out.printf("Display the Commission percentage: %.2f%%\n", commissionPercentage);
//
//                System.out.println("Do you want to enter another sales amount? (yes/no)");
//                choice = in.next();
//            }
//
//            in.close();
//        }
//method 2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter total sales amount ");
        int sa = in.nextInt();
        System.out.println(" enter commission earned ");
        double ce = in.nextInt();

        //calculate commission percentage
        double commissionPercentage = (ce / sa ) * 100 ;

        System.out.println("Display the Commission percentage  "  + commissionPercentage + "  % ");

    }

}

















