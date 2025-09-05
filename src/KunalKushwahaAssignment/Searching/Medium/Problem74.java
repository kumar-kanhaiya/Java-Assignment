package KunalKushwahaAssignment.Searching.Medium;

public class Problem74 {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int rEnd = matrix.length;
        int coll = 0;
        int cEnd = matrix[0].length;
        while(row < rEnd && coll < cEnd){
            int mid = coll + (cEnd - coll) / 2;


            // checking the row
            if(matrix[row][0] > target){
                // search below the row ;
                if(matrix[row-1][mid] == target){
                    return true;
                }
                else if(matrix[row-1][mid] > target){
                    cEnd = mid - 1;
                }
                else{
                    coll = mid + 1;
                }
            }
            row++;
            coll = 0;
        }
        return false;
    }
}
