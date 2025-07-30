package KunalKushwahaAssignment.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode566 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4}};
        System.out.println(Arrays.toString(matrixReshape(array , 2,4)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        // first we have to convert 2d array into 1d array
        int totalElements = mat.length * mat[0].length;
        int[] array = new int[totalElements];

        // now input all the element into this one d array ;
        if (totalElements != r * c) {
            return mat;
        }
        int index = 0;
        for(int[] element : mat){
            for(int e : element){
                array[index++] = e;
            }
        }

        int[][] ans = new int[r][c];
        index = 0;
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j <c ; j++) {
                ans[i][j] = array[index++];
            }
        }
        return ans;
    }
}
