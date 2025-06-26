package StriversSheet.Step2Sorting;


import java.util.Arrays;
// Selection sort

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {7,4,1,5,3};
//        int[] newArray = selectionSort(array);
//
        selectionSort(array);
    }
    public static void selectionSort(int[] array ){
        for (int i = 0; i < array.length ; i++) {
            int last = array.length - i - 1;
            int maxIndex = getMaxIndex(array , 0 , last);
            swap(array, maxIndex , last);
        }
        System.out.println(Arrays.toString(array));
    }
    public static int getMaxIndex(int[] array , int start , int end ){
        int max = start;
        for (int i = start; i < end ; i++) {
            if(array[i] > array[max]){
                max = i;
            }

        }
        return max;
    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
