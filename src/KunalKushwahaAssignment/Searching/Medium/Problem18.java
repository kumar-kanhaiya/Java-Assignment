package KunalKushwahaAssignment.Searching.Medium;

import java.util.ArrayList;
import java.util.List;

public class Problem18 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] array, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        // best case
        if(array.length == 4) {
            if (array[0] + array[1] + array[2] + array[3] != target) {
                return ans;
            }
        }



    }

    public static List<Integer> helper(int[] array , int start , int end , List<Integer> list , int target){
        if(start == end){
            return list;
        }
        // we are doing using two pointer approach
        for (int i = 0; i <end ; i++) {
            int a = 0;
            for (int j = 0; j < end; j++) {
                if(i == j){
                    continue;
                }
                if( a + array[j]  <= target)
            }
        }
    }
}
