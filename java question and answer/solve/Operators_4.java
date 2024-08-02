package com.solve;

import java.util.Scanner;

public class Operators_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        float num1 = in.nextInt();

        System.out.println("Enter second number : ");
        float num2 = in.nextInt();

        System.out.println("Enter the Operator ( + , - , * , / ) : ");
        char operator = in.next().charAt(0);

        double sum;

        if (operator == '+'){
            sum = num1 + num2;
            System.out.println(" The result of "+ num1 + " + " + num2 + " is " + sum );
        } else if (operator == '-'){
            sum = num1 - num2;
            System.out.println("The result of the num is " + sum + " ");
        }else if (operator == '*'){
            sum = num1 * num2;
            System.out.println("The result of the numbers is " + sum + " ");
        } else if(operator == '/') {
            sum = num1 / num2;
            System.out.println("The Result of the num is " + sum + " ");
        }else {
            System.out.println("Error : Invalid operator");
        }

    }
}
