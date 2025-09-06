package KunalKushwahaAssignment.Searching.Medium;

import java.util.Arrays;

public class Problem1011 {
    public static void main(String[] args) {

    }
    // array is already sorted
    // so we use binary search for this problem also it is done with the help of sliding window
    public int shipWithinDays(int[] weights, int days) {
//        Arrays.sort(weights);
//        int day = 0;
//        int load = 0;
//        for (int i = 0; i < weights.length; i++) {
//            if(load + weights[i] > capacity){
//                day = day + 1;
//                load = weights[i];
//            }
//            else{
//                load += weights[i];
//            }
//        }
//        return day;
        Arrays.sort(weights);
        int start = max(weights);
        int end = 0;
        for (int i = 0; i < weights.length ; i++) {
            end += weights[i];
        }

        while(start <= end){

        }

    }
    public static int max(int[] array ){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
