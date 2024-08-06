package com.loops.sums;

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the shape to calculate the surface area:");
            System.out.println("1. Curved Surface Area of Cylinder");
            System.out.println("2. Total Surface Area of Cube");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();
                double curvedSurfaceArea = 2 * Math.PI * radius * height;
                System.out.println("Curved Surface Area of the cylinder: " + curvedSurfaceArea);
            } else if (choice == 2) {
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                double totalSurfaceArea = 6 * side * side;
                System.out.println("Total Surface Area of the cube: " + totalSurfaceArea);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
            System.out.println();  // Add a blank line for better readability
        }        }
}

