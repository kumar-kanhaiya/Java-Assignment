package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

public class MaximumSubarray {
    static void main(String[] args) {

    }
    // first approach -> time limit exceed problem
    public int maxSubArray1(int[] arr) {
        if(arr.length <= 1){
            return arr[0];
        }
        int ans = arr[0] ;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = i ; j < arr.length ; j++){
                sum += arr[j];
                ans = Math.max(ans , sum);
            }
        }
        return ans;
    }

    // second approach
    // kendane's algo
    public static int maxSubArray(int[] arr){
        long sum =0;
        long max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            sum+= arr[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0 ){
                sum = 0;
            }
        }
        return (int)max;
    }
}
