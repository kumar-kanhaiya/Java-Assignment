package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.HashMap;

public class LengthOfLongestSubArrayWithZeroSum {
    static void main(String[] args) {

    }

    // first and brute force approach
    public static int longestSubArray1(int[] arr){
        // we can do this question with the help of 2 for loop
        // first loop
        int ans = 0;
        for (int i = 0; i < arr.length ; i++) {
            int sum = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                // condition check
                if(sum == 0){
                    ans = Math.max(ans , j - i + 1);
                }
                sum += arr[j];
            }
        }
        return ans;
    }

    // second and optimal approach
    public static int longestSubArray2(int[] arr){
        int n = arr.length;
        int left = 0 , right = 0 , maxLen = 0 , sum = arr[0];
        // while condition
        while(right<n){
            // first condition check for the sum
            // in this condition we check whether the sum is greater than the zero or not
            if(left<right && sum > 0){
                sum -= arr[left++]; // also increment the left
            }
            // second condition in this condition
            // we check whether the sum is zero or not
            if(sum == 0){
                maxLen = Math.max(maxLen , right - left + 1);
            }

            right++;
            // now check the condition if right is less than the arr.length or not
            // if it satisfy the condition then after that we add arr[right] in the sum
            if(right < n){
                sum += arr[right];
            }
        }
        return maxLen;
    }

    // this problem can be done using hashing
    public static int longestSubArray3(int[] arr){
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == 0){
                maxLen = i+1;
            }
            // if the sum is seen before
            else if(map.containsKey(sum)){
                maxLen = Math.max(maxLen ,i- map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    // some more optimal approach
    public static int longestSubArray4(int[] arr){
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            // check if the sum is equal to zero or not
            if(sum == 0){
                maxLen = i+1;
            }
            else{
                // check the subarray is present previous or not
                if(map.containsKey(sum)){
                    maxLen = Math.max(maxLen , i- map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxLen;
    }
}
