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
        int row = 0;
        int collumn = 0;
        int i = 0;
        if(row == 0 || collumn == 0){
            list.add(matrix[row][collumn++]);
        }
        else if(collumn == matrix.length - 1){
            list.add(matrix[row++][collumn]);
        }
        else if(row == matrix.length - 1){
            list.add(matrix[row][collumn--]);

        }
        else{
            if(row > 0 || row< matrix.length - 1) {
                list.add(matrix[row--][collumn]);
            }
        }


        return list;

    }
}
