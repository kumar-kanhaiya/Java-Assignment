package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));

    }
    // first normal and brute force approach
    public static List<List<Integer>> threeSum1(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        // we have to solve this problem by using three loops
        // first loop
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length ; k++) {
                    List<Integer> check = new ArrayList<>();
                    if(arr[i] + arr[j] + arr[k] == 0){
                        check.add(arr[i]);
                        check.add(arr[j]);
                        check.add(arr[k]);
                    }
                    if(check.size() > 1){
                        ans.add(check);
                    }
                }
            }

        }
        return ans;
    }

    // second approach
    public static List<List<Integer>> threeSum(int[] arr){
        // first sort the array
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            List<Integer> check = new ArrayList<>();
            int[] checkarr = helper(arr , i+1 , -arr[i]);
            if(checkarr[0] != -1 && checkarr[1] != -1){
                check.add(arr[i]);
                check.add(checkarr[0]);
                check.add(checkarr[1]);
                ans.add(check);
            }
        }
        return ans;

    }
    // two sum approach
    public static int[] helper(int[] arr , int start  , int target){
        int[] ans = {-1 , -1};
        for (int i = start; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] + arr[j] == target){
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                }
            }
        }
        return ans;
    }
}
