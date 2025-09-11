package KunalKushwahaAssignment.Sorting.Revision;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {14,9,15,12,6,8,13};
        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void insertionSort(int[] array ){
        for (int i = 0; i <= array.length - 1 ; i++) {
            int j = i;
            while(j>0 && array[j-1]>array[j]){
                swap(array,j-1,j);
                j--;
            }

        }
    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] =temp;
    }
}
