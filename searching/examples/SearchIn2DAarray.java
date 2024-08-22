package searching.examples;

import java.util.Arrays;

public class SearchIn2DAarray {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,19}
        };
//        int target = 9;
//        int[] ans = search(arr,target);                      //formate of return value { row , col
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
 // minimum
    static int[] search(int[][] arr , int target){
        for(int row =0; row < arr.length; row++){
            for(int col=0; col < arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row , col};
                }
            }
        }
        return new int[]{-1,-1};
    }
//maximum
static int max(int[][] arr ){
        //int max =0;
    int max = Integer.MIN_VALUE; // Integer.MIN_VALUE is storing the lowest integer
    for(int row =0; row < arr.length; row++){
        for(int col=0; col < arr[row].length;col++){
            if(arr[row][col] > max){
                 max = arr[row][col];
            }
        }
    }
    return max;
}

}
