package KunalKushwahaAssignment.Array.Easy;

public class leetcode2419 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,2,1};
        System.out.println(longestSubarray(array));

    }

    public static int longestSubarray(int[] nums) {

        int max = max(nums);
        int occ = occurence(nums , max);
        return occ;
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
    public static int occurence(int[] array , int target){
        int correntLength = 0;
        int maxlength = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == target){
                correntLength++;
                maxlength = Math.max(correntLength , maxlength);
            }
            else{
                correntLength = 0;
            }
        }
        return maxlength;

    }

}
