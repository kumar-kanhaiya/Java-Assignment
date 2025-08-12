package KunalKushwahaAssignment.Searching;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class problem349 {
    public static void main(String[] args) {
        int[] array = {1,2,2,3};
        int[] ans = removeDublicate(array);
        System.out.println(Arrays.toString(ans));

    }
//    public int[] intersection(int[] nums1, int[] nums2) {
//        Queue<Integer> list = new LinkedList<>();
//        // we use two pointer
//
//    }

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
