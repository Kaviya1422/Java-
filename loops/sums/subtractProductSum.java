package com.loops.sums;


import java.util.Scanner;

public class subtractProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int num = in.nextInt();
        int product = 1;
        int sum = 0;
        int n = num;

        while (n > 0){
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        int result = product - sum ;
        System.out.println("Result " + result);
    }

}

