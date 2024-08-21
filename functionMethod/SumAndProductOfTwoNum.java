package com.functionMethod;

import java.util.Scanner;

public class SumAndProductOfTwoNum {
//    static int sum( int num1 , int num2){
//        int ans =  num1 + num2;
//        return ans;
//    }
    static int product(int num1 , int num2){
        int ans = num1 * num2 ;
        return ans ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the first number ");
        int num1 = in.nextInt();

        System.out.println(" enter the second number ");
        int num2 = in.nextInt();

      //  int sum = sum(num1,num2);
      //  System.out.println(" sum of two numbers is " + sum);

        int product = product(num1,num2);
        System.out.println(" product of two numbers is " + product);
    }
}
