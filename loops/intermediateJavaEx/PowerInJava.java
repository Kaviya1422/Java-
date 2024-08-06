package com.loops.intermediateJavaEx;

public class PowerInJava {
    // Math.pow()
    // result = Math.pow(base , exponent)
    // base = the base num to be raised to the power
    // exponent = the exponent indicating the power to which the base is raised
    public static void main(String[] args) {
        int  base = 5;
        int exponent = 3;

        double result = Math.pow(base , exponent);

        System.out.println( base + " rasied to the power of " + exponent + " is " + result  );
    }

}
