package com.arraysexamples;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 9};
//        swap(arr , 1, 3);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index1 ,int index3){
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }

    //reverse this array
    static void reverse(int[]arr ){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            //swap
            swap(arr, start , end);
            start++;
            end--;
        }
    }





}
