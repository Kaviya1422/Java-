package com.solve;

import java.util.Scanner;

public class SimpleInterest_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        float principal = in.nextFloat();
        System.out.println("Enter the time period (in years) : ");
        float time = in.nextFloat();
        System.out.println("Enter the rate of interest (in %) : ");
        float rate = in.nextFloat();

        // calculate simple interest
        float simple_interest = ((principal * time * rate) / 100);

        System.out.println("The principal amount is " + simple_interest + "  ");
    }
}
