package KunalKushwahaAssignment.Sorting.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem18 {
    public static void main(String[] args) {
        int[] array = {2,2,2,2};
        System.out.println(fourSum(array , 8));

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length  ; j++) {
                if(j > i+1 && nums[j]==nums[j-1])
                {
                    continue;
                }
                int k = j+1;
                int m = nums.length-1;
                while(k<m){
                    long sum =(long)nums[i]+nums[j]+nums[k] + nums[m];

                    if(sum > target){
                        m--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k] , nums[m]);
                        ans.add(temp);
                        k++;
                        m--;

                        while(k<m && nums[k] == nums[k-1]){
                            k++;
                        }
                        while(k<m && nums[m] == nums[m+1]){
                            m--;
                        }
                    }

                }
            }
        }
        return ans;
    }
}
