package KunalKushwahaAssignment.Searching.Medium;

public class Problem81 {
    public static void main(String[] args) {
        int[] array = {1,0,1,1,1};
        System.out.println(search2(array,0));

    }
    // 279 test cases pass
    public static boolean search(int[] nums, int target) {
        int pivot = pivot(nums);
        // array not rotated case
        if(pivot == -1){
            return binarySearch(nums , target , 0 , nums.length - 1);
        }

        // if pivot == target
        if(nums[pivot] == target){
            return true;
        }
        if(target >= nums[0]){
            return binarySearch(nums , target , 0 , pivot-1);
        }
        return binarySearch(nums , target , pivot + 1 , nums.length -1 );
    }

    // pivot is basically the maximum index
    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = start + (end - start)/2;
            // case - 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case -2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end] ){
                start++;
                end--;
            }
            else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return - 1;
    }
    public static boolean binarySearch(int[] nums, int target , int start , int end ) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                // ans found
                return true;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            // left side sorted
            else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // right side sorted
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return false;
    }

    public static boolean search2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<= end){
            int mid = (start + end )/2;
            if(nums[mid] ==  target){
                return true;
            }
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return false;

    }
}
