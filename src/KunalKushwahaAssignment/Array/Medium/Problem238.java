package KunalKushwahaAssignment.Array.Medium;

import java.util.*;

public class Problem238 {
    public static void main(String[] args) {
        int[] array = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(array)));

    }
    public  static  int[] productExceptSelf(int[] nums) {
        Queue<Integer> stack = new LinkedList<>();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            int ans = 1;
            for (int j = 0; j < nums.length ; j++) {
                if(i == j){
                    continue;
                }
                ans *= nums[j];

            }
            stack.add(ans);
        }
        for (int i = 0; i < result.length ; i++) {
            result[i] = stack.remove();
        }
        return result;
    }
}
