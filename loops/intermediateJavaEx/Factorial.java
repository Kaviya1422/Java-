package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the number ");
        int num = in.nextInt();
        int result = 1;
        for( int i = 1; i <= num ; i++){
            result = result * i;
        }
        System.out.println("The factorial of " + num + " is " + result);
    }
}
