package KunalKushwahaAssignment.Array;

import java.util.Arrays;

public class leetcode1920 {
    public static void main(String[] args) {
    int[] array = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(array)));
    }
    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int check = nums[i];
            for (int j = 0; j < nums.length ; j++) {
                if(check == j){
                    ans[i] = nums[j];
                }
            }
        }
        return ans;
    }
}
