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
        int m = matrix.length ;
        int n = matrix[0].length ;
        int srow = 0 , erow = m - 1, scoll = 0 , ecoll = n-1;
        while(srow<= erow && scoll<= ecoll){
            // top
            for (int i = scoll; i <= ecoll ; i++) {
                    list.add(matrix[srow][i]);
            }

            // right
            for (int i = srow+1; i <=erow ; i++) {
                list.add(matrix[i][ecoll]);
            }

            // bottom
            for (int i = ecoll-1; i >=scoll ; i--) {
                if(srow == erow){
                    break;
                }
                list.add(matrix[erow][i]);
            }

            // left
            for (int i = erow - 1; i >=srow +1  ; i--) {
                if(scoll == ecoll){
                    break;
                }
                list.add(matrix[i][scoll]);
            }
            srow++;
            scoll++;
            ecoll--;
            erow--;
        }
        return list;
    }

}
