package KunalKushwahaAssignment.Searching.Medium;

import java.util.*;

public class Problem436 {
    public static void main(String[] args) {
        int[][] array = { {3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(array)));

    }
    // this question is done with the help of binary search and sorting
    public static int[] findRightInterval(int[][] intervals) {


    }

    public static int binarySearch(ArrayList<Integer> list , int target){
        int start = 0;
        int end = list.size();
        Collections.sort(list);
        while(start <= end){
            int mid = start + (end - start)/2;
            if(list.get(mid) >= target){
                // ans found
                return mid;
            }
            else{
                start = mid + 1;
            }

        }
        return -1;
    }

}
