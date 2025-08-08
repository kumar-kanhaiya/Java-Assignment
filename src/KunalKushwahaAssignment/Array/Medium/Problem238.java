package KunalKushwahaAssignment.Array.Medium;

import java.util.*;

public class Problem238 {
    public static void main(String[] args) {
        int[] array = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(array)));

    }
    // good approach but time limit exceed 😒
//    public  static  int[] productExceptSelf(int[] nums) {
//        Queue<Integer> stack = new LinkedList<>();
//        int[] result = new int[nums.length];
//
//        for (int i = 0; i < nums.length ; i++) {
//            int ans = 1;
//            for (int j = 0; j < nums.length ; j++) {
//                if(i == j){
//                    continue;
//                }
//                ans *= nums[j];
//
//            }
//            stack.add(ans);
//        }
//        for (int i = 0; i < result.length ; i++) {
//            result[i] = stack.remove();
//        }
//        return result;
//    }
    // this is not o(n) method
    public  static  int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        int[] right = new int[nums.length];

        // input in left
        for (int i = 1; i < nums.length ; i++) {
            left[i] = left[i-1]  * nums[i-1];
        }
        // input in right
        right[nums.length - 1 ] = 1;
        for (int i = nums.length -2 ; i >= 0 ; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i <  ans.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
