package KunalKushwahaAssignment.Searching.Medium;

import java.util.Arrays;

public class Problem1838 {
    public static void main(String[] args) {
        int[] arr= {1,2,5,6,8,9,4,5,63,0};
        sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    public int maxFrequency(int[] nums, int k) {

        return 0;
    }
    public static void sorting(int[] array ){
        int start = 0;
        int end = array.length;
        while(start <= end-1){
            int maxIndex = maxIndex(array , 0 , end - start -1);
            int temp = array[end - start - 1];
            array[end - start - 1] = array[maxIndex];
            array[maxIndex] = temp;
            start++;
        }

    }
    public static int maxIndex(int[] array , int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
}
