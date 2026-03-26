package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.Arrays;

public class NextPermutation {
    static void main() {
        int[] arr = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }

    // brute force approach
    // generate all the permutation -> generate using recursion
    // linear search and find where it is lie
    // then if it is find return next one is the answer
    // if it is  found at last then return the first one

    public static void nextPermutation(int[] arr) {
        // first we have to find the longest path
        int index = -1;
        int n = arr.length;
        for (int i = n-2; i >= 0 ; i--) {
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        // check the edge cases
        if(index == -1){
            reverse(arr , 0 , n-1);
            return;
        }

        // now we have h task to swap the number which is greater than index
        for(int i =  n-1 ; i >= index ; i--){
            if(arr[i] > arr[index]){
                // simply swap that element
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        // now reverse the next elements
        reverse(arr , index+1 , n-1);
    }

    public static void reverse(int[] arr , int start , int end ){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
