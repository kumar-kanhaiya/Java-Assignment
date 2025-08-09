package KunalKushwahaAssignment.Searching;

import java.util.Arrays;

public class Problem167 {
    public static void main(String[] args) {
        int[] array = {0,0,1,2};
        System.out.println(Arrays.toString(twoSum(array,0)));

    }
    public static int[] twoSum(int[] array, int target) {
        int start = 0;
        int end = array.length;
        while(start <= end){
            int mid = start  + (end - start)/2;
            if(array[mid] + array[start] == target){
                // we find our ans
                return new int[]{start+1 , mid+1};
            }
            else if(array[mid] + array[start] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }


}
