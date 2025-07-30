package KunalKushwahaAssignment.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode66 {
    public static void main(String[] args) {
        int[] array = {9};
        System.out.println(Arrays.toString(plusOne(array)));

    }
//    public static  int[] plusOne(int[] digits) {
//        int last = digits.length - 1;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = last; i >=0; i--) {
//            int chh = digits[i] + 1;
//            if(chh >= 10) {
//                while (digits[i] + 1 > 0) {
//                    int rem = chh % 10;
//                    list.addFirst(rem);
//                    chh /= 10;
//                }
//            }
//            else{
//                    list.addFirst(chh);
//                }
//        }
//        int[] ans = new int[list.size()];
//        for (int i = 0; i < ans.length; i++) {
//            if(i != ans.length-1){
//                ans[i] = list.get(i)-1;
//            }
//            else{
//                ans[i] = list.get(i);
//            }
//        }
//        return ans;
//    }
    public static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >=0 ; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length  + 1];
        result[0] = 1;
        return result;

    }
}
