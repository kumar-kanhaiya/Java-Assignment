package KunalKushwahaAssignment.Searching.Medium;

import java.util.Arrays;

public class Problem1838 {
    public static void main(String[] args) {
        int[] arr= {1,2,5,6,8,9,4,5,63,0};
        sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    public int maxFrequency(int[] arr, int k) {
        // this problem is done with the help of sliding window
        sorting(arr);
//        Arrays.sort(arr);
        int l = 0;
        long sum = 0;
        int result = 0;

        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];

            // calculate cost: make all numbers in [l..r] equal to arr[r]
            while ((long) arr[r] * (r - l + 1) - sum > k) {
                sum -= arr[l];  // shrink from left
                l++;
            }

            result = Math.max(result, r - l + 1);
        }

        return result;
    }
    public static void sorting(int[] array ){
        int start = 0;
        int end = array.length;
        while(start <= end-1){
            int maxIndex = maxIndex(array , 0 , end - start -1);
            int temp = array[end - start - 1];
            array[end - start - 1] = array[maxIndex];
            array[maxIndex] = temp;
            start++;
        }

    }
    public static int maxIndex(int[] array , int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
}
