package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {
    static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));

    }

    // hashSet is not stored :- HashSet internally hash table use karta hai. Elements hash
    // value ke basis pe store hote hain, na ki insertion order pe
    public static int removeDuplicates1(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[i]);
        }
        Integer[] arr = ans.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        for (int i = arr.length ; i < nums.length ; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
        return arr.length;
    }

    // approach 2
    public static int removeDuplicates(int[] arr){
        int[] ans = helper(arr);
        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
        for (int i = ans.length ; i < arr.length ; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
        return ans.length;
    }

    public static int[] helper(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        // now add only unique element
        list.add(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        // now create a new array then push the element into it
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            ans[i] = list.get(i);
        }
        System.out.println("ans:- "+ Arrays.toString(ans));
        return ans;
    }

}
