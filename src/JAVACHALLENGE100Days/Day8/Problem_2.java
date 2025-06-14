package JAVACHALLENGE100Days.Day8;

public class Problem_2 {
    public static void main(String[] args) {
        int[][] array = {{1,9,3},{4,5,6}};
        sout

    }
    public static int largestElement(int[][] array ){
        int max = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
