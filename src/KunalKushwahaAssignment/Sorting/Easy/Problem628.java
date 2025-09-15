package KunalKushwahaAssignment.Sorting.Easy;

public class Problem628 {
    public static void main(String[] args) {
        int[] array = {-1,-2,-3};
        System.out.println(maximumProduct(array));

    }

    public static int maximumProduct(int[] nums) {
        sort(nums);
        int n = nums.length;
        int option1 = nums[n-1] * nums[n-2] * nums[n-3];
        int option2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(option1, option2);

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
