package KunalKushwahaAssignment.Sorting.Easy;

public class Problem169 {
    public static void main(String[] args) {
        int[] array = {3,2,3};
        System.out.println(majorityElement(array));

    }

    public static int majorityElement(int[] nums){
        int minimum = nums.length/2;
        for (int i = 0; i < nums.length ; i++) {
            if(occurence(nums , nums[i]) > minimum){
                return nums[i];
            }
        }
        return -1;
    }
    public static int occurence(int[] array , int target){
        int count = 0;
        for(int element : array){
            if(element == target){
                count++;
            }
        }
        return count;
    }
}
