package KunalKushwahaAssignment.Searching.Medium;

import java.util.Arrays;

public class Problem3346 {
    public static void main(String[] args) {
        int[] array = {5,8,9,4,6,46,2,3};
//        sortInDecreasing(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[][] sortMatrix(int[][] grid) {
        int srow = 0 ;
        int scoll  = 0;
        int[] demo = new int[grid.length];
        // case for middle
        int i = 0;
        while(srow < grid.length && scoll < grid.length && i< grid.length){
            demo[i] = grid[srow][scoll];
            i++;
            srow++;
            scoll++;
        }
        sortInDecreasing(demo);
        int j = 0;
        while(srow < grid.length && scoll < grid.length && j< grid.length){
            grid[srow][scoll] = demo[j];
            j++;
            srow++;
            scoll++;
        }
        return grid;
    }

    public static void sortInIncreasing(int[] array){

        int end = array.length - 1;
        while(end > 0){
            int maxIndex = maxIndex(array , 0 , end );
            int temp = array[end];
            array[end] = array[maxIndex];
            array[maxIndex] = temp;
            end-- ;

        }

    }
    public static void sortInDecreasing(int[] array ){
        int start = 0;
        int end = array.length - 1;
        while(start < array.length - 1){
            int maxIndex = maxIndex(array , start , end);
            int temp = array[start];
            array[start] = array[maxIndex];
            array[maxIndex] = temp;
            start++;
        }

    }
    public static int maxIndex(int[] array , int start , int end){
        int max = start;

        for (int i = start; i < end ; i++) {
            if(array[i] > array[max]){
                max = i;
            }
        }
        return max;
    }


}
