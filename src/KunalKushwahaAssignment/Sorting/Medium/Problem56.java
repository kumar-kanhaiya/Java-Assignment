package KunalKushwahaAssignment.Sorting.Medium;

import java.util.Arrays;

public class Problem56 {
    public static void main(String[] args) {
        int[][] arr = {{4,7},{1,4}};
        sortArray(arr);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j] + " , ");
            }
            System.out.println();
        }

    }

//    public static int[][] merge(int[][] intervals) {
//
//    }
    public static void sortArray(int[][] array){
        for (int i = 0; i < array.length ; i++) {
            int j = i;
            while(j>0 && array[j-1][0] > array[j][0]){
                swap(array,j-1,j);
                j--;
            }

        }
    }
    public static void swap(int[][] array , int first , int second){
        int temp = array[first][0];
        array[first][0] = array[second][0];
        array[second][0] = temp;
        // enter second element
        int tempp = array[first][1];
        array[first][1] = array[second][1];
        array[second][1] = tempp;
    }
}
