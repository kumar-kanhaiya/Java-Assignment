package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

import java.util.HashMap;

public class MajorityElement {
    static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,2,3};
        System.out.println(majorityElement(arr));

    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length/2;
        for(int num: nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(map.get(nums[i]) > n ){
                return nums[i];
            }
        }
        return -1;
    }

    // more efficient approach
    public static int majorityElement1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length/2;
        for(int num: nums){
            map.put(num , map.getOrDefault(num,0)+1);
            if(map.get(num) > n ){ // check inside this
                return num;
            }
        }

        return -1;
    }
}
