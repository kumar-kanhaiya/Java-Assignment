package KunalKushwahaAssignment.Sorting.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1200 {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,15};
        System.out.println(minDifference(arr));
        System.out.println(minimumAbsDifference(arr));

    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = minDifference(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (j< arr.length){
                if (arr[j] - arr[i] == min) {
                    List<Integer> check = new ArrayList<>();
                    check.add(arr[i]);
                    check.add(arr[j]);
                    ans.add(check);
                }
                j++;
            }
        }
        return ans;


    }
    public static int minDifference(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length -1; i++) {
            min = Math.min(min ,  array[i+1]-array[i] );
        }
        return min;
    }
}
