package com.solve;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println(" The given " + num + " number is even");
        }
        else{
            System.out.println(" The given " + num + " number is odd");
        }

    }
}
