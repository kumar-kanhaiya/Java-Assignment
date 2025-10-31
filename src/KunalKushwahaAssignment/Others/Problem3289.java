package KunalKushwahaAssignment.Others;

import java.util.Arrays;

public class Problem3289 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,4,3,4,6,0,9,5,8,2};
        System.out.println(Arrays.toString(getSneakyNumbers(arr)));

    }

    public static int[] getSneakyNumbers1(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int index = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1]){
                ans[index++] = nums[i];
            }
            if(ans[0] != 0 && ans[1] != 0){
                break;
            }
        }
        return ans;
    }

    //2nd approach
    public static int[] getSneakyNumbers(int[] arr){
        int[] ans = new int[2];
        int count = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    ans[count++] = arr[j];
                    break;
                }
            }
        }
        return ans;

    }
}
