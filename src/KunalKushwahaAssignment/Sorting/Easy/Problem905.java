package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem905 {
    public static void main(String[] args) {
        int[] array = {0};
        System.out.println(Arrays.toString(sortArrayByParity(array)));

    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] %2 ==0){
                ans[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] %2 !=0){
                ans[index] = nums[i];
                index++;
            }
        }
        return ans;

    }
}
