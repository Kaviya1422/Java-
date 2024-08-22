package searching.examples;

public class EvenNUm {
    public static void main(String[] args) {

        int[] nums={12,345,21,16,345};
       //
        System.out.println(findNumbers(nums));
        //System.out.println(digits(5467));
        System.out.println(digits2(5467));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){ // for every num in nums  check if num is even then count++
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //to check whether a number contains even digits or not
    static boolean even( int num){
        int numOfDigits = digits(num);

        /*
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
         */

        return numOfDigits % 2 == 0;
    }

    //count num of digits in a number
    static int digits(int num){

        if(num < 0){                   //if the num is negative it make as positive
            num = num * -1 ;
        }

       if(num ==0){
           return 1;
       }
        int count =0;
        while(num > 0){
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }

    //second way to find number of digits
    static int digits2(int num){
        return  (int)(Math.log10(num)) + 1 ;
    }





}
