package KunalKushwahaAssignment.Array.Medium;

public class Problem59 {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(3);
        // Done with 100% Beats
        for (int i = 0; i <ans.length ; i++) {
            for (int j = 0; j < ans.length ; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
    public static int[][] generateMatrix(int n) {
        int sRow = 0;
        int sColl = 0;
        int eRow = n-1;
        int eColl = n-1;
        int i = 1;
        int[][] ans = new int[n][n];
        while(sRow <= eRow && sColl <= eColl){
            // for top case
            for (int j = sColl; j <=eColl ; j++) {
                ans[sRow][j] = i++;;

            }

            // for top to bottom
            for (int j = sRow + 1; j <= eRow ; j++) {
                ans[j][eColl] =i++;;
            }

            // for right to left
            for (int j = eColl - 1; j >= sColl ; j--) {
                if(sRow == eRow){
                    break;
                }
                ans[eRow][j] = i++;;
            }

            // for bottom to up
            for (int j = eRow- 1 ; j >= sRow + 1 ; j--) {
                if(sColl == eColl){
                    break;
                }
                ans[j][sColl] = i++;;
            }

            sRow++;
            sColl++;
            eRow--;
            eColl--;
        }
        return ans;
    }
}
