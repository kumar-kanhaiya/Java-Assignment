package KunalKushwahaAssignment.Others;

import java.util.*;

public class Problem961 {
    static void main() {
        int[] arr = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(arr));

    }

    public static int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);

        int firstIndex = 0;
        int secondIndex = 0;
        int n = (nums.length-1)/2;

        for (int i = 1; i <nums.length; i++) {
            if(nums[i] == nums[i-1]){
                firstIndex = i;
                int j = i;
                while(j< nums.length && nums[i] == nums[j]){
                    j++;
                }
                if(j - i == n){
                    return nums[i];
                }
            }
        }
        return -1;
    }


}
