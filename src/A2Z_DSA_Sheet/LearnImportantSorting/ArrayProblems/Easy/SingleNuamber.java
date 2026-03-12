package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

import java.util.HashSet;
import java.util.Set;

public class SingleNuamber {
    static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(singleNumber(arr));

    }
    // first approach
    public static int singleNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        int realSum = 0;
        int singleSum = 0;
        for(int num : nums){
            set.add(num);
            realSum += num;
        }
        for(int num : set){
            singleSum += num;
        }
        return 2*singleSum - realSum;


    }
}
