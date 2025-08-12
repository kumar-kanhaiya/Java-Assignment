package KunalKushwahaAssignment.Searching;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class problem349 {
    public static void main(String[] args) {
        int[] array = {4,9,5};
        int[] arr = {9,4,9,8,4};
        int[] ans = intersection(array , arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Queue<Integer> list = new LinkedList<>();
        sortArray(nums1);
        sortArray(nums2);
        int[] arr1 = removeDublicate(nums1);
        int[] arr2 = removeDublicate(nums2);
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if(arr1[i] == arr2[j]){
                    list.add(arr1[i]);
                }
                else{
                    continue;
                }
            }
        }
        int size = list.size();
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = list.remove();
        }
        return ans;

    }

    public static int[] removeDublicate(int[] arr){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length ; i++) {
            if(i == 0 || arr[i] != arr[i-1]){
                queue.add(arr[i]);
            }
        }
        int size = queue.size();
        int[] ans = new int[size];
        for (int i = 0; i <size ; i++) {
            ans[i] = queue.remove();
        }
        return ans;
    }
    public static void sortArray(int[] array ){
        // sorting is done by insertion ;
        int end = array.length - 1;
       while(end>0){
           int indexMax = maxIndex(array , end);
           int temp = array[indexMax];
           array[indexMax] = array[end];
           array[end] = temp;
           end --;
       }
    }
    public static int maxIndex(int[] array ,  int end){
        int max = 0;
        for (int i = 0; i <= end ; i++) {
            if(array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
}
