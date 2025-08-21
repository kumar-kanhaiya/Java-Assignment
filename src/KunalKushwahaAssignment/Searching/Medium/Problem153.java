package KunalKushwahaAssignment.Searching.Medium;

public class Problem153 {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        System.out.println(findMin(array));


    }
    public static int findMin(int[] nums) {
        int start = 0;
        int ans = nums[0];
        int end = nums.length - 1;
        while(start < end){

            int mid = start + (end - start)/2;

            if(nums[mid] < ans){
                ans = Math.min(ans, nums[mid]);
            }


            if(nums[mid] >= nums[start]){
                // left side sorted
                start = mid + 1;
                ans = Math.min(ans , nums[start]);

            }
            else{
                end = mid - 1;
                ans = Math.min(ans,nums[end]);

            }

        }
        return ans;
    }

}
