package KunalKushwahaAssignment.Array.Easy;

import java.util.Arrays;

public class leetcode867 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] ans = transpose(array);
        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j <ans[i].length ; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length ; row++) {
            for (int collumn = 0; collumn <matrix[row].length ; collumn++) {
                ans[collumn][row] = matrix[row][collumn];
            }
        }
        return ans;
    }
}
