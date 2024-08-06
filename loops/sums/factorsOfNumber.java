package com.loops.sums;

import java.util.Scanner;

public class factorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find its factor : ");
        int num = in.nextInt();

        System.out.print("Factor of " + num + " are : ");
        for( int i = 1; i <= num ; i++){
            if ( num % i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
