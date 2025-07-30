package KunalKushwahaAssignment.Array.Easy;

public class leetcode2419 {
    public static void main(String[] args) {

    }

    public static int longestSubarray(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] & 1) > 0){

            }
        }
    }
    public static int max(int[] array ){
        int maz = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i] > maz){
                maz = array[i];
            }
        }
        return maz;
    }

}
