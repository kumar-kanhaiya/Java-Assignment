package KunalKushwahaAssignment.Sorting.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem56 {
    public static void main(String[] args) {
        int[][] arr = {{4,7},{1,4}};
        int[][] ans = merge(arr);
        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " , ");
            }
            System.out.println();
        }

    }

    public static int[][] merge(int[][] array) {
        sortArray(array);
        List<int[]> merged = new ArrayList<>();
        int[] current = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i][0] <= current[1]) {
                current[1] = Math.max(current[1], array[i][1]);
            } else {
                merged.add(current);
                current = array[i];
            }
        }
        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }

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
