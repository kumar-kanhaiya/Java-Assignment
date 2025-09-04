package KunalKushwahaAssignment.Searching.Medium;

import java.util.Arrays;

public class Problem1818 {
    public static void main(String[] args) {
        int[] array = {5,8,9,45,7,8,5,2,2};
        sorting(array);
        System.out.println(Arrays.toString(array));

    }
//    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//
//    }

    public static void sorting(int[] array){
        int start = 0;
        int n = array.length;
        while(start < n -1){
            int end = n - start - 1;
            int max = maxIndex(array , 0 , end);
            int temp = array[end];
            array[end] = array[max];
            array[max] = temp;
            start++;

        }
    }
    public static int maxIndex(int[] array , int start , int end ){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(array[max] < array[i]){
                max = i;;
            }
        }
        return max;
    }
}
