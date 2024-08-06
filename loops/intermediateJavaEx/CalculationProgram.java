package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class CalculationProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//// basic by using formula
//        System.out.println("Enter number of kWh used : ");
//        int num = in.nextInt();
//        System.out.println("Enter Rate per kWh : ");
//        int rate = in.nextInt();
//        int sum = num * rate ;
//        System.out.println(" Total : " + sum );

         /* Write a program to calculate electricity bill based on following information. Consumption Unit
        Rate of Charge
        0-150
        *3 per unit
        151-350
        100 plus 3.75 per unit exceeding 150 units
        301-450
        250 plus 4 per unit exceeding 350 units
        451-600
        300 plus 4.25 per unit exceeding 450 units
        Above 600
        ₹400 plus 5 per unit
        exceeding 600 units */

        System.out.println("Enter electricity consumption in units : ");
        int units = in.nextInt();

        //calculate bill based on consumption
        double bill = calculateBill(units);

        //display result
        System.out.println("Electricity bill for " + units + " units is rs : " + bill);
    }

    public static double calculateBill(int units){
        double bill = 0;

        if(units <= 150){
            bill = units * 3 ;
        } else if (units <= 350){
            bill = 100 + (units - 150) * 3.75;
        }else if (units <= 450){
            bill = 250 + (units - 350) * 4;
        }else if (units <= 600){
            bill = 300 + (units - 450) * 4.25;
        }else {
            bill = 400 + (units - 600) * 5;
        }
        return bill;
    }
}
