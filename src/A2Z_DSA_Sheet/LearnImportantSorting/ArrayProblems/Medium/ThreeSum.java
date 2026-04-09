package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.*;

public class ThreeSum {
    static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum1(arr));

    }
    // first normal and brute force approach
    public static List<List<Integer>> threeSum1(int[] arr) {
//        List<List<Integer>> ans = new ArrayList<>();
        // we have to solve this problem by using three loops
        // store in the set
        Set<List<Integer>> st = new HashSet<>();
        // first loop
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length ; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        // Store sorted triplet to avoid duplicates
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }

        }
        return new ArrayList<>(st);
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

    public static List<List<Integer>> threeSum2(int[] arr){
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // new hashset
            Set<Integer> hashset = new HashSet<>();
            for (int j = i+1; j < arr.length ; j++) {
                int third = -(arr[i] + arr[j]);
                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i] , arr[j] , third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        return new ArrayList<>(ans);
    }

    // approach with using binary search
    public static List<List<Integer>> threeSum3(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        // sort the array
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int target = -(arr[i] + arr[j]);
                int k = binarySearch(arr , target , j+1 , arr.length -1);
                if(k!= -1){
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    set.add(triplet);
                }
            }

        }
        ans.addAll(set);
        return ans;
    }

    public static int binarySearch(int[] arr , int target , int start , int end){
        while(start<= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }

}
