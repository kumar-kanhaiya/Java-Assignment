package KunalKushwahaAssignment.Sorting.Medium;

import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        int[] array = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(array));

    }
    public static List<List<Integer>> threeSum(int[] arr) {
        // normal approach
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int k = j+1;
                while(k< arr.length){
                    if(arr[k] + arr[j] == -(arr[i]) ){
                        List<Integer> check = new ArrayList<>();
                        check.add(arr[i]);
                        check.add(arr[j]);
                        check.add(arr[k]);
                        set.add(check);
                    }
                    k++;
                }
            }
        }
        ans.addAll(set);
        return ans;
    }
}
