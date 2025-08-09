package KunalKushwahaAssignment.Searching;

import java.util.Arrays;

public class Problem167 {
    public static void main(String[] args) {
        int[] array = {-1,0};
        System.out.println(Arrays.toString(helper(array,0,-1)));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = array.length;
        while(start <= end){
            int mid = start  + (end - start)/2;
            if(array[mid] + array[check] == target){
                // we find our ans
                return new int[]{check+1 , mid+1};
            }
            else if(array[mid] + array[check] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
    }
    public static int[] helper(int[] array , int check , int target ){
        int start = 0;
        int end = array.length;
        while(start <= end){
            int mid = start  + (end - start)/2;
            if(array[mid] + array[check] == target){
                // we find our ans
                return new int[]{check+1 , mid+1};
            }
            else if(array[mid] + array[check] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
