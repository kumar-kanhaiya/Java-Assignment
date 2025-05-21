package Array;

import java.util.Arrays;

public class Leetcode1365 {
    public static void main(String[] args) {
        int[] array = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array)));
    }
    public static int[] smallerNumbersThanCurrent(int[] array) {
        int[] ans = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            int count = 0 ;
            for (int j = 0; j < array.length ; j++) {
                if(array[i] > array[j]  ){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
