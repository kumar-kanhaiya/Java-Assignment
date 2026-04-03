package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class majorityElementII {
    static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(majorityElement(arr));

    }
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        int check = nums.length/3;
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > check){
                set.add(nums[i]);
            }
        }
        // copy the set element into the List
        for(int element : set){
            ans.add(element);
        }
        return ans;
    }
}
