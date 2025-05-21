package Array;

import java.util.Arrays;

public class Leetcode1470 {
    // not complete
    public static void main(String[] args) {
        int[] array = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(array , 3)));
    }
    public static int[] shuffle(int[] array, int target) {
        int[] newArray = new int[array.length];
        int targetIndex = targetIndex(array , target);
        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array[array.length - i - 1];
        }
        return newArray;
    }
    public static int targetIndex(int[] array , int target ){
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
}
