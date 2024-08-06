package com.loops.sums;

import java.util.Scanner;

public class SumANDLargestNum {
    public static void main(String[] args) {
 //       Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number ( 0 to stop ) :   ");
//        int number ;
//        int sum = 0;
//
//        while(true ){
//            number = in.nextInt();
//            if( number == 0){
//                break;
//            }
//            sum += number;
//        }
//        System.out.println("Total " + sum);

        //find the largest num until 0 is entered
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE; // use the smallest possible integer as the initial value
        int number;
        System.out.println("Enter number to find the largest (0 to stop ): ");

        while(true){
            //number = in.intnext() is inside loop because  u need to repeatedly read new user i/p within the loop
            number=in.nextInt(); // read i/p from user
            if( number == 0){ // check if i/p is 0
                break;  //exit if i/p = 0
            }
            if (number > largest){  //check if the current i/p is larger that tha current largest
                largest = number;  //update the largest num if the condition is true
            }
        }
        if(largest == Integer.MIN_VALUE){    //check if the largest value has been updated
            System.out.println("No number were enterd ");
        }else {
            System.out.println("Largest number " + largest);
        }


    }
}
