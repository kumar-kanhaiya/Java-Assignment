package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem1112 {
    public static void main(String[] args) {

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        // sort the arr1
        Arrays.sort(arr1);
        // sort according the arr2 with using swap method


    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
