package com.loops.sums;

import java.util.Scanner;

public class PerimeterCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Select the shape to calculate the perimeter : ");
            System.out.println(" 1. circle ");
            System.out.println(" 2. equilateral triangle ");
            System.out.println(" 3. parallelogram ");
            System.out.println(" 4. rectangle ");
            System.out.println(" 5. square ");
            System.out.println(" 6. rhombus ");
            System.out.println(" 7. Exit");
            System.out.println(" Enter your choice  : ");

            int choice = in.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the radius of the circle : ");
                    double radius = in.nextDouble();
                    double sumofcircle = 2 * Math.PI * radius ;
                    System.out.println(" Perimeter of the circle : " + sumofcircle);
                    break;
                case 2:
                    System.out.println("Enter the sides of equilateral triangle : ");
                    double sides = in.nextDouble();
                    double sumoftriangle = 3 * sides;
                    System.out.println(" Perimeter of the equilateral triangle : " + sumoftriangle);
                    break;
                case 3:
                    System.out.println("Enter the base of the parallelogram : ");
                    double base = in.nextDouble();
                    System.out.println(" Enter thr side of the parallelogram  ");
                    double side = in.nextDouble();
                    double sumofparallelogram = 2 * (base + side);
                    System.out.println(" Perimeter of the parallelogram : " + sumofparallelogram);
                    break;
                case 4:
                    System.out.println("Enter the length of the rectangle : ");
                    double length  = in.nextDouble();
                    System.out.println(" Enter the width of the rectangle : ");
                    double width = in.nextDouble();
                    double sumofrectangle = 2 * (length + width);
                    System.out.println(" Perimeter of the rectangle : " + sumofrectangle);
                    break;
                case 5:
                    System.out.println("Enter the side of square : ");
                    double sideSquare = in.nextDouble();
                    double sumofsquare  = 4 * sideSquare ;
                    System.out.println(" Perimeter of the square : " + sumofsquare);
                    break;
                case 6:
                    System.out.println("Enter the side of the rhombus : ");
                    double sideRhombus = in.nextDouble();
                    double sumofrhombus = 4 * sideRhombus;
                    System.out.println(" Perimeter of the rhombus : " + sumofrhombus);
                    break;
                case 7:
                    System.out.println("Exiting... ");
                    return;
                default:
                    System.out.println(" Invalid choice! Please select a valid option ");

            }
            System.out.println();
        }

    }
}
