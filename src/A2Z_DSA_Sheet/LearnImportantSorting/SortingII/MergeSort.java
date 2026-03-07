package A2Z_DSA_Sheet.LearnImportantSorting.SortingII;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] array , int low , int high){
//        Base case
        if(low >= high){
            return ;
        }
        int mid = low + (high - low) / 2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);

        merge(array,low , mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(array[left] <= array[right]){
                temp.add(array[left++]);
            } else {
                temp.add(array[right++]);
            }
        }

        while(left <= mid){
            temp.add(array[left++]);
        }

        while(right <= high){
            temp.add(array[right++]);
        }

        // IMPORTANT: copy back to original array
        for(int i = low; i <= high; i++){
            array[i] = temp.get(i - low);
        }
    }

}
