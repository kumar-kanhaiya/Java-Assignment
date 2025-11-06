package KunalKushwahaAssignment.Others;

public class Problem2257 {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        int[][] guards = {{0,0},{1,1},{2,3}};
        int[][] walls = {{0,1},{2,2},{1,4}};
        System.out.println(countUnguarded(m,n,guards,walls));

    }

    public  static int countUnguarded(int m, int n,
                                      int[][] guards, int[][] walls) {
        int[][] check = new int[m][n];

        // let guards be denoted as 1 and the walls are denoted by 2
        int firstIndex = 0;
        int secondIndex = 0;


        while(secondIndex != walls.length){
            check[walls[secondIndex][0]][guards[secondIndex][1]] = 2;
            secondIndex++;
        }

        while(firstIndex != guards.length){
            check[guards[firstIndex][0]][guards[firstIndex][1]] = 1;
            int p = guards[firstIndex][0];
            int q = guards[firstIndex][1];
            // iterate this
            // left case
            while(true){
//                int p = guards[firstIndex][0];
//                int q = guards[firstIndex][1];
                if(guards[p][q] == 2 || q == 0){
                    break;
                }
                check[p][q--] = 1;
            }
            //right
            q = guards[firstIndex][1];
            while(true){
                if(guards[p][q] == 2 || p == n){
                    break;
                }
                check[p++][q] = 1;

            }
            p = guards[firstIndex][0];
            //top
            while(true){
                if(guards[p][q] == 2 || p == 0){
                    break;
                }
                check[p--][q] = 1;

            }
            //bottom
            p = guards[firstIndex][0];
            while(true){
                if(guards[p][q] == 2 || p == m){
                    break;
                }
                check[p++][q] = 1;

            }
            firstIndex++;
        }

        // now shift the row guards in all direction
        int count = 0 ;
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[0].length ; j++) {
                if(check[i][j] == 0){
                    count++;
                }
            }
        }
        return count;

    }
}
