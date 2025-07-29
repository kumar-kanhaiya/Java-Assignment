package KunalKushwahaAssignment.Array.Easy;

import java.util.ArrayList;

public class leetcode26 {
    public static void main(String[] args) {
        int[] array = {1,1,2};
        System.out.println(removeDuplicates(array));

    }
    public static int removeDuplicates(int[] nums) {
        int[] ans = helper(nums);
        for (int i = 0; i < ans.length ; i++) {
            nums[i] = ans[i];
        }
        for (int i = ans.length; i < nums.length; i++) {
            nums[i] = 0;
        }

        return ans.length;
    }
    public static int[] helper(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] != nums[i-1]){
                list.add(nums[i]);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length ; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}
