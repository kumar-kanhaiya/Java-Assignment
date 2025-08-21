package KunalKushwahaAssignment.Searching.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class Problem436 {
    public static void main(String[] args) {

    }
    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        Queue list = new LinkedList();
        for(int i = 0 ; i < intervals.length ; i++){
            for (int j = i+1; j < intervals[i].length ; j++) {
                if(j == intervals.length ){
                    i = 0;
                }
                else if(isGreater(intervals[i][j] , ))
            }
        }

    }

    public static boolean isGreater(int[][] array , int target , int start ){
        if(array[start][0] >= target){
            return true;
        }
        return false;
    }
}
