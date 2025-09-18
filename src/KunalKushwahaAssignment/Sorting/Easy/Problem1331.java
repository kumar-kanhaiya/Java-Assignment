package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem1331 {
    public static void main(String[] args) {
        int[] array = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(array)));

    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        // now copying the ans ;
        int[] ans = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            ans[i] = lessNumber(temp , arr[i]) + 1;
        }
        return ans;
    }
    public static int lessNumber(int[] array , int target){
        // finding the index using binary search
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] < target){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
