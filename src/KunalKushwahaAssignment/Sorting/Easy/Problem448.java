package KunalKushwahaAssignment.Sorting.Easy;

import java.util.ArrayList;
import java.util.List;

public class Problem448 {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(array));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i< nums.length) {
            int correctIndex = nums[i]-1;
            if(i< nums.length && nums[i] != nums[correctIndex] ){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j] != j +1){
                ans.add(j +1);
            }
        }
        return ans;

    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
