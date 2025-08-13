package KunalKushwahaAssignment.Searching.Easy;

public class problem1351 {
    public static void main(String[] args) {
        int[][] array = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(array));

    }
    public static int countNegatives(int[][] array) {
        int count = 0;
        int srow = 0;
        int scoll = 0;
        int erow = array.length - 1;
        int ecoll = array[0].length - 1;
        while(srow<= erow && scoll <= ecoll){
            // chacking in call
            for (int i = scoll; i <=ecoll ; i++) {
                if(array[srow][i] < 0){
                    count += 1;
                }
            }
            // checking in row
            for (int i = srow + 1; i <= erow; i++) {
                if(array[i][scoll] < 0){
                    count += 1;
                }
            }
            srow++;
            scoll++;

        }
        return count;
    }
}
