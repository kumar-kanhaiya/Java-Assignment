package KunalKushwahaAssignment.Sorting.Easy;

import java.util.*;

public class Problem1112 {
    public static void main(String[] args) {
        int[] arr1 = {33,22,48,4,39,36,41,47,15,45};
        int[] arr2 = {22,33,48,4};
        System.out.println(Arrays.toString(relativeSortArray2(arr1,arr2)));

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
        int[] temp = new int[arr1.length];
        // insert all the element  in the temp array
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    temp[index++] = arr1[j];
                }
            }

        }
        List<Integer> rest = new ArrayList<>();
        Set<Integer> arr2Set = new HashSet<>();
        for (int num : arr2) {
            arr2Set.add(num);
        }

        for (int num : arr1) {
            if (!arr2Set.contains(num)) {
                rest.add(num);
            }
        }


        Collections.sort(rest);


        for (int num : rest) {
            temp[index++] = num;
        }

        return temp;



    }
}
