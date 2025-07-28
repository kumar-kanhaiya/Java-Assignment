package KunalKushwahaAssignment.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode1389 {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(array,index)));

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        // by using array list ;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(index[i] , nums[i]);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length ; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
