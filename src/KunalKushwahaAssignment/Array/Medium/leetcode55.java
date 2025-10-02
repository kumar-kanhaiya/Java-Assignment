package KunalKushwahaAssignment.Array.Medium;

public class leetcode55 {
    public static void main(String[] args) {
        int[] array = {2,3,1,1,4};
        System.out.println(canJump(array));

    }

    public static boolean canJump(int[] nums) {
        int start = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length  ; i++) {
            if(i> maxIndex){
                return false;
            }
            maxIndex = Math.max(maxIndex,i+nums[i]);
        }
        return true;
    }
}
