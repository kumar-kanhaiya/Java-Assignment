package KunalKushwahaAssignment.Searching.Medium;

import java.util.Arrays;

public class Problem1011 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(array,5));

    }
    // array is already sorted
    // so we use binary search for this problem also it is done with the help of sliding window
        public static int shipWithinDays(int[] weights, int days) {
    //        Arrays.sort(weights);

    //        Arrays.sort(weights);
            int start = max(weights);
            int end = 0;
            for (int i = 0; i < weights.length ; i++) {
                end += weights[i];
            }

            while(start <= end){
                int mid = start + (end - start)/2;
                int noOfDays = noOfDays(weights , mid);
                if(noOfDays <= days){
                    end = mid - 1 ;
                }
                else{
                    start = mid +1;
                }

            }
            return start;

        }

        public static int noOfDays(int[] weights , int capacity){
            int day = 1;
            int load = 0;
            for (int i = 0; i < weights.length; i++) {
                if(load + weights[i] > capacity){
                    day = day + 1;
                    load = weights[i];
                }
                else{
                    load += weights[i];
                }
            }
            return day;
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
