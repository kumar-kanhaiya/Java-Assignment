package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.Arrays;

public class RearrangeArrayElementBySign {
    static void main() {
        int[] arr = {-1,1};
        System.out.println(Arrays.toString(rearrangeArray(arr)));

    }
    public static int[] rearrangeArray1(int[] nums) {
        int[] negative = new int[nums.length/2];
        int[] positive = new int[nums.length/2];
        int left = 0 , right = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i< nums.length/2){
                negative[left++] = nums[i];
            }
            else{
                positive[right++] = nums[i];
            }
        }
        left = 0;
        right = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            if(i%2 == 0){
                ans[i] = positive[right++];
            }
            else{
                ans[i] = negative[left++];
            }
        }
        return ans;
    }

    public static int[] rearrangeArray(int[] arr){
        int[] ans = new int[arr.length];
        // fill positive at even place
        int positive = 0;
        int negative = 1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < 0){
                ans[negative] = arr[i];
                negative +=2;
            }
            else{
                ans[positive] = arr[i];
                positive +=2;
            }
        }
        return ans;
    }
}
