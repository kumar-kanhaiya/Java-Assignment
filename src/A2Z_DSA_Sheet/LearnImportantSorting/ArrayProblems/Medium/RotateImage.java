package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.Arrays;

public class RotateImage {
    static void main(String[] args) {
        int[][] matrix = {{5,1,9,11}
                    ,{2,4,8,10},
                    {13,3,6,7},
                {15,14,12,16}};

        rotate(matrix);
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    // first approach
    // using a new 2D matrix
    public static void rotate1(int[][] matrix) {
        int n = matrix.length; // length of the matrix
        if(n == 0){
            return ;
        }
        int[][] ans = new int[n][n]; // this is the square matrix
        int collEnd = n-1;
        int rowStart = 0;
        int collStart = 0;
        int rowEnd = n-1;
        while(collStart<= collEnd && rowStart <= rowEnd){
            for (int i = 0; i <n ; i++) {
                ans[i][collStart] = matrix[rowEnd][i];
            }
            collStart++;
            rowEnd--;
        }

        // copy the element
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }

    // this is the optimal approach where we have not use any new 2D array
    // transpose + reverse rows
    // transpose -> convert row into coll and coll into row
    public static void rotate(int[][] matrix){
        // first transpose the matrix
        int n = matrix.length;
        // base condition or first check case
        if(n ==0 ){
            return;
        }
        int sRow = 0;
        int eRow = n-1;
        int sColl = 0;
        int eColl = n-1;
        while(sRow <= eRow && sColl <= eColl){
            for (int i = sRow+1; i <n ; i++) {
                int temp = matrix[sRow][i];
                matrix[sRow][i] = matrix[i][sColl];
                matrix[i][sColl] = temp;
            }
            sRow++;
            sColl++;
        }

        // now reverse the row
        sRow = 0 ;
        eRow = n-1;
        while(sRow<= eRow){
            int collEnd = n-1;
            int i = 0;
            while(i<= collEnd){
                int temp = matrix[sRow][i];
                matrix[sRow][i]= matrix[sRow][collEnd];
                matrix[sRow][collEnd] = temp;
                collEnd--;
                i++;
            }
            sRow++;
        }
    }

}