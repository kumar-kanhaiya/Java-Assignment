package KunalKushwahaAssignment.Searching.Medium;

import java.util.*;

public class Problem436 {
    public static void main(String[] args) {
        int[][] array = { {3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(array)));

    }
    // this question is done with the help of binary search and sorting
    public static int[] findRightInterval(int[][] intervals) {
        int start = 0;
        int end = intervals.length;
        int[][] pairs = new int[end][2];
        for (int i = 0; i < end; i++) {
            pairs[i][0] = intervals[i][0];
            pairs[i][1] = i;
        }
        int[] ans = new int[intervals.length];
        int index = 0;
        while(start < end){
            ans[start] = binarySearch(list , intervals[start][1]);
        }
        return ans;
    }

    public static int binarySearch(int[][] pairs , int target){
        int start = 0;
        int end = pairs.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(pairs[mid][0] >= target){
                // ans found
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return ans;
    }

}
