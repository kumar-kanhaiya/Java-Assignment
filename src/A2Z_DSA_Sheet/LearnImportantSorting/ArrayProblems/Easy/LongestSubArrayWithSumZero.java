package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

public class LongestSubArrayWithSumZero {
    static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
//        System.out.println(longestSubArray(arr));
        System.out.println(longestSubArrayOptimalApproach(arr));

    }

    // first approach
    public static int longestSubArray(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length ; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == 0){
                    ans = Math.max(ans , j-i+1);
//                    break;
                }
            }
        }
        return ans;
    }

    // optimal approach
    public static int longestSubArrayOptimalApproach(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLen =0;
        while(right< n){
            // first case
            // left shift if the sum is grater
            if(left <= right && sum > 0){
                sum -= arr[left++];
            }

            // second case
            // if we found the required sum
            if(sum == 0){
                maxLen = Math.max(maxLen,right-left+1);
            }

            // third condition
            // shift the right pointer
            right++;
            if(right<n){
                sum += arr[right];
            }
        }
        return maxLen;
    }
}
