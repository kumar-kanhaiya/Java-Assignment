package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.Arrays;

public class SortColor {
    static void main() {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sortColors(int[] nums) {
        for(int i = 0 ; i< nums.length ; i++){
            int last = nums.length - i -1;
            int max = maxIndex(nums, 0 , last);
            swap(nums,max, last);
        }

    }

    public static int maxIndex(int[] arr, int start , int end){
        int max = start;
        for(int i = 0 ; i <= end ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
