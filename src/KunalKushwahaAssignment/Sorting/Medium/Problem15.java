package KunalKushwahaAssignment.Sorting.Medium;

import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        int[] array = {-1,0,1,2,-1,-4};
        System.out.println(threeSum2(array));

    }

    // this approach takes time limit exceeded problem
    public static List<List<Integer>> threeSum(int[] arr) {
        // normal approach
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int k = j+1;
                while(k< arr.length){
                    if(arr[k] + arr[j] == -(arr[i]) ){
                        List<Integer> check = new ArrayList<>();
                        check.add(arr[i]);
                        check.add(arr[j]);
                        check.add(arr[k]);
                        set.add(check);
                    }
                    k++;
                }
            }
        }
        ans.addAll(set);
        return ans;
    }

    // second approach some optimized code
    public static List<List<Integer>> threeSum2(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        // we need to decrease the number of loop operation for optimized code
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int target = -(arr[i] + arr[j]);
                int k = binarySearch(arr, target, j + 1, arr.length - 1);
                if (k != -1) {
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    set.add(triplet);
                }
            }
        }
        ans.addAll(set);
        return ans;
    }
    public static int binarySearch(int[] array , int target , int start , int end){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
