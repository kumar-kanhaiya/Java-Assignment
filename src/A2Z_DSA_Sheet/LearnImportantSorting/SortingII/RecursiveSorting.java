package A2Z_DSA_Sheet.LearnImportantSorting.SortingII;

import java.util.Arrays;

public class RecursiveSorting {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before sorting ");
        System.out.println(Arrays.toString(arr));
        recursiveBubbleSort(arr,n);
        System.out.println("After sorting ");
        System.out.println(Arrays.toString(arr));

    }

    public static void recursiveBubbleSort(int[] array, int n) {
        // base condition
        if (n == 1) {
            return;
        }
        for (int i = 0; i <= n - 2; i++) {
            if (array[i] > array[i + 1]) {
                // take swap operation
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }

        }
        recursiveBubbleSort(array, n - 1);
    }

    // optimise approach
    public static void recursiveBubbleSort2(int[] array, int n) {
        // base condition
        if (n == 1) {
            return;
        }
        boolean isSwaped = false;
        for (int i = 0; i <= n - 2; i++) {
            if (array[i] > array[i + 1]) {
                // take swap operation
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                isSwaped = true;
            }

        }
        if(!isSwaped){
            return;
        }
        recursiveBubbleSort2(array, n - 1);
    }
}
