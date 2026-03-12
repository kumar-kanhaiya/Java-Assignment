package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

public class LongestSubArrayWithGivenSumK {
    static void main(String[] args) {
        int[] nums = {-3,2,1};
        System.out.println(longestSubArrayLength(nums,15));
        System.out.println(longestSubArrayLen(nums,6));
    }

    // first approach
    public static int longestSubArrayLength(int[] arr , int k ){
        int ans = 0;
        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int j = i; j < arr.length ; j++) {
                count += arr[j];
                if(count == k){
                    ans = Math.max(ans,(j+1-i));
                    break;
                }
            }
        }
        return ans;
    }

    // optimal approach
    public static int longestSubArrayLen(int[] arr , int k){
        int n = arr.length;
        int maxLen = 0;
        int left = 0 , right = 0;
        int sum = arr[0];
        while(right < n){
            // first condition
            if(left<= right && sum > k){
                // shift the left
                sum -= arr[left];
                left++;
            }

            // second condtion
            // update the maxLen if sum is equal
            if(k == sum){
                maxLen = Math.max(maxLen,right-left+1);
            }

            // third condition
            // expand the window to right
            right++;
            if(right<n){
                sum += arr[right];
            }

        }
        return maxLen;
    }
}
