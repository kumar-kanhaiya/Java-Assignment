package KunalKushwahaAssignment.Searching;

import java.util.LinkedList;
import java.util.Queue;

public class Problem350 {
    public static void main(String[] args) {
        int[] array = {}

    }
    public int[] intersect(int[] nums1, int[] nums2){
        Queue<Integer> list = new LinkedList<>();
        sortArray(nums1);
        sortArray(nums2);
        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length ; j++) {
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
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

