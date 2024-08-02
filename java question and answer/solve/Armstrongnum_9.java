package com.solve;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Armstrongnum_9 {

        // Method to check if a number is an Armstrong number
        public static boolean isArmstrong(int number) {
            int originalNumber, remainder, result = 0, n = 0;

            originalNumber = number;
            // Calculate the number of digits in the number
            for (;originalNumber != 0; originalNumber /= 10, ++n);

            originalNumber = number;

            // Calculate the sum of the nth power of its digits
            for (;originalNumber != 0; originalNumber /= 10) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, n);
            }

            // Check if the sum is equal to the original number
            return result == number;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the range
            System.out.print("Enter the lower limit: ");
            int lowerLimit = scanner.nextInt();
            System.out.print("Enter the upper limit: ");
            int upperLimit = scanner.nextInt();

            System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are:");

            // Find and print all Armstrong numbers in the given range
            for (int i = lowerLimit; i <= upperLimit; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }



