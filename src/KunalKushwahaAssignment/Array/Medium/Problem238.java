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
    public  static  int[] productExceptSelf(int[] nums){
        int i = 0 ;
        int[] ans = new int[nums.length];
        while(i< nums.length){
            int left = 1;
            int right = 1;
            // multiply left item
            for (int j = 1; j < nums.length ; j++) {
                left *= nums[j-1];
            }
            ans[i] = left*right;
            i++;
        }
        return ans;
    }
}
