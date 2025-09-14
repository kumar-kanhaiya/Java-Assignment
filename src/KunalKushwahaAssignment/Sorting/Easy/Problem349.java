package KunalKushwahaAssignment.Sorting.Easy;

import java.util.*;

public class Problem349 {
    public static void main(String[] args) {
        int[] first = {1,2,2,1};
        int[] second = {2,2};
        System.out.println(Arrays.toString(intersection(first,second)));


    }
    public static int[] intersection(int[] nums1, int[] nums2){
        Queue<Integer> list = new LinkedList<>();
        sort(nums1);
        sort(nums2);
        int[] arr1 = removeDuplicate(nums1);
        int[] arr2 = removeDuplicate(nums2);
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
    public static int[] removeDuplicate(int[] array){
        Queue<Integer> temp = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            if(i==0 ||array[i] != array[i-1]){
                temp.add(array[i]);
            }

        }
        int[] ans = new int[temp.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = temp.remove();
        }
        return ans;
    }

    public static void sort(int[] array ){
        int end = array.length - 1;
        while(end>0){
            int maxIndex = maxIndex(array , end);
            int temp = array[maxIndex];
            array[maxIndex] = array[end];
            array[end] = temp;
            end--;
        }
    }

    public static int maxIndex(int[] array , int end ){
        int maxIndex = 0;
        for (int i = 0; i <=end ; i++) {
            if(array[i] > array[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
