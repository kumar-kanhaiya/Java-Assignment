package KunalKushwahaAssignment.Array.Medium;

public class problem198 {
    public static void main(String[] args) {
        int[] array = {1,2};
        System.out.println(rob(array));

    }
    public static int rob(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int ans = nums[0];
        // chacking the row
        for (int i = 0; i < nums.length ; i++) {
            int check = nums[i];
            if(i%2 == 0 && i+2 < nums.length){
                check = 0;
                for (int j =i; j < nums.length ; j = j+2) {
                    check += nums[j];
                }
            }
            if(i%2 !=0 && 2*i+1< nums.length){
                check = 0;
                for (int j = i; j < nums.length ; j = 2*j + 1 ) {
                    check += nums[j];
                }
            }
            if(check > ans){
                ans = check;
            }

        }
        return ans ;
    }
}
