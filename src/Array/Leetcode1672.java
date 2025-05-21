package Array;

public class Leetcode1672 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{1,0,2}};
        System.out.println(maximumWealth(array));

    }
    public static int maximumWealth(int[][] array ){
        int max = 0 ;
        for (int row = 0; row < array.length ; row++) {
            int count = 0;
            for (int i = 0; i <array[row].length ; i++) {
                count += array[row][i];
            }
            if(count> max){
                max = count;
            }
        }
        return max;
    }
}

