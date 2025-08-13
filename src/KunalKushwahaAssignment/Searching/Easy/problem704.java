package KunalKushwahaAssignment.Searching.Easy;

public class problem704 {
    public static void main(String[] args) {
        int[] array = {-1,0,3,5,9,12};
        System.out.println(search(array , 78));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
