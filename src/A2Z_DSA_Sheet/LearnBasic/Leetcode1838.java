package A2Z_DSA_Sheet.LearnBasic;

import java.util.Arrays;

public class Leetcode1838 {
    static void main() {

    }

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        long total = 0;
        int result = 0;
        for(int right = 0 ; right < n ; right++ ){
            total += nums[right];
            while((long) nums[right] * (right - left +1) - total > k){
                total -= nums[left];
                left++;
            }
            result = Math.max(result , right - left + 1);
        }
        return result;
    }
}
