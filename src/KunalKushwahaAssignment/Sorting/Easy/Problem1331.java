package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;
import java.util.HashMap;

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
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank =1;
        for(int num : temp){
            if(!map.containsKey(num)){
                map.put(num , rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
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
                if( mid +1 < array.length && array[mid] == array[mid + 1]){
                    return mid +1;
                }
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
    public static int searching(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result+1;
    }


}
