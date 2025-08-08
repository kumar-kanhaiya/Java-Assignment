package KunalKushwahaAssignment.Array.Medium;

import java.util.Arrays;

public class problem75 {
    public static void main(String[] args) {
        int[] array = {2,0,2,1,1,0};
        sortColors(array);
        System.out.println(Arrays.toString(array));

    }
    // in this question 0 is denoted for red 1 is denoted for white
    // and 2 is denoted for blue
    public static void sortColors(int[] nums) {
        // this is done by sorting we use selection sort for this question
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = maxIndex(nums , 0 , last);
            swap(nums,maxIndex,last);
        }
    }
    public static int maxIndex(int[] array , int start , int end ){
        int maxIn = start;
        for (int i = 0; i <= end ; i++) {
            if(array[maxIn]< array[i]){
                maxIn = i;
            }
        }
        return maxIn;
    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
