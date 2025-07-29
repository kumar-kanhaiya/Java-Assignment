package KunalKushwahaAssignment.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class leetcode1380 {
    public static void main(String[] args) {

    }
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int row = 0; row < matrix.length ; row++) {
            boolean check = true;

            for (int collumns = 0; collumns < matrix[row].length; collumns++) {

            }
        }
        return list;
    }
    public static int minimumElement(int[][] array , int row){
        int min = array[row][0];
        for (int i = 0; i <array[row].length ; i++) {
            if(min > array[row][i]){
                min = array[row][i];
            }

        }
        return min;
    }
    public static int collumnsMax(int[][] array , int collumn){
        int max = array[0][collumn];
        for (int i = 0; i < array.length ; i++) {
            if(array[i][collumn] > max){
                max = array[i][collumn];
            }
        }
        return max;
    }
}
