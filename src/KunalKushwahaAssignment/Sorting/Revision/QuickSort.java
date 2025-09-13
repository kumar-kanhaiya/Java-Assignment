package KunalKushwahaAssignment.Sorting.Revision;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4,6,2,5,7,9,1,3,6};
        quickSort(array , 0 , array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] array , int low , int high){

        if(low < high){
            int partitionIndex = helper(array , low , high);
            quickSort(array , low , partitionIndex - 1);
            quickSort(array , partitionIndex + 1 , high);
        }
    }
    public static int helper(int[] array , int low , int high){
        int pivot = array[low];
        int i = low;
        int j = high;
        while(i<j){
            while(array[i] <= pivot && i<= high) {

                i++;
            }
            while(array[j] > pivot && j>= low){

                j--;
            }

            if(i<j){
                swap(array,i ,j);
            }
        }
        swap(array , low , j);
        return j;

    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
