package searching.examples;

public class example {

    public static void main(String[] args) {
        int[] nums = {1, 22, 34, -2, 56, 8, 9};
        int target = 56;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

//    //search the target and return the  element
//    static int linearSearch2(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        //run a for loop
//        for (int element : arr) {
//            //check every elemt if the index is = target
//            if (element == target) {
//                return element;
//            }
//        }
//        return Integer.MAX_VALUE;
//    }

//   //search in the array : return the index if item fount
//    //if item not fount return -1
    static  int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        //run a for loop
        for(int index = 0; index < arr.length ; index++ ){
            //check every element if the index is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //this line execute if none of the return statement above have executed
        // when target not found it will return -1
        return -1;
    }



}
