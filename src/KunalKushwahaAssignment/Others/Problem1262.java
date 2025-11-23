package KunalKushwahaAssignment.Others;

import java.util.Arrays;

public class Problem1262 {
    public static void main(String[] args) {
        int[] arr = {2,6,2,2,7};
        System.out.println(maxSumDivThree(arr));

    }

    // normal approach
    public static  int maxSumDivThree1(int[] nums) {
        int sum =0;
        int ans =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if((sum - nums[i]) %3 == 0 ){
                ans = Math.max(ans,sum-nums[i]);
            }
        }
        return ans;
    }

    //2nd approach
    public static int maxSumDivThree(int[] arr){
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        int ans = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if((sum-arr[i])%3 == 0 ){
                ans = Math.max(ans, sum - arr[i]);
            }

        }
        return ans;
    }
}
