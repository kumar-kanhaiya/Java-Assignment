package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        System.out.println(fourSum(arr,8));

    }

    // first approach
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        // first loop
        for (int i = 0; i < arr.length ; i++) {
            // condition check
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            // second loop
            for (int j = i+1; j <arr.length ; j++) {
                if(j > i+1 && arr[j] == arr[j-1]){
                    continue;
                }
                int sum = arr[i] + arr[j];
                int left = j+1;
                int right = arr.length-1;
                while(left< right){
                    // first check the sum
                    int finalSum = sum + arr[left] + arr[right];
                    // check the conditions
                    if(finalSum > target){
                        right--;
                    }
                    else if(finalSum < target){
                        left ++;
                    }
                    // finally we find the answer
                    else{
                        // we get the answer
                        List<Integer> check = Arrays.asList(arr[i],arr[j],arr[left] , arr[right]);
                        left++;
                        right--;
                        // check the case of multiple things
                        while(left<arr.length && arr[left] == arr[left - 1] ){
                            left++;
                        }
                        // check the right one
                        while(right>0 && arr[right-1] == arr[right]){
                            right--;
                        }
                        ans.add(check);
                    }
                }
            }
        }
        return ans;
    }

}
