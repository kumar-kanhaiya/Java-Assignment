package A2Z_DSA_Sheet.LearnImportantSorting.SortingI;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr = {13,46,24,52,20,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    // normal approach
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            int min = minimumNumberIndex(arr,i,arr.length);
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min] = temp;
        }

    }
    public static int minimumNumberIndex(int[] arr , int start , int end){
        int min = start;
        for (int i = start+1; i < end ; i++) {
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }
}
