package com.functionMethod;

import java.util.Scanner;

public class Vote {

    static int vote(int num ){
        int ans = num ;
        if(num >= 18){
            System.out.println(" he/she can vote ");
        } else {
            System.out.println( " he/she cannot vote ");
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the age ");
        int num = in.nextInt();

        int vote = vote(num);
        //int vote = 0;
        System.out.println(vote);

    }

}
