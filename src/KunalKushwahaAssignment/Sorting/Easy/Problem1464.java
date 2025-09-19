package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem1464 {
    public static void main(String[] args) {
        int[] array = {3,7};
        System.out.println(maxProduct(array));

    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <1){
            return nums[0] - 1;
        }
        int first = (nums[0]-1)*(nums[1]-1);
        int second = (nums[nums.length-1] - 1)*(nums[nums.length-2]-1);
        return Math.max(first,second);
    }
}
