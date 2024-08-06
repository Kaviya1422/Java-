package com.loops;

import java.util.Scanner;

public class loopsexamples {
    public static void main(String[] args) {
//        //q : print 1 to 5 numbers
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }
//         //while loop
//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
//            num += 1;
//        }
//
        // q : largest num
   //     Scanner in = new Scanner(System.in);
//        System.out.println(" enter first number :" );
//        int num1 = in.nextInt();
//        System.out.println(" enter second number : ");
//        int num2 = in.nextInt();
//        System.out.println(" enter third number : ");
//        int num3 = in.nextInt();
//        int max = 0;
//        if(num1 > num2){
//            max = num1;
//            System.out.println(" num1 is greater" + max);
//        }
//         else if(num2 > num3){
//             max = num2;
//            System.out.println( " num2 is greater " + max);
//        }
//        else {
//            max = num3;
//            System.out.println(" num3 is greater" + max);
//        }

//        // q case check
//        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);
//         if(ch >= 'a' && ch <= 'z'){
//             System.out.println("lowercase");
//         }else{
//             System.out.println("uppercase");
//         }
        // Q Counting occurences
        // eg n = 1 2 3 6 8 3 9 8 3  2 3 ans = 4  ----> 3 is 4 times

//        int n = 45535;
//
//        int count = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 5) {
//                count++;
//            }
//            n = n / 10; // n /= 10
//        }
//
//        System.out.println(count);
        // method 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        long n = scanner.nextLong();  // Use long to handle large numbers
//
//        int[] digitCount = new int[10];  // Array to store count of each digit
//
//        // Count the occurrences of each digit
//        while (n > 0) {
//            int rem = (int)(n % 10);  // Get the last digit
//            digitCount[rem]++;
//            n = n / 10;  // Remove the last digit
//        }
//
//        // Find the digit with the highest count
//        int mostFrequentDigit = 0;
//        int maxCount = digitCount[0];
//        for (int i = 1; i < digitCount.length; i++) {
//            if (digitCount[i] > maxCount) {
//                mostFrequentDigit = i;
//                maxCount = digitCount[i];
//            }
//        }
//
//        System.out.println("The most frequent digit is: " + mostFrequentDigit);
//
// q reverse the num
        int num = 123456;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
