package com.loops.intermediateJavaEx;

import java.util.Scanner;

public class Calculation {
    //calculate average of n numbers
    public static void main(String[] args) {

//       Scanner scanner = new Scanner(System.in);
//        // Prompt the user to enter the number of elements
//        System.out.print("Enter the number of elements: ");
//        int n = scanner.nextInt();
//
//        // Array to store the elements
//        double[] numbers = new double[n];
//
//        // Prompt the user to enter the elements
//        System.out.println("Enter the numbers:");
//        for (int i = 0; i < n; i++) {
//            numbers[i] = scanner.nextDouble();
//        }
//
//        // Calculate the sum of the elements
//        double sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += numbers[i];
//        }
//
//        // Calculate the average
//        double average = sum / n;
//
//        // Print the average
//        System.out.println("The average is: " + average);
//
//        scanner.close();
//
//        // calculate  discount of product
//       Scanner in = new Scanner(System.in);
//        System.out.println(" Enter product name ");
//        String ch = in.next();
//        System.out.println(" enter original price ");
//        int op = in.nextInt();
//        System.out.println("enter discount rate( in % ) ");
//        int discount = in.nextInt();
//
//        // calculate discount amt
//        int discountAmount = (op * discount) / 100 ;
//
//        //calculate discount price
//        int discountPrice = op - discountAmount;
//
//        System.out.println(" original price " + op );
//        System.out.println(" discount amount " + discountAmount );
//        System.out.println(" discounted price " + discountPrice );
           // using loops
                Scanner in = new Scanner(System.in);
                String choice;

                do {
                    System.out.println("Enter product name:");
                    String productName = in.next();

                    System.out.println("Enter original price:");
                    int originalPrice = in.nextInt();

                    System.out.println("Enter discount rate (in %):");
                    int discountRate = in.nextInt();

                    // Calculate discount amount
                    int discountAmount = (originalPrice * discountRate) / 100;

                    // Calculate discounted price
                    int discountedPrice = originalPrice - discountAmount;

                    System.out.println("Original price: " + originalPrice);
                    System.out.println("Discount amount: " + discountAmount);
                    System.out.println("Discounted price: " + discountedPrice);

                    System.out.println("Do you want to enter another product? (yes/no)");
                    choice = in.next();
                } while (choice.equalsIgnoreCase("yes"));

                in.close();
            }
        }



