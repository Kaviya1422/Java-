package com.functionMethod;

import java.util.Scanner;

public class MaxMIn {

//    static boolean max( int a , int b , int c){
//        if(a>b) {
//            System.out.println( " a is greater ");
//        } else if (b>c) {
//            System.out.println( " b is greater ");
//        }else {
//            System.out.println( " c is greater ");
//        }
//        return true;
//    }

    static int largest( int first , int second , int third){
         int max = first ;
         if(second > max){
             max = second ;
         }
         if(third > max){
             max = third;
        }

        return max;
    }
    static int smallest( int first , int second , int third){
      int min = first ;
      if (second < min){
          min = second ;
      }
      if(third < min){
          min = third ;
      }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the number 1 ");
        int first = in.nextInt();
        System.out.println(" enter the number 2 ");
        int second = in.nextInt();
        System.out.println(" enter the number 3 ");
        int third = in.nextInt();

        int largest = largest(first,second,third);
        int smallest = smallest(first,second,third);

        System.out.printf("Largest of three numbers %d , %d , %d  is  %d %n " , first,second,third, largest);
        System.out.printf("Smallest of three numbers %d ,  %d , %d  is  %d %n " , first,second,third, smallest);
    }
}
