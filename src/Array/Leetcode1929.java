package Array;

import java.util.Arrays;

public class Leetcode1929 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(secondMethod(array)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] newArray = new int[2*nums.length];
        for (int i = 0; i < newArray.length ; i++) {
            if(i >= nums.length){
                newArray[i] = nums[i - nums.length];
            }
            else{
                newArray[i] = nums[i];
            }
        }
        return newArray;
    }
    public static int[] secondMethod(int[] array){
        int n = array.length;
        int[] ans = new int[2*n];
        for (int i = 0; i <n ; i++) {
            ans[i] = ans[i+ n ] = array[i];
        }
        return ans;
    }
}
