package StriversSheet.Step2Sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
    public static int[] bubbleSort(int[] array ){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length -1  ; j++) {
                if(array[j] < array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        return array;
    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
