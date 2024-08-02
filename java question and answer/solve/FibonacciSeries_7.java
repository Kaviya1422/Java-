package com.solve;

public class FibonacciSeries_7 {
    public static void main(String[] args) {

        int n = 10; // num of element to print
        int a = 0 ;
        int b = 1;

        System.out.println("Fibonacci series up to " +  n + " terms");
        for( int i =0; i <= n ; i++){
            System.out.print(a + " ");
            int sum = a + b ;
            a = b;
            b = sum;
        }
    }
}
