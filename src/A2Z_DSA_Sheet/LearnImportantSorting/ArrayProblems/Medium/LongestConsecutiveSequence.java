package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive2(arr));

    }
    // first approach simple sort the array and count the number consecutive number
    public static int longestConsecutive(int[] arr){
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length ; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] == arr[j-1] +1){
                    count++;
                    i = j;
                }
                else {
                    break;
                }
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }

    // second approach which is more optimal than first one
    public static int longestConsecutive1(int[] arr){
        int n = arr.length;

        if(n == 0){
            return 0;
        }
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;

        int cnt = 0;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            // Case 1: Current element is exactly one greater than lastSmaller → part of sequence
            if (arr[i] - 1 == lastSmaller) {
                // Increment the sequence length
                cnt += 1;
                // Update the last smaller element
                lastSmaller = arr[i];
            }
            // Case 2: Current element is not consecutive and not a duplicate
            else if (arr[i] != lastSmaller) {
                // Reset the sequence length count to 1
                cnt = 1;
                // Update the last smaller element
                lastSmaller = arr[i];
            }
            // Update the longest sequence length if the current sequence is longer
            longest = Math.max(longest, cnt);
        }

        // Return the length of the longest consecutive sequence
        return longest;
    }
    // optimal approach

    public static int longestConsecutive2(int[] arr){
        int n = arr.length;
        if(n==0){
            return 0;
        }
        int longest =1 ;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for(int i : arr){
            // if there is no number before i then it is the starting point
            if(!set.contains(i -1)){
                int count = 1;
                int x = i;
                // checking for the next consecutive numbers
                while(set.contains(x+1)){
                    count++;
                    x = x+1;
                }
                longest = Math.max(longest , count);
            }
        }
        return longest;
    }

}
