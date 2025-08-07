package KunalKushwahaAssignment.Array.Medium;

public class Problem885 {
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
        int srow = 0;
        int erow = matrix.length - 1;
        // now my approach is to find the index first then after that 0 all the row and colloum of the index


    }

}

