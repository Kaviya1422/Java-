package com.functionMethod;

import java.util.Scanner;

public class PrimeorNot {
    static boolean isArmstrong (int n){
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n = n / 10 ;
            sum = sum + rem * rem * rem ;
        }
        return sum == original;
    }

    public static void main(String[] args) {

        for (int i = 100; i < 1000 ; i++){
            if(isArmstrong(i)){
                System.out.print( i + " ");
            }
        }
       // System.out.println(isArmstrong(156));
    }
}


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter a number ");
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
//        if(isPrime(n)){
//            System.out.println( n +" is prime ");
//        }
//        else{
//            System.out.println( n + " is not prime");
//        }
//    }

//    static boolean isPrime(int n ){
//        if(n <=1 ){ // n is less than or equal to 1, it's not a prime number. The method immediately returns false.
//            return false;
//        }
//        int c = 2; //c is initialized to 2, which is the smallest prime number.
//        while (c * c <= n){
//            if( n % c == 0){
//                return false;
//            }
//            c++;
//        }
//        //return  c * c > n;
//        if(c * c >  n){
//            return true;
//        }
//        return false;
//    }
//    static boolean isPrime(int n){
//        if(n <= 1){
//            return false;
//        }
//        for ( int i= 2 ; i <= n/2 ; i++){
//            if( n % i == 0)
//                return false;
//        }
//        return true;
//    }
    // }





