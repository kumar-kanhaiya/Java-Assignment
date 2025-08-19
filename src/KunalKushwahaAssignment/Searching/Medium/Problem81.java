package KunalKushwahaAssignment.Searching.Medium;

public class Problem81 {
    public static void main(String[] args) {
        int[] array = {1,0,1,1,1};
        System.out.println(search(array,0));

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
        while(start<= end){
            int mid = start + (end - start)/2;
            // case - 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case -2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] >= arr[start]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return - 1;
    }
    public static boolean binarySearch(int[] arr , int target , int start , int end ){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                // ans found
                return true;
            }
            if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
