package KunalKushwahaAssignment.Searching.Easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem350 {
    public static void main(String[] args) {
        int[] array = {1,2,2,1};
        int[] arr = {2,2};
        int[] ans = intersect(array , arr);
        System.out.println(Arrays.toString(ans));


    }
    public  static int[] intersect(int[] nums1, int[] nums2){
        Queue<Integer> list = new LinkedList<>();
        sortArray(nums1);
        sortArray(nums2);
        int i = 0;
        int j =0 ;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;

            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        int size = list.size();
        int[] ans = new int[size];
        for (int k = 0; k < size; k++) {
            ans[k] = list.remove();
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

