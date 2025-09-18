package KunalKushwahaAssignment.Sorting.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1200 {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));

    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = minDifference(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] == min) {

                List<Integer> check = new ArrayList<>();
                check.add(arr[i]);
                check.add(arr[i+1]);
                ans.add(check);
            }
        }
        return ans;


    }
    public static int minDifference(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length -1; i++) {
            min = Math.min(min ,  array[i+1]-array[i] );
        }
        return min;
    }
}
