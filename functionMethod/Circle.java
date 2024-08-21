package com.functionMethod;

import java.util.Scanner;

public class Circle {
    static double area(double radius){
        double ans = 3.14 * radius * radius;
        return ans;
    }
    static double circumference(double radius){
        double ans = 2 * 3.14 * radius ;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius");
        double radius = in.nextDouble();

        double area = area(radius);
        double circumference = circumference(radius);

        System.out.printf("The circumference of the circle is: %.2f and the area of the circle is: %.2f%n", circumference(radius), area(radius));


    }
}
