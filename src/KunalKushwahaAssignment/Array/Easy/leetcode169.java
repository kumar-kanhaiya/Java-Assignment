package KunalKushwahaAssignment.Array.Easy;

public class leetcode169 {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int minimum = nums.length/2;
        for (int i = 0; i < nums.length ; i++) {
            if(occurence(nums,nums[i]) > minimum){
                return occurence(nums,nums[i]);
            }
        }
        return -1;

    }
    public static int occurence(int[] array , int number ){
        int count = 0;
        for(int element : array){
            if(element == number){
                count++;
            }
        }
        return count;
    }
}
