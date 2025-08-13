package KunalKushwahaAssignment.Searching.Easy;

import java.util.Arrays;

public class Problem888 {
    public static void main(String[] args) {
        int[] array = {2};
//        sortArray(array);
        int[] second = {1,3};
        int[] ans = fairCandySwap(array , second);
        System.out.println(Arrays.toString(ans));
    }
    public int[] fairCandySwap2(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        // this is best approach
        // Step 1: Calculate sumA and sumB
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;

        // Step 2: Try every possible swap
        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                int newSumA = sumA - a + b;
                int newSumB = sumB - b + a;

                if (newSumA == newSumB) {
                    return new int[]{a, b}; // Found a valid swap
                }
            }
        }

        return new int[0]; // Will never reach here (guaranteed one solution)
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // we do this question with the help of binary search
        int i = 0;
        int j = 0;
        sortArray(aliceSizes);
        sortArray(bobSizes);
        int sum1 = Sum(aliceSizes);
        int sum2 = Sum(bobSizes);
        int deff = (sum1 - sum2)/2;

        for(int element : aliceSizes){
            int b = element - deff;
            if (binarySearch(bobSizes, b)) {

                return new int[]{element , b};
            }
        }
        return new int[0];
    }
    public static boolean binarySearch(int[] array , int target){
        int start = 0;
        int end = array.length- 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(array[mid] == target){
                return true;
            }
            else if (array[mid] > target){
                end = mid -1 ;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }
    public static void sortArray(int[] array ){
        int end = array.length - 1;
        while(end>=0){
            int maxIndex = maxIndex(array , 0 , end);
            int temp = array[end];
            array[end] = array[maxIndex];
            array[maxIndex] = temp;
            end--;
        }

    }
    public static int maxIndex(int[] array , int start , int end ){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
    public static int Sum(int[] array ){
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }

//    public static void swap(int[] array , int first , int second){
//        int temp = array[first];
//        array[first] = array[second];
//        array[second] = temp;
//    }
//    public static boolean isSumEqual(int[] first  , int[] second){
//        int sum1 = 0;
//        for(int element : first){
//            sum1 += element;
//        }
//        int sum2 = 0;
//        for(int element : second){
//            sum2 += element;
//        }
//        if(sum1 == sum2){
//            return true;
//        }
//        return false;
//    }
}
