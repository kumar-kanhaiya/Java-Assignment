package KunalKushwahaAssignment.Others;

public class Problem3190 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(minimumOperations(arr));

    }

    public static int minimumOperations(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] %3 != 0 && ( (nums[i] -1)%3 == 0  || (nums[i] + 1 )%3 == 0 )){
                ans++;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}
