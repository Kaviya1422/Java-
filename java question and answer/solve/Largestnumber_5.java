package com.solve;

import java.util.Scanner;

public class Largestnumber_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int num1 = in.nextInt();

        System.out.println("Enter number2 : ");
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("Number1 is greater");
        }
        else {
            System.out.println("Number2 is greater");
        }
    }
}
