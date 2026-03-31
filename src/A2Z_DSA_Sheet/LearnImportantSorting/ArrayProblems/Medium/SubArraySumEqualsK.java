package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.HashMap;

public class SubArraySumEqualsK {
    static void main(String[] args) {
        int[] arr = {1,-1,0};
        System.out.println(subarraySum2(arr,0));

    }

    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = 0;
        int ans = 0;
        int sum = arr[0];
        while(left<n && right<n){
            // first condition
            while(left<= right && sum>k){
                sum -= arr[left];
                left++;
            }

            // second case if the consecutive sum is equal to the k
            if(sum == k){
                ans++;
            }

            // expand the right window
            right++;
            if(right<n){
                sum+= arr[right];
            }
        }
        // last case
        if(arr[arr.length-1] == k){
            ans++;
        }
        return ans;
    }

    public static int subarraySum2(int[] arr , int k){
        int ans = 0;
        for (int i = 0; i < arr.length ; i++) {
            int sum = 0;
            for (int j = i; j <arr.length ; j++) {
                sum+= arr[j];
                if(sum == k){
                    ans++;
                }
            }
        }
        return ans;
    }

    //very optimal approach
    public int subarraySum3(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for(int num: nums){
            sum+= num;

            count += map.getOrDefault(sum-k, 0);
            map.merge(sum, 1, Integer::sum);
        }

        return count;
    }
}
