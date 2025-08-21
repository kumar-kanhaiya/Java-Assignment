package KunalKushwahaAssignment.Searching.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem436 {
    public static void main(String[] args) {
        int[][] array = { {1,2},{2,3},{0,1}};
        System.out.println(Arrays.toString(findRightInterval(array)));

    }
    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        Queue list = new LinkedList();
        for(int i = 0 ; i < intervals.length ; i++){
            int check = i+1;

            if(check == intervals.length ){
                check = 0;
            }
            int fi = intervals[i][1];
            for (int j = 0; j < intervals.length ; j++) {
                if(intervals[check][j] >= fi ){
                    list.add(intervals[i][0]);
                }
                else{
                    list.add(-1);
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (int) list.remove();
        }
        return ans;

    }

    public static boolean isGreater(int[][] array , int target , int start ){
        if(array[start][0] >= target){
            return true;
        }
        return false;
    }
}
