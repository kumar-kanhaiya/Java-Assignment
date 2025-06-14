package StriversSheet.Step2Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {7,4,1,5,3};
        bubbleSort(array);
    }
    public static void bubbleSort(int[] array ){
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j < array.length - i - 1 ; j++) {
                if(array[j+1] < array[j]){
                    swap(array,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
