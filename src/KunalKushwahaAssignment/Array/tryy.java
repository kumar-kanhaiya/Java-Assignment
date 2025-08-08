package KunalKushwahaAssignment.Array;

public class tryy {
    public static void main(String[] args) {

    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int required sum =(int) (n *(n+1)/2);
        int sum = 0;
        for(int i = 0 ;i< n ; i++){
            sum += nums[i];
        }
        return required - sum;
    }
}
