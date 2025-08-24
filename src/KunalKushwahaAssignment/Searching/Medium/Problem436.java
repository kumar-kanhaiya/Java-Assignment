package KunalKushwahaAssignment.Searching.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem436 {
    public static void main(String[] args) {
        int[][] array = { {3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(array)));

    }
    // this question is done with the help of binary search and sorting
    public static int[] findRightInterval(int[][] intervals) {
//        int start = intervals.length;
//        int end = intervals[0].length;

        int first = 0 ;
        int index = 0;
        int[] ans = new int[intervals.length];
        while(first <= intervals.length - 1) {
            for (int i = 0; i < intervals.length; i++) {

                if(i == first){
                    continue;
                }

                if (intervals[i][0] >= intervals[first][1]) {
                    ans[index] = i;
                    index++;
                }
                if(!(intervals[i][0] >= intervals[first][1])){
                    ans[index] = -1;
                    index++;
                }
            }
            first++;
        }


        return ans;
    }

}
