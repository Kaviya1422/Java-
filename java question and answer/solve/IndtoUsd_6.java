package com.solve;

import java.util.Scanner;

public class IndtoUsd_6 {

    public static double convertInrToUsd(double inrAmt, double exchangeRate){
        return inrAmt / exchangeRate;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount in Indian Rupees (INR) : ");
        double inrAmt = in.nextDouble();

        System.out.println("Enter current  exchange rate (1 USD TO INR) : ");
        double exchangeRate = in.nextDouble();

        //conversion
        double usdAmount = convertInrToUsd(inrAmt,exchangeRate);

        //o/p
        System.out.printf(" Amount in USD: $%.2f%n " , usdAmount);


    }
}
