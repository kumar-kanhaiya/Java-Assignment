package KunalKushwahaAssignment.Sorting.Easy;

public class Problem628 {
    public static void main(String[] args) {
        int[] array = {-1,-2,-3};
        System.out.println(maximumProduct(array));

    }

    public static int maximumProduct(int[] nums) {
        sort(nums);
        int ans = 1;
        if(nums.length < 3){
            for (int i = 0; i < nums.length ; i++) {
                ans *= nums[i];
            }
        }
        else{
            for (int i = nums.length-1; i >= nums.length - 3 ; i--) {
                ans *= nums[i];
            }
        }
        return ans;
    }

    public static void sort(int[] array){
        int end = array.length - 1;
        while(end >0){
            int max = maxIndex(array , end);
            int temp = array[max];
            array[max] = array[end];
            array[end] = temp;
            end--;
        }
    }

    public static int maxIndex(int[] array , int end){
        int max = 0;

        for (int i = 0; i <= end ; i++) {
            if(array[i] > array[max]){
                max= i;
            }
        }
        return max;
    }
}
