package searching.examples;

public class SearchInRange {
    public static void main(String[] args) {
    int[] arr ={ 2,3,4,5,6,78,9};
    int target = 6;
        System.out.println(linearSearch(arr,target,2,6));
    }
    static  int linearSearch(int[] arr , int target , int start , int end){
        if(arr.length == 0) {
            return -1;
        }
        for(int index = start; index < end ; index++ ){
            //check every element if the index is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        return -1;
    }

}
