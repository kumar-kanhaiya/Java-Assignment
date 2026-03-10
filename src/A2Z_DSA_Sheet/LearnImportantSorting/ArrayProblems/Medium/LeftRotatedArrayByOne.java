package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.Arrays;

public class LeftRotatedArrayByOne {
    static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));


    }
    //  arr = [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]
    public static void rotate1(int[] arr, int k) {
        while(k != 0){
            int last = arr[arr.length-1];
            int prev =arr[0];
            for (int i = 1; i < arr.length ; i++) {
               int temp = arr[i];
               arr[i] = prev;
               prev = temp;
            }
            arr[0] = last;
            k--;
            System.out.println(Arrays.toString(arr));
        }
    }

    // second approach
    public static void rotate(int[] arr, int k){
        k = k % arr.length;
        helper(arr,0,arr.length-1); // complete reverse
        helper(arr,0,k-1); // left side reverse means set the left side
        helper(arr,k,arr.length-1); // right side reverse make in required form

    }
    public static void helper(int[] arr , int start , int end){
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =  temp;
            start++;
            end--;
        }

    }


}
