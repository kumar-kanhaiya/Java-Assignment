package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1389 {
    // done with 100% beats
    public static void main(String[] args) {
        int[] array = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(array , index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(index[i] , nums[i]);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
