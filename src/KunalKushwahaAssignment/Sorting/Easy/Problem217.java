package KunalKushwahaAssignment.Sorting.Easy;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

public class Problem217 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        System.out.println(containsDuplicate(array));

    }

    public static boolean containsDuplicate(int[] nums) {
        // approach first sort the array then check duplicate element
        mergeSort(nums , 0 , nums.length - 1);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]){
                return true;
            }
        }

        return false;
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
        // insert the element in new array
        for (int i = low; i <= high; i++) {
            array[i] = temp.remove();
        }
    }
    // second approach
    public boolean containsDuplicate2(int[] nums) {
        int n=nums.length;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            if(h.contains(nums[i])){
                return true;
            }
            h.add(nums[i]);
        }
        return false;
    }

}
