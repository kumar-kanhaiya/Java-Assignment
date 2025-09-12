package KunalKushwahaAssignment.Sorting.Revision;

import java.util.ArrayDeque;
import java.util.Queue;

public class MergeSort {
    public static void main(String[] args) {

    }
    public static void mergeSort(int[] array , int low , int high ){
        int mid = (low + high)/2;

        if(low >= high){
            return;
        }

        mergeSort(array , low , mid);
        mergeSort(array , mid + 1 , high);
        merge(array, low , mid , high);
    }
    public static void merge(int[] array , int low , int mid , int high){
        Queue<Integer> temp = new ArrayDeque<>();
        int left = low;
        int right = mid + 1;
        while(left<= mid && right<= high){
            if(array[left] < array[right]){
                temp.add(array[left]);
                left++;
            }
            else {
                temp.add(array[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(array[left]);
            left++;
        }
        while(right<= high){
            temp.add(array[right]);
            right++;
        }

    }
}
