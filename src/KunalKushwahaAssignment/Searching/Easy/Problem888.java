package KunalKushwahaAssignment.Searching.Easy;

import java.util.Arrays;

public class Problem888 {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        sortArray(array);
        System.out.println(Arrays.toString(array));
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

        while(i< aliceSizes.length ){
            int sum = 0;
            for(int element : bobSizes){

            }
            i++;
        }
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
