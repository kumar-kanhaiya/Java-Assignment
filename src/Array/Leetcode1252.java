package Array;

public class Leetcode1252 {
    public static void main(String[] args) {


    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] newArray = new int[m][n];
        for (int row = 0; row < newArray.length ; row++) {
            for (int i = 0; i < indices.length ; i++) {
                if(row == indices[i][0]) {
                    newArray[row][0] += 1;
                }
            }
            for (int collumns = 0; collumns < newArray[row].length ; collumns++) {
                for (int i = 0; i < indices[row].length ; i++) {
                    if(collumns == indices[row][collumns]){
                        newArray[row][collumns] += 1;
                }
                }
            }
        }
        return 0;
    }
}
