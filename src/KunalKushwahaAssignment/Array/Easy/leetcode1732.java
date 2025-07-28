package KunalKushwahaAssignment.Array.Easy;

import java.util.Arrays;

public class leetcode1732 {
    public static void main(String[] args) {
        int[] array = {-5,1,5,0,-7};
        System.out.println(largestAltitude(array));

    }
    public static int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length + 1];
        ans[0] = 0;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1] + gain[i-1];

        }
        return helper(ans);
    }
    public static int helper(int[] array ){
        int max = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
