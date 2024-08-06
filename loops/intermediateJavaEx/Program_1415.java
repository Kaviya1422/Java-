package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class Program_1415 {
// // armstrong number in java
// public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("Enter the number ");
//     int number = in.nextInt();
//
//     int originalnum = number;
//     int result = 0;
//     int digits = String.valueOf(number).length();
//
//     //calculate
//     while ( number != 0){
//         int remainder = number % 10;
//         result += Math.pow(remainder,digits);
//         number /= 10;
//     }
//     if(result == originalnum) {
//         System.out.println(originalnum + " is an Armstrong number");
//     }else{
//         System.out.println(originalnum + " is not an Armstrong number ");
//     }
// }

    //find nCr and nPr
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value for n : ");
        int n = in.nextInt();
        System.out.println("Enter value for r : ");
        int r = in.nextInt();

        System.out.println("nCr : " + nCr(n , r));
        System.out.println("nCr : " + nPr(n , r));
    }
    public static int factorial(int num){
        int result = 1;
        for( int i =1 ; i<=num ; i++){
            result *= i;
        }
        return result;
    }
    public static int nCr(int n , int r ){
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    public static int nPr(int n , int r){
        return factorial(n) / (factorial(n-r));
    }


}
