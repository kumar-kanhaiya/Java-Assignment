package Array;

import java.util.Arrays;

public class LeetcodeProblem1920 {
    public static void main(String[] args) {
        int[] array = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(array)));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0 ; i< nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
