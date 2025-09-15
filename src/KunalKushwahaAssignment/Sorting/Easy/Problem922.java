package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem922 {
    public static void main(String[] args) {
        int[] array = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(array)));

    }
    public static int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];

        int evenindex = 0;
        // fill even element in even place
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] %2==0 ){
                ans[evenindex] = nums[i];
                evenindex += 2;
            }
        }
        // fill odd element in odd place
        int s = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] %2 !=0 ){
                ans[s] = nums[i];
                s +=2;
            }
        }
        return ans;

    }
}
