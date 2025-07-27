package KunalKushwahaAssignment.Array.Easy;

import java.util.Arrays;

public class leetcode1480 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(array)));

    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int j = 0;
            int sum = 0;
            while(j<i){
                sum += nums[j];
                j++;
            }
            ans[i] = nums[i] + sum;
        }
        return ans;
    }
    public static int[] runningSum2(int[] nums) {
        for(int i = 1; i < nums.length;i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
