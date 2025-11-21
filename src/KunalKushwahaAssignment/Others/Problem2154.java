package KunalKushwahaAssignment.Others;

import java.util.Arrays;
import java.util.HashSet;

public class Problem2154 {
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,12};
        System.out.println(findFinalValue1(arr,3));

    }
    public static int findFinalValue(int[] nums, int original) {
        int ans = original;
        Arrays.sort(nums);
        while(true){
            if(!binarySearch(nums,original)){
                break;
            }
            else {
                ans = original*2;
                original = original*2;
            }
        }
        return ans;

    }

    public static boolean binarySearch(int[] arr , int target ){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return true;
            }
            else if (arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }

    // approach 2  optimise solution
    public static int findFinalValue1(int[] nums, int original){
        HashSet<Integer> set = new HashSet<>();
        for(int num :nums){
            set.add(num);
        }

//        int ans = original;
        while(set.contains(original)){
            original = original*2;
        }
        return original;
    }
}
