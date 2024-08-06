package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class Program_1213 {
//    //Calculate average marks
//    // avg = total sum of marks / num of marks or subject
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number  of Subjects  :   ");
//        int number = in.nextInt();
//        int sum = 0;
//
//        for( int i=1 ; i <= number ; i++){
//            System.out.println("Enter Mark for subject " + i + " : " );
//            int mark = in.nextInt();
//            sum += mark;
//        }
//        double avg = sum/number ;
//        System.out.println("Average Mark is " + avg );
//    }

    // calculate N Natural numbers
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println(" Enter the number (N) : ");
        int n = in.nextInt();

        double sum = n * ( n + 1 ) / 2 ;
        System.out.println("The sum of first " + n + " natural number is " + sum);

    }


    // sum of N numbers
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number ( enter 0 to stop ):  :   ");
//        int number = in.nextInt();
//        int sum = 0;
//
//        while(true ){
//            number = in.nextInt();
//            if( number == 0){
//                break;
//            }
//            sum += number;
//        }
//    System.out.println("Total " + sum);
//    }



}
