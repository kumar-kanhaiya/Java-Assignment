package StriversSheet.Step2Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        int[] ans = sorting(array);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] sorting(int[] array ){
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(array[j-1] < array[j]){
                    break;
                }
                if(array[j] < array[j-1]){
                    swap(array , j , j-1);
                }
            }
        }
        return array;
    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
