package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

import java.util.Arrays;

public class TwoSum {
    static void main() {
        int[] arr = {5,8,32,2,1,4};
        int[] ans = twoSum(arr,12);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] twoSum(int[] arr, int target) {
        int[] ans = {-1,-1};
        for(int i = 0 ; i< arr.length ; i++ ){
            for(int j = i+1; j< arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

}
