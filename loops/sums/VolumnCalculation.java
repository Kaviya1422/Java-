package com.loops.sums;

import java.util.Scanner;

public class VolumnCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Select the shape to calculate the volume : ");
            System.out.println(" 1. cone ");
            System.out.println(" 2. prism ");
            System.out.println(" 3. cylinder ");
            System.out.println(" 4. sphere ");
            System.out.println(" 5. pyramid ");
            System.out.println(" 6. exit ");
            System.out.println(" Enter your choice  : ");

            int choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter the radius of the cone: ");
                    double radius = in.nextDouble();
                    System.out.println("Enter the height of the cone: ");
                    double height = in.nextDouble();
                    double cone = (1.0 / 3) * Math.PI * radius * radius * height;
                    System.out.println(" Volume of the cone : " + cone);
                    break;
                case 2:
                    System.out.println("Enter the length of the prism: ");
                    double length = in.nextDouble();
                    System.out.println("Enter the width of the prism: ");
                    double width = in.nextDouble();
                    System.out.println("Enter the height of the prism: ");
                    double heightprism = in.nextDouble();
                    double prism = length * width * heightprism;
                    System.out.println(" Volume of the prism : " + prism);
                    break;
                case 3:
                    System.out.println("Enter the radius of the cylinder: ");
                    double radiusofcylinder  = in.nextDouble();
                    System.out.println("Enter the height of the cylinder: ");
                    double h  = in.nextDouble();
                    double cylinder = Math.PI * radiusofcylinder * radiusofcylinder * h ;
                    System.out.println(" Volume of the cylinder: " + cylinder);
                    break;
                case 4:
                    System.out.println("Enter the radius of the sphere: ");
                    double radiusofsphere  = in.nextDouble();
                    double sphere = (4.0/3) * Math.PI * Math.pow(radiusofsphere , 3);
                    System.out.println(" Volume of the sphere : " + sphere);
                    break;
                case 5:
                    System.out.println("Enter the length of the pyramid: ");
                    double l = in.nextDouble();
                    System.out.println("Enter the width of the pyramid : ");
                    double w = in.nextDouble();
                    System.out.println("Enter the height of the pyramid : ");
                    double heightofpyramid = in.nextDouble();
                    double pyramid = (1.0/3) * l * w * heightofpyramid;
                    System.out.println("Volume of the pyramid " + pyramid);
                    break;
                case 6:
                    System.out.println("Existing....");
                    return;
                default:
                    System.out.println(" Invalid choice ! Please select a valid option ");
            }
          System.out.println(); // at the end of each loop iteration serve to add a blank line  for better readbility
        }
    }
}