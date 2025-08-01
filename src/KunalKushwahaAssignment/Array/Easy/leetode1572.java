package KunalKushwahaAssignment.Array.Easy;

public class leetode1572 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(array));

    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                if(i == j){
                    sum += mat[i][j];
                }
                if(i+j == mat.length-1 && i!=j){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
