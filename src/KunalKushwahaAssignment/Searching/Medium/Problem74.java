package KunalKushwahaAssignment.Searching.Medium;

public class Problem74 {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int coll = matrix[0].length;
        int start = 0 ;
        int end = rows - 1;
        int row = -1;
        // finding the row in which target lies;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(matrix[mid][0] <= target && matrix[mid][coll - 1] <= target){
                row = mid;
                break;
            }
            else if(matrix[mid][0] < target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }

        if(row == -1){
            return false;
        }

        // use the binary search to search the element
        int left = 0;
        int right = coll - 1;
        while(left<= right){
            int mid = left + (right - left)/2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid] > target){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return false;
    }
}
