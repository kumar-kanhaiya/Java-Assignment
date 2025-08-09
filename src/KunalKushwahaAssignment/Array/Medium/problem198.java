package KunalKushwahaAssignment.Array.Medium;

public class problem198 {
    public static void main(String[] args) {
        int[] array = {2,7,9,3,1};
        System.out.println(rob(array));

    }
    public static int rob(int[] nums) {
        int ans = 0;
        // chacking the row
        for (int i = 0; i < nums.length ; i++) {
            int check = 0;
            if(i%2 == 0 && i+2 < nums.length){
                for (int j =i; j < nums.length ; j = j+2) {
                    check += nums[j];
                }
            }
            if(i%2 !=0 && 2*i+1< nums.length){
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
