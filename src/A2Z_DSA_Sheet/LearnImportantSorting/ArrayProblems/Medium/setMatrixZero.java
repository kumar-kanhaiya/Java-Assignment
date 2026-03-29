package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

public class setMatrixZero {
    static void main() {

    }

    public void setZeroes(int[][] arr) {
        // first copy the element in new array
        int row = arr.length;
        int coll = arr[0].length;

        int[][] copy = new int[row][coll];
        for(int i = 0 ; i< row ; i++){
            for(int j = 0 ; j< coll ; j++){
                copy[i][j] = arr[i][j];
            }
        }

        int srow = 0;
        int erow = row -1 ;
        int scoll = 0;
        int ecoll = coll -1;

        while(srow <= erow && scoll <= ecoll){
            // checking for the row
            for(int i = scoll ; i <= ecoll ; i++){
                if(copy[srow][i] == 0){
                    helper(arr , srow , i);
                }
            }
            // for coll
            for(int i = srow ; i<= erow ; i++){
                if(copy[i][scoll] == 0){
                    helper(arr , i , scoll);
                }
            }
            srow++;
            scoll++;
        }
    }

    public void  helper(int[][] arr , int srow , int scoll){
        // zero the row element
        for(int i = 0 ; i < arr[0].length ; i++){
            arr[srow][i] = 0;
        }

        // zero the coll element
        for(int i = 0 ; i< arr.length ; i++){
            arr[i][scoll] = 0;
        }
    }
}