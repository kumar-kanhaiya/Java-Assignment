package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInArray {
    static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        ArrayList<Integer> list = leaders(arr);
        System.out.println(list);
    }

    // this is the optimal approach for this problem
    public static ArrayList<Integer> leaders(int[] arr){
        int n = arr.length;
        int max =  arr[n-1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(max);
        for (int i = n-2; i >= 0  ; i--) {
            if(arr[i] > max){
                max = arr[i];
                ans.add(max);
            }
        }
        return ans;
    }
}
