package com.solve;

import java.util.Scanner;

public class Palindrome_8 {

    public static boolean isPalindrome(String s){
        //Normalize the string ://convert tp lowercase and remove non-alphanumeric character
        String normalizeStr = s.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();

        //check if the normalized string is equal to its reverse
        String reversedStr = new StringBuilder(normalizeStr).reverse().toString();
        return normalizeStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = in.nextLine();

        //check if the input string is a palindrome
        boolean result = isPalindrome(input);

        //o/p
        if(result){
            System.out.println("\" " + input + "\" is a palindrome. ");
        }else{
            System.out.println("\" " + input + "\" is not a palindrome ");
        }

    }
}
