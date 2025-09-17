package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem977 {
    public static void main(String[] args) {
        int[] array = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(array)));

    }
    public static int[] sortedSquares(int[] nums) {
        positiveElement(nums);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = (int)Math.pow(nums[i],2);
        }
        return nums;
    }
    public static void positiveElement(int[] array){
        for (int i = 0; i < array.length ; i++) {
            array[i] = Math.abs(array[i]);
        }
    }
}
