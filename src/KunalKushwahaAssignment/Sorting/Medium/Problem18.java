package KunalKushwahaAssignment.Sorting.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem18 {
    public static void main(String[] args) {
        int[] array = {1,0,-1,0,-2,2};
        System.out.println(fourSum(array , 0));

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length - 1 ; j++) {
                if(j !=0 && nums[j]==nums[j-1])
                {
                    continue;
                }
                int k = j+1;
                int m = nums.length-1;
                while(k<m){
                    int sum =nums[i]+nums[j]+nums[k] + nums[m];

                    if(sum > target){
                        m--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k] , nums[m]);
                        ans.add(temp);
                        j++;
                        k--;

                        while(k<m && nums[k] == nums[k-1]){
                            j++;
                        }
                        while(k<m && nums[m] == nums[m+1]){
                            k--;
                        }
                    }

                }
            }
        }
        return ans;
    }
}
