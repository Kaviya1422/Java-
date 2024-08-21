package com.functionMethod;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swap {
//    public static void main(String[] args) {
//        String name = "Kaviya";
//        changeName(name);
//        System.out.println(name);
//    }
//    static void changeName(String name) {
//    name = "Nithish";
//    }
//   // pass by value
//    public static void main(String[] args) {
//        String name = "Kunal";
//        greet(name);
//       // System.out.println(naam); cannot use naam outside the function
//    }
//    static void greet(String naam) {
//        naam = "rahul"; //creating new object
//        System.out.println(naam);
//    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4,5 ,66};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
     nums[0] = 90; //if you make a change to the object via this reference varaiable , same object will be changed
        
    }


}
