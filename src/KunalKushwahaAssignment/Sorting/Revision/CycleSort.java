package KunalKushwahaAssignment.Sorting.Revision;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] array = {3,5,2,1,4};
        cycleSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void cycleSort(int[] array ){
        int i = 0 ;
        while(i< array.length){
            int correctIndex = array[i] - 1;
            if(array[i] != array[correctIndex]){
                swap(array , i , correctIndex);
            }
            else{
                i++;
            }

        }

    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
