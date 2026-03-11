package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

import java.util.Arrays;

public class MoveZeroes {
    static void main( String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes1(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != 0){
                ans[index++] = nums[i];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
    }

//    2nd approach
    public static void moveZeroes1(int[] array){
        int i = 0;
        for (int j = 0; j < array.length ; j++) {
            if(array[j]!= 0){
                swap(array,i,j);
                i++;
            }
        }

    }
    public static void swap(int[] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
