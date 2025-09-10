package KunalKushwahaAssignment.Sorting.Revision;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,2};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
    // in the selection sort select an element and put it on its correct position

    public static void selectionSort(int[] array ){
        int n = array.length;
        int i = 0;
        while(i<n){
            int maxIndex = maxIndex(array , 0 , n - i - 1);
            int temp = array[n-i-1];
            array[n-i-1] = array[maxIndex];
            array[maxIndex] = temp;
            i++;
        }

    }
    public static int maxIndex(int[] array , int start , int end){
        int MaxIndex = start;
        for (int i = start; i <=end ; i++) {
            if(array[MaxIndex] < array[i]){
                MaxIndex = i;
            }
        }
        return MaxIndex;
    }
    public static void selectionSort2(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

}
