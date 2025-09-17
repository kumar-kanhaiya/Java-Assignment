package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem1112 {
    public static void main(String[] args) {
        int[] arr1 = {33,22,48,4,39,36,41,47,15,45};
        int[] arr2 = {22,33,48,4};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        int[] result = new int[arr1.length];
        // sort the arr1
        Arrays.sort(arr1);
        // sort according the arr2 with using swap method
        int index = 0;
        for (int i = 0; i < arr2.length ; i++) {
            int j = 0;
            while(j< arr1.length){
                if(arr1[j] == arr2[i]){
                    swap(arr1,index,j);
                    j++;
                    index++;
                }
                else{
                    j++;
                }
            }
        }
        return arr1;


    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    // second approach
    public static int[] relativeSortArray2(int[] arr1, int[] arr2){

    }
}
