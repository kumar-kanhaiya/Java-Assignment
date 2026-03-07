package A2Z_DSA_Sheet.LearnImportantSorting.SortingII;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args){
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before sorting ");
        System.out.println(Arrays.toString(arr));
        recursiveInsertionSort(arr,0,n);
        System.out.println("After sorting ");
        System.out.println(Arrays.toString(arr));
    }

    static void recursiveInsertionSort(int[] arr , int i , int n){
        // base condition
        if(i == n){
            return;
        }
        int j = i;
        while(j>0 && arr[j]<arr[j-1]){
            // take swap operation
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursiveInsertionSort(arr,i+1,n);
    }
}
