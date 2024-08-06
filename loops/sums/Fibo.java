package com.loops.sums;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = 10; // num of element to print
//        int a = 0;
//        int b = 1;
//
//        System.out.println("Fibonacci series up to " + n + " terms");
//        for (int i = 0; i <= n; i++) {
//            System.out.print(a + " ");
//            int sum = a + b;
//            a = b;
//            b = sum;
//
//        }
        System.out.println("Enter num of terms ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;

        while(count <= n){
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            count++ ;
        }

    }
}
