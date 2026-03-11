package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

import java.util.Arrays;

public class findMissingNumber {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(missingNum(arr));

    }
    // first approach
    public static int missingNum(int[] arr){
        // first we sort the array then we apply for loop and iterate
        Arrays.sort(arr);
        int check = 1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != check){
                return check;
            }
            check++;

        }
        return -1;
    }

    // 2nd approach also a better approach using sum formula 
    public static int missingNum2(int[] arr){
        long n = arr.length +1;
        long sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        long expected = (n * (n +1 ))/2;
        return (int) (expected- sum);
    }
    
}
