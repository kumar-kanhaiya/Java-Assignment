package KunalKushwahaAssignment.Array.Medium;

public class Problem73 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,0,6},{7,8,9}};
        setZeroes(array);
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = matrix[i][j];
            }
        }
        int srow = 0;
        int scoll = 0;
        int erow = rows- 1;
        int ecoll = cols - 1;
        while(srow <= erow && scoll <= ecoll){
            // chacking the row and collow element
            // checking the row

            for (int i = scoll; i <= ecoll; i++) {
                if(copy[srow][i] == 0){
                    helper(matrix,srow,i);

                }
            }
            // checking the coll
            for (int i = srow; i <=erow ; i++) {
                if(copy[i][scoll] == 0){
                    helper(matrix,i,scoll);
                }
            }
            srow++;
            scoll++;
        }

    }
    public static void helper(int[][] array , int srow , int scoll){
        // zero the current row

        for (int i = 0; i < array[0].length; i++) {
            array[srow][i] = 0;
        }
        // zero the current coll
        for (int i = 0; i < array.length ; i++) {
            array[i][scoll] = 0;
        }
    }


}

