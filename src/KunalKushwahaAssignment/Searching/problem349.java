package KunalKushwahaAssignment.Searching;

import java.util.LinkedList;
import java.util.Queue;

public class problem349 {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Queue<Integer> list = new LinkedList<>();
        // we use two pointer
        int start = 0;
        int end = maxLength(nums1, nums2);
        int index = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
        }
    }
    public static int maxLength(int[] nums1 , int[] nums2){
        if(nums1.length > nums2.length){
            return nums1.length;
        }
        else{
            return nums2.length;
        }
    }
}
