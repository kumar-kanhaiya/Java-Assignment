package Array;

import java.util.Arrays;

public class Leetcode1480 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(array)));

    }
    public static int[] runningSum(int[] nums) {
        int[] newArray = new int[nums.length];
        for(int i = 0 ;i < newArray.length ; i++){
            if(i == 0){
                newArray[0] = nums[0];
            }
            else{
                newArray[i] = nums[i] + newArray[i-1];
            }
        }
        return newArray;
    }
}
