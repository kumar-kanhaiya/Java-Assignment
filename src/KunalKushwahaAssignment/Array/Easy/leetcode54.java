package KunalKushwahaAssignment.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(array));

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                if (row == 0 || col == matrix.length - 2){
                    list.add(matrix[row][col]);
                }
                else if(col == matrix[row].length - 1){
                    list.add(matrix[col][row]);
                }
                else if(row == matrix.length - 1){
                    list.add(matrix[row][col]);
                }
            }
        }
        return list;
    }

}
