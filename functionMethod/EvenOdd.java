package com.functionMethod;

import java.util.Scanner;

public class EvenOdd {

    static int even(int num ){
        int ans = num ;
        if(num % 2 == 0){
            System.out.println(" given number " + num + "is even ");
        } else {
            System.out.println( " given number  " + num + " is odd ");
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the number ");
        int num = in.nextInt();

        int even = even(num);
        System.out.println(even);

    }
}
