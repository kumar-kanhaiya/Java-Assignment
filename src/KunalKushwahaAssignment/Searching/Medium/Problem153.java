package KunalKushwahaAssignment.Searching.Medium;

public class Problem153 {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        System.out.println(findMin(array));


    }
    public static int findMin(int[] nums) {
        int start = 0;
        int ans = nums[0];
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] < ans){
                ans = Math.min(ans, nums[mid]);
            }

//            if(nums[start] == nums[mid] && nums[end] == nums[mid]){
//                // case of repeating number
//                start++;
//                end--;
//                continue;
//            }
            // left case
            if(nums[mid] >= nums[start]){
                // left side sorted
                if(nums[start] > ans && ans < nums[mid]){
                    end = mid - 1;

                }
                else{
                    start = mid + 1;
                }
            }

            if(nums[mid] <= nums[end]){
                // right side sorted
                if(nums[mid] > ans && nums[end] < ans){
                    start = mid +1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return ans;
    }

}
