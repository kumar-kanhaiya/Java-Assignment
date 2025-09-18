package KunalKushwahaAssignment.Sorting.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1200 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = minDifference(arr);


    }
    public static int minDifference(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length ; i++) {
            min = Math.min(min , array[i] - array[i+1]);
        }
        return min;
    }
}
