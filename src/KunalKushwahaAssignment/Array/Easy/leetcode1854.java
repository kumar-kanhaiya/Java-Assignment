package KunalKushwahaAssignment.Array.Easy;

public class leetcode1854 {
    public static void main(String[] args) {
        int[][] array = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(array,target));


    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        if(helper(mat,target)){
            return true;
        }
        int i = 1;
        while (i < 4) {
            int[][] ans = new int[mat.length][mat[0].length];
            for (int row = 0; row < mat.length; row++) {
                for (int collumns = 0; collumns < mat[row].length; collumns++) {
                    ans[row][collumns] = mat[mat.length -collumns- 1][row];
                }
            }
            // checking
            mat = ans;
            if(helper(mat,target)){
                return true;
            }
        }
        return false;
    }
    public static boolean helper(int[][] ans , int[][] target ){

        for (int j = 0; j < target.length ; j++) {
            for (int k = 0; k <target[j].length ; k++) {
                if(ans[j][k] !=target[j][k]){
                    return false;
                }
            }
        }
        return true;
    }
}
